package org.example.Herencia;

import org.example.Motor;
import org.example.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {

    }

    public Motocicleta(String modeloVehiculo, String fabricante, Double cc, Integer ano, boolean sport, double velocidad, Motor motor, boolean baul) {
        super(modeloVehiculo, fabricante, cc, ano, sport, velocidad, motor);
        this.baul = baul;
    }
}
