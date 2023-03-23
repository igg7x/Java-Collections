/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class PerrosService {
    
    
    
    public Perros CrearPerro(){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el nombre de su perro : ");
        String Nombre = read.nextLine();
        System.out.print("Ingrese su raza : ");
        String Raza = read.nextLine();
        Perros perro = new Perros (Nombre,Raza);
        return perro ; 
    }
    public void AgregarPerros(ArrayList<Perros>listaperro){
        Scanner read = new Scanner(System.in);
        String respuesta ;
        do {
            System.out.println("Desea agregar un perro al registro : ? (si/no)");
            respuesta = read.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
            listaperro.add(CrearPerro());    
            }
        } while(!respuesta.equalsIgnoreCase("no"));
        MostrarRegistro(listaperro);   
    }
    public void MostrarRegistro(ArrayList<Perros>listaperro){
        for (Perros perro : listaperro) {
            System.out.println(perro);
        }
    }
    public void QuitarPerro(ArrayList<Perros>listaperro){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el nombre del perro que desea quitar del registro : ");
        String nombre = read.nextLine();
        int C = 0 ;
        Iterator<Perros> It = listaperro.iterator();
        while(It.hasNext()){
            if (It.next().getRaza().equals(nombre)){
                It.remove();
                break;
            }else{
               C++;
            }
        }
        if (C == listaperro.size()-1){
            System.out.println("El perro no se encontro en el registro");
        }
         listaperro.sort(Comparar);
         for (Perros perro : listaperro){
            System.out.println(perro);
            }
    }
    public static Comparator<Perros> Comparar = new Comparator<Perros>(){
        @Override
        public int compare(Perros p1, Perros p2){
            return p2.getNombre().compareTo(p1.getNombre());
        }
    };
}
