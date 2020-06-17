package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pagamento);
    }

    public void FazerPagamento(View view){
        Intent intent4 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent4);
    }
}
