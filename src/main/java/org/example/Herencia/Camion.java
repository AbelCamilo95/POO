package org.example.Herencia;

import org.example.Motor;
import org.example.Vehiculo;

public class Camion extends Vehiculo {

    double capacidad;

    public Camion() {

    }

    public Camion(String modeloVehiculo, String fabricante, Double cc, Integer ano, boolean sport, double velocidad, Motor motor, double capacidad) {
        super(modeloVehiculo, fabricante, cc, ano, sport, velocidad, motor);
        this.capacidad = capacidad;
    }
}
