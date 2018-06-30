package br.com.narciso.medicorpoapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import br.com.narciso.medicorpoapp.DAO.AvaliacaoDAO;
import br.com.narciso.medicorpoapp.R;
import br.com.narciso.medicorpoapp.model.Avaliacao;

public class ListarAvaliacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_avaliacao);

        AvaliacaoDAO dao = new AvaliacaoDAO(this);
        List<Avaliacao> avaliacoes = dao.buscaAvaliacoes();

        ListView avaliacoesView = findViewById(R.id.lista_avaliacoes);

        ArrayAdapter<Avaliacao> adapter = new ArrayAdapter<Avaliacao>(this, android.R.layout.simple_list_item_1, avaliacoes);

        avaliacoesView.setAdapter(adapter);

    }
}
