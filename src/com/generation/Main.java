package com.generation;

public class Main {

    public static void main(String[] args) {
	// Se define al objeto
        //cada objeto es indpependiento, cada objeto es responsable por si porpia infi
        //tipo de dato: objeto tipo lomito - nombre
        //no se peuden agregar caracteristicas desde el objeto, solo desde la clase
        Lomito doggo1 = new Lomito();
        doggo1.nombre = "Nicolas";
        doggo1.edad = 3;
        doggo1.raza = "schnauzer";
        doggo1.tamanio = "wrande";
        doggo1.caracteristicas();
        doggo1.comer();

        Lomito doggo2 = new Lomito();
        doggo2.nombre = "Spikey";
        doggo2.edad = 1;
        doggo2.raza = "Poodle";
        doggo2.tamanio = "pequeñito";
        doggo2.caracteristicas();
        doggo2.dormir();

        Lomito doggo3 = new Lomito("Willis"); //intellij detecta que el parametro es el nombre
        //se peuden tener varias maneras de crear un mismo objeto
        doggo3.caracteristicas();
        System.out.println(doggo3.nombre);

        Lomito doggo4= new Lomito("Canelita","Corgi",4, "mega");
        doggo4.caracteristicas();
    }
}
