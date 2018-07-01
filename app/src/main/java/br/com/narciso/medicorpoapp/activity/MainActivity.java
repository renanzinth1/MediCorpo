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

        //abreBotao();
    }

    public void callCadastrarAvaliacao(View view) {
        Intent it = new Intent(this, CadastrarAvaliacaoActivity.class);
        startActivity(it);
    }

    public void callListarAvaliacao(View view) {
        Intent it = new Intent(this, ListarAvaliacaoActivity.class);
        startActivity(it);
    }

    public void callListarEvolucao(View view) {
        Intent it = new Intent(this, ListarEvolucaoActivity.class);
        startActivity(it);
    }

//    public void abreBotao(View view){
//
//        switch(view.getId()) {
//            case R.id.botao_cadastrar_avaliacao:
//                Button btnCadastrarAvaliacao = findViewById(R.id.botao_cadastrar_avaliacao);
//                btnCadastrarAvaliacao.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent goToCadastrarAvaliacao = new Intent(MainActivity.this, CadastrarAvaliacaoActivity.class);
//                        startActivity(goToCadastrarAvaliacao);
//                    }
//                });
//        }
//    }
}
