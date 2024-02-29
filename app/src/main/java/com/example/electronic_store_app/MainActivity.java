package com.example.electronic_store_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.electronic_store_app.Adaptor.MainElectronicAdaptor;
import com.example.electronic_store_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Integer[] image = {R.drawable.apple,R.drawable.tv,R.drawable.juicer,R.drawable.laptop,R.drawable.microwave,R.drawable.washingmachine,R.drawable.refrigerator,R.drawable.machinegun};

    String[] name = {"i phone 15","Sony","Croma","Macbook","LG","Samsung","IFB","Machine Gun"};

    String[] price = {"1500$","7000$","100$","1900$","700$","750$","800$","10000$"};

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainElectronicAdaptor mainElectronicAdaptor = new MainElectronicAdaptor(this,image,name,price);
        RecyclerView.LayoutManager lm;
        lm = new GridLayoutManager(this,1);
        binding.Recycler1.setAdapter(mainElectronicAdaptor);
        binding.Recycler1.setLayoutManager(lm);


    }
}