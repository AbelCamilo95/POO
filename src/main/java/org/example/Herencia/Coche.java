package org.example.Herencia;

// clase derivada o clase hija o subclase

import org.example.Motor;
import org.example.Vehiculo;

public class Coche extends Vehiculo {

    int numPuertas;

    public Coche(){

    }

    public Coche(String modeloVehiculo, String fabricante, Double cc, Integer ano, boolean sport, double velocidad, Motor motor, int numPuertas) {
        super(modeloVehiculo, fabricante, cc, ano, sport, velocidad, motor);
        this.numPuertas = numPuertas;
    }
}
