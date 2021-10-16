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


    }
}
