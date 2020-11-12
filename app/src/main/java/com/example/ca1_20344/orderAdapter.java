package com.example.ca1_20344;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.ViewHolder> {

    List<Model> modelList;
    Context context;

    public orderAdapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String nameOfDrink = modelList.get(position).getTeaName();
        String descriptionOfDrink = modelList.get(position).getTeaDetail();
        int images = modelList.get(position).getTeaPic();

        holder.teaName.setText(nameOfDrink);
        holder.teaDetail.setText(descriptionOfDrink);
        holder.teaPic.setImageResource(images);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView teaName, teaDetail;
        ImageView teaPic;

        public ViewHolder(View itemView) {
            super(itemView);

            teaName = itemView.findViewById(R.id.teaName);
            teaDetail = itemView.findViewById(R.id.description);
            teaPic = itemView.findViewById(R.id.teaPic);
        }
    }

}
