package com.generation;

public class Lomito {
    //definicion de caractersiticas

    String nombre;
    String raza;
    int edad;
    String tamanio;
    //constructor sirve para inicializar un objeto (sus valores), se peude tener mas de un constructor
    //si no se pone ninguna java lo pondra por default
    //no hay que poner 2 constructores con solo un parametro del mismo tipo, por ejemplo string ya que habra conlfictos
    public Lomito(){

    }
    //para diferenciar a los constructores se les puede poner distintos parametros
    public Lomito(String nombre){
        this.nombre = nombre; //indica que el atributo nombre del objeto es igual al parametro enviado llamado nombre

    }
    public Lomito(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;

    }
    //constructor donde se le asignen todos los datos:
    public Lomito(String nombre, String raza, int edad, String tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

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
