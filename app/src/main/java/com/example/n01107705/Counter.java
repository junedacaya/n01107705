package com.example.n01107705;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Counter extends AppCompatActivity {

    Button btcount;
    Button btResult;
    private int mClick_n01107705 = 98;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        btcount = findViewById(R.id.bt_Count);
        btResult = findViewById(R.id.bt_result);

        btcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClick_n01107705++;
                Toast.makeText(Counter.this, "Current count is " + mClick_n01107705, Toast.LENGTH_SHORT).show();

            }
        });

        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendResult();
            }
        });

    }

    public void sendResult(){
        Intent intent2 = new Intent(this, CounterResult.class);
        intent2.putExtra("current_count", String.valueOf(mClick_n01107705));
        startActivity(intent2);
    }


}
