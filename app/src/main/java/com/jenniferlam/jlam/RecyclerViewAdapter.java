package com.jenniferlam.jlam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by jennifer on 4/26/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    String[][] places;
    Context context;
    View view;
    ViewHolder viewHolder;
    TextView cityView;
    TextView stateView;

    public RecyclerViewAdapter(Context context1, String[][] places1){
        places = places1;
        context = context1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
       public TextView cityView;
       public TextView stateView;
       public ViewHolder(View v){
           super(v);
           cityView = (TextView)v.findViewById(R.id.city_name);
           stateView = (TextView)v.findViewById(R.id.state_name);
       }
   }

   @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
       View item = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
       ViewHolder vh = new ViewHolder(item);
       return vh;
   }

   @Override
    public void onBindViewHolder(ViewHolder holder, int position){
       holder.cityView.setText(places[position][0]);
       holder.stateView.setText(places[position][1]);
   }

   @Override
    public int getItemCount(){
       return places.length;
   }

}
