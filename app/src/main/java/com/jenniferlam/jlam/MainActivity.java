package com.jenniferlam.jlam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    GridView grid;
    RecyclerView recyclerView;
    Context context;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    String[] name={"Recyler View","two","three","four"};
    String[][] places = {
            {"New York", "New York"},
            {"Los Angeles", "California"},
            {"Chicago", "Illinois"},
            {"Houston", "Texas"},
            {"Philadelphia", "Pennsylvania"},
            {"Phoenix", "Arizona"},
            {"San Antonio", "Texas"},
            {"San Diego", "California"},
            {"Dallas", "Texas"},
            {"San Jose", "California"},
            {"Austin", "Texas"},
            {"Jacksonville", "Florida"},
            {"San Francisco", "California"},
            {"Indianapolis", "Indiana"},
            {"Columbus", "Ohio"},
            {"Fort Worth", "Texas"},
            {"Charlotte", "North Carolina"},
            {"Seattle", "Washington"},
            {"Denver", "Colorado"},
            {"El Paso", "Texas"},
            {"Detroit", "Michigan"},
            {"Washington", "District of Columbia"},
            {"Boston", "Massachusetts"},
            {"Memphis", "Tennessee"},
            {"Nashville", "Tennessee"},
            {"Portland", "Oregon"},
            {"Oklahoma City", "Oklahoma"},
            {"Las Vegas", "Nevada"},
            {"Baltimore", "Maryland"},
            {"Louisville", "Kentucky"},
            {"Milwaukee", "Wisconsin"},
            {"Albuquerque", "New Mexico"},
            {"Tucson", "Arizona"},
            {"Fresno", "California"},
            {"Sacramento", "California"},
            {"Kansas City", "Missouri"},
            {"Long Beach", "California"},
            {"Mesa", "Arizona"},
            {"Atlanta", "Georgia"},
            {"Colorado Springs", "Colorado"},
            {"Virginia Beach", "Virginia"},
            {"Raleigh", "North Carolina"},
            {"Omaha", "Nebraska"},
            {"Miami", "Florida"},
            {"Oakland", "California"},
            {"Minneapolis", "Minnesota"},
            {"Tulsa", "Oklahoma"},
            {"Wichita", "Kansas"},
            {"New Orleans", "Louisiana"},
            {"Arlington", "Texas"}
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        Log.d("My filter", "onCreate() method called");

        Button btnEnter = (Button)findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                recyclerView = (RecyclerView) findViewById(R.id.recycleview1);
                recyclerViewLayoutManager = new LinearLayoutManager(MainActivity.this);
                recyclerView.setLayoutManager(recyclerViewLayoutManager);
                recyclerViewAdapter = new RecyclerViewAdapter(context, places);
                recyclerView.setAdapter(recyclerViewAdapter);
            }
        });

        GridViewAdapter adapter = new GridViewAdapter(MainActivity.this,name);
        grid=(GridView)findViewById(R.id.activity_main_gridView);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id){
                Toast.makeText(MainActivity.this, "You clicked at " +name[+ position], Toast.LENGTH_SHORT).show();
            if(name[position].equals("Recyler View")){
                Intent intent2 = new Intent(MainActivity.this, RecyclerViewAdapter.class);
                startActivity(intent2);
            }

            }
        });



    }
}





