/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class AlumnoService {
    
    private ArrayList<Alumno>ListaAlumnos ; 

    public AlumnoService() {
        this.ListaAlumnos = new ArrayList();
    }
    
    public void crearAlumno(){
      Scanner read = new Scanner(System.in);
      String op;
        do {
            System.out.println("Desea Ingresar las notas de un alumno : ? (si/no)"); 
             op = read.nextLine();
            if (op.equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nombre del alumno ");
                String Nom = read.nextLine();
                System.out.println("Ingrese la nota numero 1 ");
                int n1 = read.nextInt();
                System.out.println("Ingrese la nota numero 2 ");
                int n2 = read.nextInt();
                System.out.println("Ingrese la nota numero 3 ");
                int n3 = read.nextInt();
                Alumno alumno = new Alumno(Nom,n1,n2,n3);
                alumno.getNotas().add(n1);
                alumno.getNotas().add(n2);
                alumno.getNotas().add(n3);
                ListaAlumnos.add(alumno);
            }
        } while (!op.equalsIgnoreCase("no"));
        
    }
    
    public double NotaFinal(String Nombre){     
      int cont = 0 ;
         for (Alumno alumno : ListaAlumnos) {
            int sumaFinal = 0;
            if (alumno.getNombre().equals(Nombre)) {
                for (int i = 0; i < 3; i++) {
                    sumaFinal += alumno.getNotas().get(i);
                }
                return sumaFinal / 3;
            }else{
                cont++;
            }
        }
         if (cont==ListaAlumnos.size()) {
            return 0;
        }
         return 1 ;
    }
}
