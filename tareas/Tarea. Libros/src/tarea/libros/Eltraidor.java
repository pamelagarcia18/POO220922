/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.libros;

import java.awt.Color;

/**
 *
 * @author usuario
 */
class Eltraidor {
    private String titulo;
    private String autor;
    private int paginas;
    private String editorial;
    private Color color;

    public Eltraidor() {
    }

    public Eltraidor(String titulo, String autor, int paginas, String editorial, Color color) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void abrirEltraidor(){
        System.out.println("El libro " + this.titulo + " está abierto");
    }
    public void pasarEltraidor(){
        System.out.println("Pasando pagina del libro " + this.titulo);
    }
}

    
    

    
