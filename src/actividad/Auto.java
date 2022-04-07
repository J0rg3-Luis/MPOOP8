/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un Auto
 * @author alumno
 */
public class Auto {
    private Piloto piloto;
    private Copiloto copiloto;
    private Perro perro;
    private Gato gato;

    /**
     * Constructor vacio
     */
    
    public Auto() {
    }
    
    /**
     * Constructor que recibe piloto, copiloto, perro y gato 
     * @param piloto folioLicencia, añoDeRegristro, horasManejando, mascota, altura, lentes, nombre y edad del piloto
     * @param copiloto colorDeCabello, numParadas, mayorDeEdad, mascota, altura, lentes, nombre y edad del copiloto
     * @param perro colaCortada, orejasCortadas, pedigri, raza, color, peso, nombre y edad del perro
     * @param gato garrasCortadas, esterilizado, cazador, raza, color, peso, nombre y edad del gato
     */
    
    public Auto(Piloto piloto, Copiloto copiloto, Perro perro, Gato gato) {
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.perro = perro;
        this.gato = gato;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Copiloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Copiloto copiloto) {
        this.copiloto = copiloto;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }
    
    /**
     * Método que imprime el piloto, copiloto, perro y gato de un auto
     * @return El piloto, copiloto, perro y gato del auto
     */
    
    @Override
    public String toString() {
        return "Auto{" + " El piloto está en el asiento delantero izquierdo " + piloto + "\n El copiloto está en el asiento delantero derecho " + copiloto + " \n El perro está en la caja transportadora 1 " + perro + " \n El gato está en la caja transportadora 2 " + gato + '}';
    }  
}
