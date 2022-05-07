/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.Herencia;

/**
 *
 * @author usuario
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista, Artista {
    private String carrera;
    private String numeroCuenta;
    private String disciplinaDeportiva;
    private String ganeroArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String disciplinaDeportiva, String ganeroArtistico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.ganeroArtistico = ganeroArtistico;
    }

    public String getGaneroArtistico() {
        return ganeroArtistico;
    }

    public void setGaneroArtistico(String ganeroArtistico) {
        this.ganeroArtistico = ganeroArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    @Override
    public void entrenar() {
        System.out.println( this.nombre + "Esta entrenando " + this.disciplinaDeportiva );
                
    }

    @Override
    public void jugar() {
        System.out.println( this.nombre + "Esta jugando " + this.disciplinaDeportiva);
    }

    @Override
    public void ensañar() {
        System.out.println(this.nombre + "Esta ensayando/practicando" + this.ganeroArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + "Esta presentando su obra de " + this.ganeroArtistico);
    }
    
    
}
