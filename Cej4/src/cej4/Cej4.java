/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cej4;

import Servicio.PeliculaService;

/**
 *
 * @author Ignacio González
 */
public class Cej4 {

    /** 
     * 
     *    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
            tendremos una clase Pelicula con el título, director y duración de la película (en horas).
            Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
            que se pide a continuación:
            En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
            todos sus datos y guardándolos en el objeto Pelicula.
            Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
            crear otra Pelicula o no.
            Después de ese bucle realizaremos las siguientes acciones:
            • Mostrar en pantalla todas las películas.
            • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
            • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
            pantalla.
            • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
            pantalla.
            • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
            • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaService Ps = new PeliculaService();
        Ps.AgregarPelis();
        Ps.MostrarPelis();
        Ps.Pelismayorhora();
        Ps.OrdenTiempoAscendente();
        Ps.OrdenTiempoDescendente();
        Ps.OrdenTitulo();
        Ps.OrdenDirector();
    }
    
}
