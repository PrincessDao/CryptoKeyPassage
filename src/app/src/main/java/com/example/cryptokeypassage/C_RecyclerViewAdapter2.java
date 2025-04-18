package com.example.cryptokeypassage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

class C_RecyclerViewAdapter2 extends RecyclerView.Adapter<C_RecyclerViewAdapter2.MyViewHolder> {

    Context context;
    ArrayList<HistoryModel> HistoryModels;
    public C_RecyclerViewAdapter2(Context context, ArrayList<HistoryModel> HistoryModels) {
        this.context = context;
        this.HistoryModels = HistoryModels;
    }

    @NonNull
    @Override
    public C_RecyclerViewAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row2, parent, false);
        return new C_RecyclerViewAdapter2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull C_RecyclerViewAdapter2.MyViewHolder holder, int position) {
        holder.imageAction.setImageResource(HistoryModels.get(position).getImageAction());
        holder.timeDate.setText(HistoryModels.get(position).getTimeDate());
        holder.timeHMS.setText(HistoryModels.get(position).getTimeHMS());
        holder.textAction.setText(HistoryModels.get(position).getTextAction());

    }

    @Override
    public int getItemCount() {
        return HistoryModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageAction;
        TextView timeDate;
        TextView timeHMS;

        TextView textAction;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageAction = itemView.findViewById(R.id.imageView3);
            timeDate = itemView.findViewById(R.id.textView8);
            timeHMS = itemView.findViewById(R.id.textView6);
            textAction = itemView.findViewById(R.id.textView9);

        }
    }
}
