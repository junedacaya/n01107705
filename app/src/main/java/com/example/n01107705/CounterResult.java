package com.example.n01107705;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class CounterResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
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
        getResult();

    }
    public void getResult()
    {
        // TODO: Step 9. Get the data and display here. Finished
        Bundle extras = getIntent().getExtras();
        if (extras == null) { return; } // get data via the key
        String value1 = extras.getString("current_count");
        if (value1 != null) { // do something with the data
            TextView result =  findViewById(R.id.tv_result);
            result.setText("Current count is " + value1);

        }
    }

}
