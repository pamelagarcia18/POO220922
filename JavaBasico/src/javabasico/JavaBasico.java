/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class JavaBasico {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int edad = 20;
        System.out.println("edad = " + edad);
        Integer edad2 = new Integer (22);
        System.out.println( edad2 );
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.");
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        Color c1 = Color.BLUE;
        
        altura += 1;
        System.out.println( "Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y =y + 05f;
         System.out.println( "Altura = " + y);
         System.out.println("-------------------------");
        
         Arbol tree1 = new Arbol(2.4f, 15);
         Arbol tree2 = new Arbol(2.4f, 15);
         Arbol tree3 = new Arbol(2.4f, 15);
         Arbol tree4 = new Arbol(2.4f, 15);
         
         System.out.println( tree1 );
         System.out.println("Tronco de un  arbol = " + Arbol.tronco);
         System.out.println("Tronco de un  arbol = " + tree2.tronco);
         System.out.println("Tronco de un  arbol = " + tree3.tronco);
         System.out.println("Tronco de un  arbol = " + tree4.tronco);
         
         JOptionPane.showMessageDialog(null, "Hola Mundo", "aqui va eltitulo", JOptionPane.INFORMATION_MESSAGE);
         String dato = JOptionPane.showInputDialog(null, "DAME TU EDAD ", "INTRODUCIR DATOS ", JOptionPane.QUESTION_MESSAGE);
         System.out.println( dato );
         
  
        
        //codigo sin operador ternario:
        int edad3 = 20;
        //Validar si es mayor de edad
        String resultado = "";
        if(edad3 < 18){
            resultado = "Menor de edad";
        } else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        //Operador ternario:
        // <cond>? <True> : <False>;
        int edad4 = 24;
        String res = "";
        res = edad4 < 18? "Menor de edad edad 4" : "Mayor de edad, tequila";
        System.out.println(res);
        //Cuando tengan una logica asi puede usar ternario
        //Es muy elegante y ahorra lineas de codigo
        
        //Por ultimo la version minima
        int edad5 = 19;
        System.out.println(edad5 < 18? "Menor de edad 5" : "Ya el tequila");
        
        //Ok, siguiente
        int val1 = 1;
        int val2 = 5;
        //Haremos una comparacion or a nivel de bits es decir
        /*
        val1 = 0000...0001;
        val2 = 0000...0010;
        La representacion de arriba es a nivel de bits
        or => or
        and => &
        
        */
        System.out.println(val1 | val2);
        /*
        val1 = 0000...0001;
        or
        val2 = 0000...0010;
        ---------------------------------------
                0000...0011 => 3
        */
        int val3 = 1;
        int val4 = val3 << 2; //el segundo valor es el numero de desplazamientos a la izquierda
        System.out.println(val4);
        
        System.out.println("-------- ARREGLOS --------");
        int[] edades; //primero se declara que sera un arreglo
        //en este punto aun no se reserva memoria
        //el segundo paso es reservarlo, de un tamaño especifico
        edades = new int[5];
        System.out.println(edades);
        //ahora lo usamos como siempre lo han hecho
        edades[0] = 10;
        System.out.println("La primer edad es: " + edades[0]);
        
        //declarar e inicializar en una sola linea
        int [] estaturas = new int[5];
        
        //ahora... al igual que en C C++ puedes asignar valores
        int [] pesos = {86,99,56,76,77}; //en kilos
        //ok este ultimo veremos su contenido
        System.out.println(pesos[0]); //86
        System.out.println(pesos[1]); //99
        System.out.println(pesos[2]); //56
        System.out.println(pesos[3]); //76
        System.out.println(pesos[4]); //77
        //Imprimire lo mismo pero con menos lineas de codigo
        System.out.println("-----------CON FOR---------------------");
        for(int i = 0; i<pesos.length; i++){
            System.out.println(pesos[i]);
        }
        
        //Imprimimos en inversa
        System.out.println("-----------Inversamente----------");
        for(int k = pesos.length-1; k>=0; k--){
            System.out.println(pesos[k]);
        }
        
       System.out.println("----Arreglo de alumnos----");
        Alumno[] lista = new Alumno[5];    //5 alumnos
        lista[0] = new Alumno(319981980, 2, 7.0f);
        lista[1] = new Alumno(319981980, 2, 7.0f);
        lista[2] = new Alumno(319291123, 2, 8.0f);
        lista[3] = new Alumno(367461280, 2, 6.0f);
        lista[4] = new Alumno(367580963, 2, 7.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
            
        }
      
        System.out.println("Con for each...");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }          
         
    }
}

