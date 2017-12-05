package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Func3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_func3);
    }
}
