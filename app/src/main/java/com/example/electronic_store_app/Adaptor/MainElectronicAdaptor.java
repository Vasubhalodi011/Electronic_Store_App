package com.example.electronic_store_app.Adaptor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.electronic_store_app.ElectActivity;
import com.example.electronic_store_app.ModelClass.Model;
import com.example.electronic_store_app.R;

public class MainElectronicAdaptor extends RecyclerView.Adapter<MainElectronicAdaptor.ElViewHolder> {

    Context context;

    Integer[] image;

    String[] name;

    String[] price;


    public MainElectronicAdaptor(Context context,Integer[] image,String[] name,String[] price){

        this.context = context;
        this.image = image;
        this.name = name;
        this.price = price;

    }


    @NonNull
    @Override
    public ElViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.productlist,parent,false);

        return new ElViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ElViewHolder holder, int position) {

        holder.product_img.setImageResource(image[position]);
        holder.product_name.setText(name[position]);
        holder.product_price.setText(price[position]);
        holder.crdview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ElectActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    class ElViewHolder extends RecyclerView.ViewHolder{

        ImageView product_img;

        TextView product_name,product_price;

        CardView crdview;

        public ElViewHolder(@NonNull View itemView) {
            super(itemView);

            product_img = itemView.findViewById(R.id.product_img);
            product_name = itemView.findViewById(R.id.product_name);
            product_price = itemView.findViewById(R.id.product_price);
            crdview = itemView.findViewById(R.id.crdview);
        }
    }
}
