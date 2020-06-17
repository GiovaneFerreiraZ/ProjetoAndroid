package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FazerPedido(View view){
        Intent intent1 = new Intent(getApplicationContext(), TelaAlimento.class);
        startActivity(intent1);
    }
}
