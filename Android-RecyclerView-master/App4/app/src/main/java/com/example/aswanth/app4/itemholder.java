package com.example.aswanth.app4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aswanth on 09-12-2015.
 */
public class itemholder extends RecyclerView.ViewHolder {

    TextView textView;

    public itemholder(View itemView) {
        super(itemView);
        textView=(TextView)itemView.findViewById(R.id.txt);
    }
    public void bind(String text)
    {
        textView.setText(text);
    }
}
