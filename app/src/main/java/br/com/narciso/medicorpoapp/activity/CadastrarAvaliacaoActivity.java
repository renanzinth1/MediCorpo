package br.com.narciso.medicorpoapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;

import br.com.narciso.medicorpoapp.R;
import br.com.narciso.medicorpoapp.DAO.AvaliacaoDAO;
import br.com.narciso.medicorpoapp.model.Avaliacao;
import br.com.narciso.medicorpoapp.helper.FormularioHelper;

public class CadastrarAvaliacaoActivity extends AppCompatActivity {

    private FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_avaliacao);

        helper = new FormularioHelper(this);
        Intent it = getIntent();
        Avaliacao avaliacao = (Avaliacao) it.getSerializableExtra("avaliacao");

        if (avaliacao != null)
            helper.preencheFormulario(avaliacao);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_formulario_avaliacao, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_formularioAvaliacao_salvar:

                //TODO to com problemas aqui
                Avaliacao avaliacao = helper.pegaAvaliacao();
                AvaliacaoDAO dao = new AvaliacaoDAO(this);

                if (avaliacao.getId() != null) {
                    dao.altera(avaliacao);
                    Toast.makeText(CadastrarAvaliacaoActivity.this, "Avaliação atualizada com sucesso!", Toast.LENGTH_SHORT).show();

                } else {
                    dao.insere(avaliacao);
                    Toast.makeText(CadastrarAvaliacaoActivity.this, "Avaliação cadastrada com sucesso!", Toast.LENGTH_SHORT).show();
                }

                dao.close();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
