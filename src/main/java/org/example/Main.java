package org.example;

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


    }
}