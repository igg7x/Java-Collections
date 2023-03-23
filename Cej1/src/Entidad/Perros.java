/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ignacio González
 */
public class Perros {
    
    String raza,nombre ; 
 
    
    public Perros(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public Perros() {
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perros{" + "Nombre=" + raza + ", Raza=" + nombre + '}';
    }
    
}
