package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TelaAlimento extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_alimento);
    }

    public void VoltarTela(View view){
        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent2);
    }

    public void Pagar(View view){
        Intent intent3 = new Intent(getApplicationContext(),TelaPagamento.class);
        startActivity(intent3);
    }


}
