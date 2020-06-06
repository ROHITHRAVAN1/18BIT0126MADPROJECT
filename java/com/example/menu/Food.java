package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;


import java.util.ArrayList;

public class Food extends AppCompatActivity {
     RecyclerView recyclerView;
     ArrayList<ModelFood> foodList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        recyclerView=findViewById(R.id.recycler);

        foodList=new ArrayList<>();
        foodList.add(new ModelFood(R.drawable.pasta,"Pasta","Eastern Europe","5$"));
        foodList.add(new ModelFood(R.drawable.deserts,"Deserts","Roman","12$"));
        foodList.add(new ModelFood(R.drawable.icecream,"Icecream","Europe","30$"));
        foodList.add(new ModelFood(R.drawable.strawberries,"Strawberries","Chinese","11$"));
        foodList.add(new ModelFood(R.drawable.vegburger,"VegBurger","Indian","50$"));
        foodList.add(new ModelFood(R.drawable.vegetablesalad,"Vegsalad","US","40$"));
        foodList.add(new ModelFood(R.drawable.chickenburger,"Chicken Burger","Great Britian","40$"));
        foodList.add(new ModelFood(R.drawable.frenchtoast,"Pasta","Eastern Europe","50$"));
        LinearLayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvlayoutmanager=layoutManager;
        recyclerView.setLayoutManager(rvlayoutmanager);
        Foodadapter adapter=new Foodadapter(this,foodList);
        recyclerView.setAdapter(adapter);



    }
}
