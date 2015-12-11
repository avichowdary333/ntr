package com.example.aswanth.chat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        final SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();
        final String xyzkey="xyz";

        if(prefs.getString(xyzkey,null)=="log")
        {
            Intent intent=new Intent(MainActivity1.this,MainActivity2.class);
            startActivity(intent);
            finish();
        }


        Button btn=(Button) findViewById(R.id.btn);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn) {
                    editor.putString(xyzkey, "log");
                    editor.apply();

                    Intent intent=new Intent(MainActivity1.this,MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        btn.setOnClickListener(listener);
    }
}
