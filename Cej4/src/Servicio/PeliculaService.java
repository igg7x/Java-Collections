/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class PeliculaService {
    
    ArrayList <Pelicula> Listapelis ;

    public PeliculaService() {
        this.Listapelis = new ArrayList();
    }

   public void AgregarPelis(){
       
       Scanner read  =  new Scanner(System.in);
       String op ;
       do {
       System.out.print("Desea agregar una pelicula ? (si/no)");
       op = read.next();
           if (op.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el TITULO de la pelicula : ");
            String titu = read.next();
            System.out.println("Ingrese el DIRECTOR de la pelicula : ");
            String dire = read.next();
            System.out.println("Ingrese la DURACION de la pelicula : ");
            double tiempo = read.nextDouble();
            Pelicula peli = new Pelicula(titu,dire,tiempo);
            Listapelis.add(peli);
            System.out.println("Pelicula Agrgada con exito");
           }else{
               System.out.println("Ingrese una repuesta valida ");
           }
       } while (!op.equalsIgnoreCase("no"));
   }
   
   public void MostrarPelis(){
       for(Pelicula peli : Listapelis){
           System.out.println(peli);
       }
              System.out.println("\n");

   }
   public void Pelismayorhora(){
     System.out.println("Las peliculas con timpo de duracion superior a 1 hora son : ");
     for(Pelicula peli : Listapelis){
           if (peli.getDuracion()>=1) {
             System.out.println(peli);
         }
       }
            System.out.println("\n");

 }
   public void OrdenTiempoAscendente(){
       System.out.println("Peliculas por tiempo de duracion Asendente\n");
       Listapelis.sort(CompararAscendente);
       for(Pelicula peli : Listapelis){
           System.out.println(peli);
       }
       System.out.println("\n");
   }
   public void OrdenTiempoDescendente(){
       System.out.println("Peliculas por tiempo de duracion Descendente");
       Listapelis.sort(CompararDescendente);
       for(Pelicula peli : Listapelis){
           System.out.println(peli);
       }
              System.out.println("\n");

   }
   public static Comparator<Pelicula> CompararAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
   public static Comparator<Pelicula> CompararDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
   public void OrdenTitulo(){
       System.out.println("Orden por titulos: ");
         Listapelis.sort(CompararTitulo);
         for(Pelicula peli : Listapelis){
           System.out.println(peli);
       }
                System.out.println("\n");

     }
   public static Comparator<Pelicula> CompararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
   public void OrdenDirector(){
       System.out.println("Oreden por director : ");
         Listapelis.sort(CompararDirector);
           for(Pelicula peli : Listapelis){
           System.out.println(peli);
       } 
                  System.out.println("\n");

     }
   public static Comparator<Pelicula> CompararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
