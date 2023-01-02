package org.example;

public class Main {
    public static void main(String[] args) {

        // crear un objeto

        // Crear un objeto con el contructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // Crear un objeto con el contructor con parametros

        Vehiculo Fordfocus = new Vehiculo("Ford","Focus",2.1,2010,true);
        System.out.println(Fordfocus.getFabricante());
        System.out.println(Fordfocus.getModeloVehiculo());
        Fordfocus.setFabricante("Mazda");
        System.out.println(Fordfocus.getFabricante());
        System.out.println(Fordfocus.Velocidad);
        Fordfocus.acelerar(50);
        System.out.println(Fordfocus.Velocidad);


    }
}