/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Ignacio González
 */
public class PaisService {
    
    HashSet<Pais> ListaPaises  ;

    public PaisService() {
        this.ListaPaises = new HashSet();
    }
    public void AgregarPaises(){
        Scanner read  =new Scanner(System.in);
        String op = null ;
        do {
            
         System.out.println("Desea agregar un pais a la lista  : (si/no)" );
         op = read.next();
            if (op.equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nombre del pais que dese agregar a la lista  :");
                String nom = read.next();
                Pais pais = new Pais(nom);
                ListaPaises.add(pais);
                System.out.println("Pais agregado con exito !");
            }
        } while (!op.equalsIgnoreCase("no"));
        MostrarConjunto();
    }
    public void MostrarConjunto(){
        for(Pais pais : ListaPaises){
            System.out.println(pais);
        }
    }
    public void OrdenarAlfabeticamente(){
        System.out.println("Paises ordenados alfabeticamente \t\t\t");
        ArrayList<Pais> PaisesLista = new ArrayList(ListaPaises);
        PaisesLista.sort(Alfabeticamente);
        for(Pais pais : PaisesLista){
            System.out.println(pais);
        }
    }
    public static Comparator<Pais> Alfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    public void EliminarPais(String nombre){
        Iterator<Pais> it = ListaPaises.iterator();
        int cont = 0 ; 
        while(it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                break;
            }
            cont++;
        }
        MostrarConjunto();
        if (cont != ListaPaises.size()-1) {
            System.out.println("No se encontro el pais ingresado en la lista");
        }
    }
}
