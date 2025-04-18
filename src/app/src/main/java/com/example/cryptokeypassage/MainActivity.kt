package com.example.cryptokeypassage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), RecyclerViewInterface{



    var CardsModels = ArrayList<CardsModel>()
    val companyImages = intArrayOf(R.drawable.ic_yandex, R.drawable.ic_vtb, R.drawable.ic_test, R.drawable.ic_vk)
    val cardColors = intArrayOf(Color.parseColor("#363636"), Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"), Color.parseColor("#363636"))
    val companyTextColors = intArrayOf(Color.parseColor("#FFFFFF"), Color.parseColor("#000000"), Color.parseColor("#000000"), Color.parseColor("#FFFFFF"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_cards)
        supportActionBar?.hide()

        val recyclerView: RecyclerView = findViewById(R.id.mRecyclerView)

        val adapter = C_RecyclerViewAdapter(this, CardsModels, this)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        setUpCardsModels()
    }

    fun setUpCardsModels() {
        val companyNames: Array<String> = resources.getStringArray(R.array.cards_company_name_txt)

        for (i in 0 until companyNames.size) {
            CardsModels.add(CardsModel(companyNames[i], companyImages[i], cardColors[i], companyTextColors[i]))
        }
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)

        intent.putExtra("COMPANY_NAME", CardsModels.get(position).getCompanyName());
        intent.putExtra("IMAGE", CardsModels.get(position).getImage());
        intent.putExtra("CARD_COLOR", CardsModels.get(position).getCardColor());
        intent.putExtra("COMPANY_TEXT_COLOR", CardsModels.get(position).getCompanyTextColor());

        startActivity(intent);
    }
}