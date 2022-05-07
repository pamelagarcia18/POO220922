/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ICO.FES.Aritmetica;
import ICO.FES.Circulo;
import ICO.FES.Cuadrado;
import ICO.FES.Herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<String> nombres =new ArrayList<String >();
       nombres.add("Jesus");
       nombres.add("Mario");
       nombres.add("Alberto");
       nombres.add("Daniel");
       nombres.add("Rafa");
       
        for (String nombre : nombres) {
            System.out.println(nombre);
            
        }
        System.out.println("-------------");
        Scanner teclado = new Scanner(System.in);
        
        int seleccion=0;
        
        
        String elNombre ="";
        try {
            seleccion = teclado.nextInt();
            elNombre = nombres.get(seleccion);
        } catch (InputMismatchException ie) {
                System.out.println("Debes teclear valores numericos ");
                elNombre = nombres.get(0);
        }catch (IndexOutOfBoundsException ioe ){
               System.out.println("Error, debe ser entre 0 y 4 ");
               elNombre = nombres.get(0);
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Generica  ");
            elNombre = nombres.get(0);
            
            
            
        } finally {
            System.out.println( elNombre );
            elNombre=null;
        }
        //System.out.println(nombres.get(seleccion ));//
        
        
        System.out.println("Continua elprograma ...");
        
        Aritmetica cal = new Aritmetica(2, 2);
        System.out.println( cal.getA() + "+" + cal.getB()+ " = " + cal.sumar() );
        System.out.println( cal.getA() + "/" + cal.getB()+ " = " + cal.dividir() );
        try {
            System.out.println( cal.getA() + "/" + cal.getB()+ " = " + cal.dividir() );
        } catch (Exception e) {
            System.out.println("Error de Aritmetica ");
        } 
         
        System.out.println("Fin del programa ");
        System.out.println("------------------Hasta aquí----------");
        
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Area del Cuadrado es: " + cuad.calcularArea());
        System.out.println("Area del circulo es: " + circ.calcularArea());
        
        System.out.println("-----------------------------------------");
        EstudianteDeportistaArtista eda= new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("futbol");
        eda.setGaneroArtistico("fotografia");
        eda.comer();
        eda.ensañar();
        eda.entrenar();
        System.out.println(eda);
    }
    
    
}
