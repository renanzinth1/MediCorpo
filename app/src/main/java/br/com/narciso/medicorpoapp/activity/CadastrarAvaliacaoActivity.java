package br.com.narciso.medicorpoapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

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

                Avaliacao ava = helper.pegaAvaliacao();
                AvaliacaoDAO dao = new AvaliacaoDAO(this);

                dao.insere(ava);
                Toast.makeText(CadastrarAvaliacaoActivity.this, "Avaliação cadastrada com sucesso!", Toast.LENGTH_SHORT).show();
                dao.close();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
