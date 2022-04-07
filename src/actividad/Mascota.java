/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye una Mascota
 * @author alumno
 */
public class Mascota extends SerVivo{
    private String raza,color;
    private float peso;

    /**
     * Constructor vacío
     */
    
    public Mascota() {
    }
    
    /**
     * Constructor que recibe raza, color, peso, nombre y edad  
     * @param raza La raza de la mascota
     * @param color El color del pelaje de la mascota
     * @param peso Los kilos que pesa la mascota
     * @param nombre El nombre de la mascota
     * @param edad La edad de la mascota
     */
    
    public Mascota(String raza, String color, float peso, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
        this.color = color;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    /**
     * Método que indica que está jugando la mascota
     */
    
    public void jugar(){
        System.out.println("Estoy jugando");
    }
    
    /**
     * Método que indica que está saltando la mascota
     */
    
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    
    /**
     * Método que indica que está corriendo la mascota
     */
    
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    
    /**
     * Método que imprime la raza, color y peso de una mascota 
     * @return La raza, color y el valor del peso de una mascota
     */
    
    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "raza=" + raza + ", color=" + color + ", peso=" + peso + '}';
    }
}
