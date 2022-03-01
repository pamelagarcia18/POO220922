/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.libros;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class TareaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hoy hablaremos de libros");
        Eltraidor Et1 = new Eltraidor();
        Et1.setTitulo("El Traidor");
        System.out.println("Titulo: " + Et1.getTitulo());
        Et1.setAutor("Anabel Hernandez");
        System.out.println("Autor: " + Et1.getAutor());
        Et1.setPaginas(240);
        System.out.println("Paginas: " + Et1.getPaginas());
        Et1.setEditorial("Grijalbo");
        System.out.println("Editorial: " + Et1.getEditorial());
        Et1.setColor(Color.yellow);
        System.out.println("Color: " + Et1.getColor());
        
        Et1.abrirEltraidor();
        Et1.pasarEltraidor();
        
        
    }
       
    
}
