package br.com.narciso.medicorpoapp.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Avaliacao implements Serializable {

    private Long id;
    private float pescoco;
    private float ombro;
    private float peito;
    private float abdomen;
    private float bracoEsq;
    private float bracoDir;
    private float anteBracoEsq;
    private float anteBracoDir;
    private float cintura;
    private float gluteos;
    private float coxaEsq;
    private float coxaDir;
    private float panturrilhaEsq;
    private float panturrilhaDir;
    private double altura;
    private double peso;
    private double IMC;
    private String observacoes;
    private String dataHora;

    public Avaliacao() {
    }

    public Avaliacao(Long id, float pescoco, float ombro, float peito, float abdomen, float bracoEsq, float bracoDir, float anteBracoEsq, float anteBracoDir, float cintura, float gluteos, float coxaEsq, float coxaDir, float panturrilhaEsq, float panturrilhaDir, float altura, float peso, String observacoes, String dataHora) {
        this.id = id;
        this.pescoco = pescoco;
        this.ombro = ombro;
        this.peito = peito;
        this.abdomen = abdomen;
        this.bracoEsq = bracoEsq;
        this.bracoDir = bracoDir;
        this.anteBracoEsq = anteBracoEsq;
        this.anteBracoDir = anteBracoDir;
        this.cintura = cintura;
        this.gluteos = gluteos;
        this.coxaEsq = coxaEsq;
        this.coxaDir = coxaDir;
        this.panturrilhaEsq = panturrilhaEsq;
        this.panturrilhaDir = panturrilhaDir;
        this.altura = altura;
        this.peso = peso;
        this.observacoes = observacoes;
        this.dataHora = dataHora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPescoco() {
        return pescoco;
    }

    public void setPescoco(float pescoco) {
        this.pescoco = pescoco;
    }

    public float getOmbro() {
        return ombro;
    }

    public void setOmbro(float ombro) {
        this.ombro = ombro;
    }

    public float getPeito() {
        return peito;
    }

    public void setPeito(float peito) {
        this.peito = peito;
    }

    public float getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(float abdomen) {
        this.abdomen = abdomen;
    }

    public float getBracoEsq() {
        return bracoEsq;
    }

    public void setBracoEsq(float bracoEsq) {
        this.bracoEsq = bracoEsq;
    }

    public float getBracoDir() {
        return bracoDir;
    }

    public void setBracoDir(float bracoDir) {
        this.bracoDir = bracoDir;
    }

    public float getAnteBracoEsq() {
        return anteBracoEsq;
    }

    public void setAnteBracoEsq(float anteBracoEsq) {
        this.anteBracoEsq = anteBracoEsq;
    }

    public float getAnteBracoDir() {
        return anteBracoDir;
    }

    public void setAnteBracoDir(float anteBracoDir) {
        this.anteBracoDir = anteBracoDir;
    }

    public float getCintura() {
        return cintura;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public float getGluteos() {
        return gluteos;
    }

    public void setGluteos(float gluteos) {
        this.gluteos = gluteos;
    }

    public float getCoxaEsq() {
        return coxaEsq;
    }

    public void setCoxaEsq(float coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    public float getCoxaDir() {
        return coxaDir;
    }

    public void setCoxaDir(float coxaDir) {
        this.coxaDir = coxaDir;
    }

    public float getPanturrilhaEsq() {
        return panturrilhaEsq;
    }

    public void setPanturrilhaEsq(float panturrilhaEsq) {
        this.panturrilhaEsq = panturrilhaEsq;
    }

    public float getPanturrilhaDir() {
        return panturrilhaDir;
    }

    public void setPanturrilhaDir(float panturrilhaDir) {
        this.panturrilhaDir = panturrilhaDir;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public void setIMC() {
        this.IMC = getIMC();
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return getId().toString() + " - " + getDataHora();
    }
}
