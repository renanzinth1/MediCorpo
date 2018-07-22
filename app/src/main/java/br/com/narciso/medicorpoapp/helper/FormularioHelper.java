package br.com.narciso.medicorpoapp.helper;

import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.narciso.medicorpoapp.R;
import br.com.narciso.medicorpoapp.activity.CadastrarAvaliacaoActivity;
import br.com.narciso.medicorpoapp.model.Avaliacao;

public class FormularioHelper {

    private final EditText campoPescoco;
    private final EditText campoOmbro;
    private final EditText campoPeito;
    private final EditText campoAbdomen;
    private final EditText campoBracoEsq;
    private final EditText campoBracoDir;
    private final EditText campoAnteBracoEsq;
    private final EditText campoAnteBracoDir;
    private final EditText campoCintura;
    private final EditText campoGluteos;
    private final EditText campoCoxaEsq;
    private final EditText campoCoxaDir;
    private final EditText campoPanturrilhaEsq;
    private final EditText campoPanturrilhaDir;
    private final EditText campoAltura;
    private final EditText campoPeso;
    private final EditText campoObservacoes;
    private Avaliacao ava;

    public FormularioHelper(CadastrarAvaliacaoActivity activity) {
        campoPescoco = activity.findViewById(R.id.formulario_pescoco);
        campoOmbro = activity.findViewById(R.id.formulario_ombro);
        campoPeito = activity.findViewById(R.id.formulario_peito);
        campoAbdomen = activity.findViewById(R.id.formulario_abdomen);
        campoBracoEsq = activity.findViewById(R.id.formulario_bracoEsq);
        campoBracoDir = activity.findViewById(R.id.formulario_bracoDir);
        campoAnteBracoEsq = activity.findViewById(R.id.formulario_antebracoEsq);
        campoAnteBracoDir = activity.findViewById(R.id.formulario_antebracoDir);
        campoCintura = activity.findViewById(R.id.formulario_cintura);
        campoGluteos = activity.findViewById(R.id.formulario_gluteos);
        campoCoxaEsq = activity.findViewById(R.id.formulario_coxaEsq);
        campoCoxaDir = activity.findViewById(R.id.formulario_coxaDir);
        campoPanturrilhaEsq = activity.findViewById(R.id.formulario_panturrilhaEsq);
        campoPanturrilhaDir = activity.findViewById(R.id.formulario_panturrilhaDir);
        campoAltura = activity.findViewById(R.id.formulario_altura);
        campoPeso = activity.findViewById(R.id.formulario_peso);
        campoObservacoes = activity.findViewById(R.id.formulario_observacoes);
        ava = new Avaliacao();
    }


    public Avaliacao pegaAvaliacao() {
        ava.setPescoco(Float.parseFloat(campoPescoco.getText().toString()));
        ava.setOmbro(Float.parseFloat(campoOmbro.getText().toString()));
        ava.setPeito(Float.parseFloat(campoPeito.getText().toString()));
        ava.setAbdomen(Float.parseFloat(campoAbdomen.getText().toString()));
        ava.setBracoEsq(Float.parseFloat(campoBracoEsq.getText().toString()));
        ava.setBracoDir(Float.parseFloat(campoBracoDir.getText().toString()));
        ava.setAnteBracoEsq(Float.parseFloat(campoAnteBracoEsq.getText().toString()));
        ava.setAnteBracoDir(Float.parseFloat(campoAnteBracoDir.getText().toString()));
        ava.setCintura(Float.parseFloat(campoCintura.getText().toString()));
        ava.setGluteos(Float.parseFloat(campoGluteos.getText().toString()));
        ava.setCoxaEsq(Float.parseFloat(campoCoxaEsq.getText().toString()));
        ava.setCoxaDir(Float.parseFloat(campoCoxaDir.getText().toString()));
        ava.setPanturrilhaEsq(Float.parseFloat(campoPanturrilhaEsq.getText().toString()));
        ava.setPanturrilhaDir(Float.parseFloat(campoPanturrilhaDir.getText().toString()));
        ava.setAltura(Float.parseFloat(campoAltura.getText().toString()));
        ava.setPeso(Float.parseFloat(campoPeso.getText().toString()));
        ava.setObservacoes(campoObservacoes.getText().toString());

        /*
        ava.setPescoco(Float.valueOf(campoPescoco.getText().toString()));
        ava.setOmbro(Float.valueOf(campoOmbro.getText().toString()));
        ava.setPeito(Float.valueOf(campoPeito.getText().toString()));
        ava.setAbdomen(Float.valueOf(campoAbdomen.getText().toString()));
        ava.setBracoEsq(Float.valueOf(campoBracoEsq.getText().toString()));
        ava.setBracoDir(Float.valueOf(campoBracoDir.getText().toString()));
        ava.setAnteBracoEsq(Float.valueOf(campoAnteBracoEsq.getText().toString()));
        ava.setAnteBracoDir(Float.valueOf(campoAnteBracoDir.getText().toString()));
        ava.setCintura(Float.valueOf(campoCintura.getText().toString()));
        ava.setGluteos(Float.valueOf(campoGluteos.getText().toString()));
        ava.setCoxaEsq(Float.valueOf(campoCoxaEsq.getText().toString()));
        ava.setCoxaDir(Float.valueOf(campoCoxaDir.getText().toString()));
        ava.setPanturrilhaEsq(Float.valueOf(campoPanturrilhaEsq.getText().toString()));
        ava.setPanturrilhaDir(Float.valueOf(campoPanturrilhaDir.getText().toString()));
        ava.setAltura(Float.valueOf(campoAltura.getText().toString()));
        ava.setPeso(Float.valueOf(campoPeso.getText().toString()));
        ava.setObservacoes(campoObservacoes.getText().toString());
        */

        /*
        LocalDateTime, API utilizada para manipular data no Java 8.
        Não foi utilizada esta API, pois: Call requires API level 26 (current min is 17)

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        */


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

        ava.setDataHora(sdf.format(date));

        return ava;
    }

    public void preencheFormulario(Avaliacao avaliacao) {
        campoPescoco.setText(String.valueOf(avaliacao.getPescoco()));
        campoOmbro.setText(String.valueOf(avaliacao.getOmbro()));
        campoPeito.setText(String.valueOf(avaliacao.getPeito()));
        campoAbdomen.setText(String.valueOf(avaliacao.getAbdomen()));
        campoBracoEsq.setText(String.valueOf(avaliacao.getBracoEsq()));
        campoBracoDir.setText(String.valueOf(avaliacao.getBracoDir()));
        campoAnteBracoEsq.setText(String.valueOf(avaliacao.getAnteBracoEsq()));
        campoAnteBracoDir.setText(String.valueOf(avaliacao.getAnteBracoDir()));
        campoCintura.setText(String.valueOf(avaliacao.getCintura()));
        campoGluteos.setText(String.valueOf(avaliacao.getGluteos()));
        campoCoxaEsq.setText(String.valueOf(avaliacao.getCoxaEsq()));
        campoCoxaDir.setText(String.valueOf(avaliacao.getCoxaDir()));
        campoPanturrilhaEsq.setText(String.valueOf(avaliacao.getPanturrilhaEsq()));
        campoPanturrilhaDir.setText(String.valueOf(avaliacao.getPanturrilhaDir()));
        campoAltura.setText(String.valueOf(avaliacao.getAltura()));
        campoPeso.setText(String.valueOf(avaliacao.getPeso()));
        campoObservacoes.setText(String.valueOf(avaliacao.getObservacoes()));
    }
}
