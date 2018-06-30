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
        ava.setPescoco(campoPescoco.getAlpha());
        ava.setOmbro(campoOmbro.getAlpha());
        ava.setPeito(campoPeito.getAlpha());
        ava.setAbdomen(campoAbdomen.getAlpha());
        ava.setBracoEsq(campoBracoEsq.getAlpha());
        ava.setBracoDir(campoBracoDir.getAlpha());
        ava.setAnteBracoEsq(campoAnteBracoEsq.getAlpha());
        ava.setAnteBracoDir(campoAnteBracoDir.getAlpha());
        ava.setCintura(campoCintura.getAlpha());
        ava.setGluteos(campoGluteos.getAlpha());
        ava.setCoxaEsq(campoCoxaEsq.getAlpha());
        ava.setCoxaDir(campoCoxaDir.getAlpha());
        ava.setPanturrilhaEsq(campoPanturrilhaEsq.getAlpha());
        ava.setPanturrilhaDir(campoPanturrilhaDir.getAlpha());
        ava.setAltura(campoAltura.getAlpha());
        ava.setPeso(campoPeso.getAlpha());
        ava.setObservacoes(campoObservacoes.getText().toString());

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
}
