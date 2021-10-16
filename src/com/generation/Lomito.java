package com.generation;

public class Lomito {
    //definicion de caractersiticas

    String nombre;
    String raza;
    int edad;
    String tamanio;

    //definicion de metodos
    public void caracteristicas(){
        System.out.println("Hola mi nombre es "+this.nombre +
                ", soy de raza "+this.raza+", tengo "+this.edad+
                " años, soy de tamaño "+this.tamanio);
    }
    public void comer (){
        System.out.println("Estoy comiendo");
    }
    public void dormir (){
        System.out.println("zzzzzzzz");

    }
    public void jugar(){
        System.out.println("Estoy jugando");
    }

}
