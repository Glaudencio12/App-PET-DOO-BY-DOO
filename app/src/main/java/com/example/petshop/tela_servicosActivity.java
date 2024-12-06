
package com.example.petshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tela_servicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_servicos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.servicos), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void telaDescricaoBanho(View v){
        Intent tela_descricao_banho = new Intent(this, descricao_banhoActivity.class);
        startActivity(tela_descricao_banho);
    }

    public void telaDescricaoConsulta(View v){
        Intent tela_descricao_consulta = new Intent(this, descricao_consultaActivity.class);
        startActivity(tela_descricao_consulta);
    }

    public void telaDescricaoHidratacao(View v){
        Intent tela_descricao_hidratacao = new Intent(this, descricao_hidratacaoActivity.class);
        startActivity(tela_descricao_hidratacao);
    }

    public void telaDescricaoLimpezaCompleta(View v){
        Intent tela_descricao_limpeza_compl = new Intent(this, descricao_limpeza_completaActivity.class);
        startActivity(tela_descricao_limpeza_compl);
    }

    public void telaDescricaotosa(View v){
        Intent tela_descricao_tosa = new Intent(this, descricao_tosaActivity.class);
        startActivity(tela_descricao_tosa);
    }

}