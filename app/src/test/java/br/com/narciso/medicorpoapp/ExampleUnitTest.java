package br.com.narciso.medicorpoapp;

import org.junit.Test;

import br.com.narciso.medicorpoapp.model.Avaliacao;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void imc_isCorrect() {
        Avaliacao ava = new Avaliacao();
        ava.setPeso(68.0);
        ava.setAltura(1.76);

        double imc = ava.getIMC();
        assertEquals(22, imc, 1);
    }
}