package com.example.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Foodadapter extends RecyclerView.Adapter<Foodadapter.Viewholder> {
    private Context mcontext;
    private ArrayList<ModelFood> mlist;
    Foodadapter(Context context, ArrayList<ModelFood> list){
        mcontext=context;
        mlist=list;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
        View view=layoutInflater.inflate(R.layout.rv_food_items,parent,false);
        Viewholder viewholder;
        viewholder = new Viewholder(view);
        return viewholder;

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        ModelFood fooditem=mlist.get(position);
        final ImageView image=holder.item_image;
        TextView name,place,price;
         name=holder.item_name;
         place=holder.item_place;
         price=holder.item_price;
         image.setImageResource(mlist.get(position).getImage());
         name.setText(fooditem.getName());
        place.setText(fooditem.getPlace());
        price.setText(fooditem.getPrice());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView item_image;
        TextView item_name,item_place;
        TextView item_price;
        public Viewholder(View itemview){
            super(itemview);
            item_image=itemview.findViewById(R.id.item_image);
            item_name=itemview.findViewById(R.id.item_name);
            item_place=itemview.findViewById(R.id.item_place);
            item_price=itemview.findViewById(R.id.item_price);

        }

    }
}
