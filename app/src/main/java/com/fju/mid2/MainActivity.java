package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

    }

    public void w1(View view){
        Intent intent=new Intent(this,Func1Activity.class);
        startActivity(intent);
    }
    public void w2(View view){
        Intent intent=new Intent(this,Func2Activity.class);
        startActivity(intent);
    }
    public void w3(View view){
        Intent intent=new Intent(this,Func3Activity.class);
        startActivity(intent);
    }
    public void w4(View view){
        Intent intent=new Intent(this,Func4Activity.class);
        startActivity(intent);
    }
    public void w5(View view){
        Intent intent=new Intent(this,Func5Activity.class);
        startActivity(intent);
    }
    public void w6(View view){
        Intent intent=new Intent(this,Func6Activity.class);
        startActivity(intent);
    }
    public void w7(View view){
        Intent intent=new Intent(this,Func7Activity.class);
        startActivity(intent);
    }
    public void w8(View view){
        Intent intent=new Intent(this,Func8Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}

