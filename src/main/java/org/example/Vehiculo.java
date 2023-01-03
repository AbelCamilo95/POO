package org.example;
//
//Clase base o Superclase o clase padre
public class Vehiculo {
    // 1. atrubutos
    protected String modeloVehiculo;
    protected String fabricante;
    protected Double cc;
    protected Integer ano;
    protected boolean sport;

    protected double Velocidad;

    protected Motor motor;

    public Vehiculo(String modeloVehiculo, String fabricante, Double cc, Integer ano, boolean sport, double velocidad, Motor motor) {
        this.modeloVehiculo = modeloVehiculo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.ano = ano;
        this.sport = sport;
        Velocidad = velocidad;
        this.motor = motor;
    }

// 2. contructor


    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double velocidad) {
        Velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Vehiculo() {
    }



    // 3. metodos (comportamientos)

    public void acelerar(int quantity){
        if(quantity<120 && quantity>0){
            this.Velocidad += quantity;
        }
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
}
