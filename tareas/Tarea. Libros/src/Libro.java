/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Libro {
    public class libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String editorial;
    
    public libro() {
       
    }
    

    public libro (String titulo, String autor, int paginas,String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
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
    
    }
}
    

