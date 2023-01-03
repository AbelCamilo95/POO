package org.example;

import org.example.Herencia.Camion;
import org.example.Herencia.Coche;
import org.example.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        // crear un objeto

        // Crear un objeto con el contructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // Crear un objeto con el contructor con parametros

        Motor motorGTI = new Motor("gti",190,459.0,8);

        Vehiculo Fordfocus = new Vehiculo("Ford","Focus",2.1,2010,true,0,motorGTI);
        System.out.println(Fordfocus.getFabricante());
        System.out.println(Fordfocus.getModeloVehiculo());
        Fordfocus.setFabricante("Mazda");
        System.out.println(Fordfocus.getFabricante());
        System.out.println(Fordfocus.Velocidad);
        Fordfocus.acelerar(50);
        System.out.println(Fordfocus.Velocidad);
        System.out.println(Fordfocus.getMotor().getModeloMotor());

        Motocicleta ninja = new Motocicleta();
         ninja.fabricante = "";

         // polimorfismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // clases abstractas no se pueden instanciar. solo se instancian las clases hijas

    }
}