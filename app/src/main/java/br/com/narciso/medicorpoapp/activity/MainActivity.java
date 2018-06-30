package br.com.narciso.medicorpoapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.narciso.medicorpoapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCadastrarAvaliacao = findViewById(R.id.botao_activity_cadastrar_avaliacao);
        btnCadastrarAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCadastrarAvaliacao = new Intent(MainActivity.this, CadastrarAvaliacaoActivity.class);
                startActivity(goToCadastrarAvaliacao);
            }
        });

        Button btnListarAvaliacao = findViewById(R.id.botao_activity_listar_avaliacao);
        btnListarAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToListarAvaliacao = new Intent(MainActivity.this, ListarAvaliacaoActivity.class);
                startActivity(goToListarAvaliacao);
            }
        });

        Button btnListarEvolucao = findViewById(R.id.botao_activity_listar_evolucao);
        btnListarEvolucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToListarEvolucao = new Intent(MainActivity.this, ListarEvolucaoActivity.class);
                startActivity(goToListarEvolucao);
            }
        });
        //abreBotao();
    }

    /*public void abreBotao(){


        switch(btn) {
            case R.id.botao_cadastrar_avaliacao:
                Button btnCadastrarAvaliacao = findViewById(R.id.botao_cadastrar_avaliacao);
                btnCadastrarAvaliacao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent goToCadastrarAvaliacao = new Intent(MainActivity.this, CadastrarAvaliacaoActivity.class);
                        startActivity(goToCadastrarAvaliacao);
                    }
                });
        }
    }*/
}
