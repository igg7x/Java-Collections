/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.App;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class AppService {
    
    HashMap<String,Integer>MapaApp ;

    public AppService() {
        this.MapaApp = new HashMap();
    }
    
    public void IngresarProducto(){
        Scanner read = new Scanner(System.in);
        String op =null ;
        do { 
            System.out.println("Desea agregar un articulo al STOCK de la tienda ? (si/no)");
            op =read.next();
            if (op.equalsIgnoreCase("si")) 
            {     
                System.out.println("Ingrese el nombre del producto :");
                String nombre = read.next();
                System.out.println("Ingrese el precio del producto : ");
                int precio = read.nextInt();
                App articulo = new App(nombre,precio);
                MapaApp.put(articulo.getNombre(),precio);
            }
        } while (!op.equalsIgnoreCase("no"));
    }
    
    public void ModificarPrecio(int precio ,String nombre ){
        MapaApp.replace(nombre,precio);
    }
    public void EliminarProducto(String NombreArticulo){
       MapaApp.remove(NombreArticulo);
    }
    
    public void ListarArticulos(){
         for (Map.Entry<String,Integer> item : MapaApp.entrySet())
        {
            System.out.println(item);
        }
    }
    public  void opciones(){
         System.out.println("Tienda-MundoMoviles");
        System.out.println("Opciones : ");
        System.out.println("\t\t Ingresar un articulo al Stock(1)");
        System.out.println("\t\t Listar Stock(2)");
        System.out.println("\t\t Eliminar un articulo al Stock(3)");
        System.out.println("\t\t Actualizar precio de un articulo al Stock(4)");
        System.out.println("\t\t Salir(0)\n\n");
        System.out.print("Ingrese opcion : ");
    }
    public void Menu(){
        Scanner read = new Scanner(System.in);
        int op;
        opciones();
        op = read.nextInt();
        do{
        switch(op){
            case 1 :{
                IngresarProducto();
                break;
            }
            case 2:{
                ListarArticulos();
                break;
            }
            case 3:{
                System.out.println("Ingrese el nombre del producto que desea eliminar :");
                String nombre = read.next();
                EliminarProducto(nombre);
                break;
            }
            case 4 :{
                System.out.println("Ingrese el nombre del producto que desea actualizar :");
                String nombre = read.next();
                System.out.println("Ingrese el nuevo precio que tendra este articulo :");
                int precio = read.nextInt();
                ModificarPrecio(precio,nombre);
            }
            default :{
                System.out.println("Ingrese una opcion valida");
            }
        }
        opciones();
         op = read.nextInt();
        }while(op!=0);
    }
}
