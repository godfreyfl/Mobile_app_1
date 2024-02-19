package com.example.puchkovaekaterinaalekseevna;

import static com.example.puchkovaekaterinaalekseevna.MainActivity.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String str = bundle.getString(KEY);
            TextView textView = new TextView(this);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(40);
            textView.setText(str);
            setContentView(textView);
        }

    }
}