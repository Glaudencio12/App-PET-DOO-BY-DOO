package com.example.petshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tela_principalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.telaPrincipal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void cadastroAnimal(View v){
        Intent tela_cadastro_animal = new Intent(this, cadastro_animalActivity.class);
        startActivity(tela_cadastro_animal);
    }

    public void servicos(View v){
        Intent tela_servicos = new Intent(this, tela_servicosActivity.class);
        startActivity(tela_servicos);
    }

    public void agendamentos(View v){
        Intent tela_agendamentos = new Intent(this, visualizar_agendamentosActivity.class);
        startActivity(tela_agendamentos);
    }
}