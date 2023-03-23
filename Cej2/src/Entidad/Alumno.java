/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Ignacio González
 */
public class Alumno {
    
    String nombre ;
    int nota1,nota2,nota3 ; 
    ArrayList<Integer>notas =  new ArrayList();

    public Alumno() {
    }
    public Alumno(String nombre ,int nota1, int nota2, int nota3) {
        this.nombre = nombre ;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
