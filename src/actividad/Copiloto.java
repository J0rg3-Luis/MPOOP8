/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un Copiloto
 * @author alumno
 */

public class Copiloto extends Persona {
    private String colorDeCabello;
    private int numParadas;
    private boolean mayorDeEdad;

    /**
     * Constructor vacío
     */
    
    public Copiloto() {
    }
    
    /**
     * Constructor que recibe colorDeCabello, numParadas, mayorDeEdad, mascota, altura, lentes, nombre y edad
     * @param colorDeCabello El color del cabello del copiloto
     * @param numParadas El número de paradas que ha hecho el copiloto
     * @param mayorDeEdad El booleano si es o no mayor de edad el copiloto
     * @param mascota La mascota que tiene el copiloto
     * @param altura La altura del copiloto
     * @param lentes El booleano si usa o no lentes el copiloto
     * @param nombre El nombre del copiloto
     * @param edad La edad del copiloto
     */
    
    public Copiloto(String colorDeCabello, int numParadas, boolean mayorDeEdad, Mascota mascota, float altura, boolean lentes, String nombre, int edad) {
        super(mascota, altura, lentes, nombre, edad);
        this.colorDeCabello = colorDeCabello;
        this.numParadas = numParadas;
        this.mayorDeEdad = mayorDeEdad;
    }

    public String getColorDeCabello() {
        return colorDeCabello;
    }

    public void setColorDeCabello(String colorDeCabello) {
        this.colorDeCabello = colorDeCabello;
    }

    public int getNumParadas() {
        return numParadas;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    public boolean isMayorDeEdad() {
        return mayorDeEdad;
    }

    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
    }
    
    /**
     * Método que indica que está poniendo música el copiloto
     */
    
    public void ponerMusica(){
        System.out.println("Estoy poniendo música");
    }
    
    /**
     * Método que indica que está viendo el mapa el copiloto
     */
    
    public void verMapa(){
        System.out.println("Estoy viendo el mapa");
    }
    
    /**
     * Método que indica que está dando indicaciones el copiloto
     */
    
    public void darIndicaciones(){
        System.out.println("Dar vuelta aquí");
    } 
    
    /**
     * Método que imprime el colorDeCabello, numParadas, mayorDeEdad de un copiloto 
     * @return El colorDeCabello, el valor del numParadas y el booleano de mayorDeEdad de un copiloto 
     */
    
    @Override
    public String toString() {
        return super.toString() + "Copiloto{" + "colorDeCabello=" + colorDeCabello + ", numParadas=" + numParadas + ", mayorDeEdad=" + mayorDeEdad + '}';
    }  
}
