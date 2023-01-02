package org.example;

public class Motor {

    //parametros

    String modeloMotor;
    int caballos;
    double parNm;
    int numCilindros;

    // constructor

    public Motor() {
    }

    public Motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modeloMotor = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

    //metodos

    public String getModeloMotor() {
        return modeloMotor;
    }

    public void setModeloMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public double getParNm() {
        return parNm;
    }

    public void setParNm(double parNm) {
        this.parNm = parNm;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }
}
