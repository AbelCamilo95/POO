package org.example;

public class Vehiculo {
    // 1. atrubutos
    private String modeloVehiculo;
    private String fabricante;
    private Double cc;
    private Integer ano;
    private boolean sport;

    double Velocidad;

    Motor motor;

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

    public Vehiculo(String modelo, String fabricante, Double cc, Integer ano, boolean sport, double velocidad) {
        this.modeloVehiculo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.ano = ano;
        this.sport = sport;
        this.Velocidad = 0;
    }

    public Vehiculo(String modelo, String fabricante, Double cc, Integer ano, boolean sport) {
        this.modeloVehiculo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.ano = ano;
        this.sport = sport;

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
