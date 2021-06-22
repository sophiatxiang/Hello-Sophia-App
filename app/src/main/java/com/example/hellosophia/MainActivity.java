package com.example.hellosophia;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.purple_200));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.pink));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Sophia!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color back to original black
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                //reset background color back to teal_700
               findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.teal_700));

                //reset text back to "Hello from Sophia!"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Sophia!");
            }
        });

    }
}