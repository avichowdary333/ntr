package com.example.aswanth.project3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.btn);

        SharedPreferences prefs=getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor=prefs.edit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                editor.putString("somekey",value);
                editor.apply();
            }
        });

        String ourvalue= prefs.getString("somekey","Welcome");
        editText.setText(ourvalue);
    }

}
