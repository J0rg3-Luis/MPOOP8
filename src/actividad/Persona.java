/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye una Persona
 * @author alumno
 */

public class Persona extends SerVivo{
    private Mascota mascota;
    private float altura;
    private boolean lentes;
    
    /**
     * Constructor vacío
     */
    
    public Persona() {
    }
    
    /**
     * Constructor que recibe mascota, altura, lentes, nombre y edad 
     * @param mascota La mascota que tiene la persona
     * @param altura La altura de la persona
     * @param lentes El booleano si usa o no lentes la persona
     * @param nombre El nombre de la persona
     * @param edad La edad de la persona
     */
    
    public Persona(Mascota mascota, float altura, boolean lentes, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
        this.altura = altura;
        this.lentes = lentes;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isLentes() {
        return lentes;
    }

    public void setLentes(boolean lentes) {
        this.lentes = lentes;
    }
    
    /**
     * Método que indica que está comiendo la persona
     */
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    /**
     * Método que indica que está durmiendo la persona
     */
    
    public void dormir(){
        System.out.println("ZZzzzzZZzzZzzzz");
    }
    
    /**
     * Método que indica que está bebiendo la persona
     */
    
    public void beber(){
        System.out.println("Estoy bebiendo");
    }
    
    /**
     * Método que imprime la mascota, altura y lentes de una persona 
     * @return La mascota, el valor de la altura y el booleano de lentes de una persona 
     */

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + ", altura=" + altura + ", lentes=" + lentes + '}';
    }
}
