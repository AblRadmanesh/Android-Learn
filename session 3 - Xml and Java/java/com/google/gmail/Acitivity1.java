package com.google.gmail;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Acitivity1 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        tv=findViewById(R.id.layout1_textView_name);
        tv.setText("Abolfazl Radmanesh");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btn =findViewById(R.id.layout1_button_ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("reza");
            }
        });
    }
}
