package com.example.aswanth.app4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Aswanth on 09-12-2015.
 */
public class listadapter extends RecyclerView.Adapter<itemholder>{
    private ArrayList<String> myItems;
    public listadapter(ArrayList<String> Items)
    {
        myItems=Items;
    }


    @Override
    public itemholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_list,parent,false);
        return new itemholder(itemView);

    }

    @Override
    public void onBindViewHolder(itemholder holder, int position) {
        String text=myItems.get(position);
        holder.bind(text);
    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }
}
