package com.mkyong.rest;

/**
 * Created by user-pc on 6/16/2016.
 */
public class Persona {
    String name;
    int edad;
    public Persona(){
        this.name = "Niko";
        this.edad = 12;
    }
    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
