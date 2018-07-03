package br.com.narciso.medicorpoapp.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import br.com.narciso.medicorpoapp.DAO.AvaliacaoDAO;
import br.com.narciso.medicorpoapp.R;
import br.com.narciso.medicorpoapp.model.Avaliacao;

public class ListarAvaliacaoActivity extends AppCompatActivity {

    private ListView avaliacoesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_avaliacao);

        carregaLista();

        registerForContextMenu(avaliacoesView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuItem remover = menu.add("Remover").setIcon(R.drawable.trash_icon);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        final Avaliacao avaliacao = (Avaliacao) avaliacoesView.getItemAtPosition(info.position);

        remover.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                new AlertDialog
                        .Builder(ListarAvaliacaoActivity.this)
                        .setTitle("Excluir")
                        .setMessage("Deseja excluir a avaliação?\n\nAvaliação: " + avaliacao.getDataHora())
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                AvaliacaoDAO dao = new AvaliacaoDAO(ListarAvaliacaoActivity.this);
                                dao.remover(avaliacao);
                                carregaLista();
                            }
                        })
                        .setNegativeButton("Não", null)
                        .show();


                return false;
            }
        });
    }

    private void carregaLista() {
        AvaliacaoDAO dao = new AvaliacaoDAO(this);
        List<Avaliacao> avaliacoes = dao.buscaAvaliacoes();

        avaliacoesView = findViewById(R.id.lista_avaliacoes);
        ArrayAdapter<Avaliacao> adapter = new ArrayAdapter<Avaliacao>(this, android.R.layout.simple_list_item_1, avaliacoes);
        avaliacoesView.setAdapter(adapter);
    }
}
