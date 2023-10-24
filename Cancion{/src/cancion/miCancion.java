/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cancion;

public class miCancion{

    public static void main(String[] args) {
        CancionSpotify miCancion = new CancionSpotify(1, "The fly", "U2", 4.5, 1991);
        System.out.println("Información de la Canción:");
        System.out.println("ID de la Canción: " + miCancion.getIdCancion());
        System.out.println("Título: " + miCancion.getTitulo());
        System.out.println("Autor: " + miCancion.getAutor());
        System.out.println("Duración: " + miCancion.getDuracion() + " minutos");
        System.out.println("Año de Creación: " + miCancion.getAnoCreacion());
        
        miCancion.setTitulo("The fly");
        miCancion.setDuracion(4.5);
        
        System.out.println("\nInformación de la Canción Actualizada:");
        System.out.println("Título: " + miCancion.getTitulo());
        System.out.println("Duración: " + miCancion.getDuracion() + " minutos");

       
    }
    
}
