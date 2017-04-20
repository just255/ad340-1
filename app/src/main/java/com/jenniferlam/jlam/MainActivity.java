package com.jenniferlam.jlam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("My filter", "onCreate() method called");
        Button btnEnter = (Button)findViewById(R.id.btnEnter);
       btnEnter.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v){
               Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
               startActivity(intent);
           }

       });

    }


}
