package com.example.aswanth.chat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button btn2=(Button) findViewById(R.id.btn2);
        Intent intent=getIntent();
        String user=intent.getStringExtra("name");
        Toast.makeText(this, "hello "+user, Toast.LENGTH_LONG).show();


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn2) {
                    Intent intent= new Intent(MainActivity2.this,MainActivity1.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        btn2.setOnClickListener(listener);
    }

}
