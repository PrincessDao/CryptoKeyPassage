package com.example.cryptokeypassage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ImageView
import android.view.View
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {

    var HistoryModels = ArrayList<HistoryModel>()
    val imageActions = intArrayOf(R.drawable.arrowinput, R.drawable.arrowinput, R.drawable.arrowinput, R.drawable.arrowinput)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val companyName: String? = intent.getStringExtra("COMPANY_NAME")
        val image: Int = intent.getIntExtra("IMAGE", 0)
        val cardColor: Int = intent.getIntExtra("CARD_COLOR", 0)
        val companyTextColor: Int = intent.getIntExtra("COMPANY_TEXT_COLOR", 0)

        val companyNameTextView: TextView = findViewById(R.id.textView5)
        val AA_Image: ImageView = findViewById(R.id.imageView4)
        val AA_CardView: CardView = findViewById(R.id.cardView2)

        companyNameTextView.setText(companyName);
        AA_Image.setImageResource(image);
        AA_CardView.setCardBackgroundColor(cardColor);
        companyNameTextView.setTextColor(companyTextColor);

        val ButtonBack = findViewById<View>(R.id.imageButton)
        ButtonBack.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        val recyclerView2: RecyclerView = findViewById(R.id.mRecyclerView2)

        val adapter2 = C_RecyclerViewAdapter2(this, HistoryModels)

        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = LinearLayoutManager(this)

        setUpHistoryModels()

        val ButtonPass = findViewById<View>(R.id.imageButton2)
        ButtonPass.setOnClickListener {
           // val intent3 = Intent(this, MainActivity3::class.java)
           // startActivity(intent3)

        }
    }

    fun setUpHistoryModels() {
        val timesDate: Array<String> = resources.getStringArray(R.array.time_history_Date_txt)
        val timesHMS: Array<String> = resources.getStringArray(R.array.time_history_HMS_txt)
        val textActions: Array<String> = resources.getStringArray(R.array.time_history_Action_txt)


        for (i in 0 until timesHMS.size) {
            HistoryModels.add(HistoryModel(timesDate[i], timesHMS[i], textActions[i], imageActions[i]))
        }
    }
}