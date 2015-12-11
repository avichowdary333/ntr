package com.example.aswanth.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = (Button) findViewById(R.id.btn2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn2) {
                    Intent intent = new Intent(MainActivity2.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        };
        btn2.setOnClickListener(listener);

    }
}
