/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un Gato
 * @author alumno
 */

public class Gato extends Mascota{
    private boolean garrasCortadas, esterilizado, cazador ;
    
    /**
     * Constructor vacío
     */
    
    public Gato() {
    }
    
    /**
     * Constructor que recibe garrasCortadas, esterilizado, cazador, raza, color, peso, nombre y edad 
     * @param garrasCortadas El booleano si tiene o no garras cortadas el gato
     * @param esterilizado El booleano si está o no esterilizado el gato
     * @param cazador El booleano si es o no cazador el gato
     * @param raza La raza del gato
     * @param color El color del pelaje del gato
     * @param peso Los kilos que pesa el gato
     * @param nombre El nombre del gato
     * @param edad La edad del gato
     */
    public Gato(boolean garrasCortadas, boolean esterilizado, boolean cazador, String raza, String color, float peso, String nombre, int edad) {
        super(raza, color, peso, nombre, edad);
        this.garrasCortadas = garrasCortadas;
        this.esterilizado = esterilizado;
        this.cazador = cazador;
    }

    public boolean isGarrasCortadas() {
        return garrasCortadas;
    }

    public void setGarrasCortadas(boolean garrasCortadas) {
        this.garrasCortadas = garrasCortadas;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public boolean isCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
    
    /**
     * Método que indica que está rasguñando el gato
     */
    
    public void rasguñar(){
        System.out.println("Estoy rasguñando");
    }
    
    /**
     * Método que indica que está trepando el gato
     */
    
    public void trepar(){
        System.out.println("Estoy trepando");
    }
    
    /**
     * Método que indica que está maullando el gato
     */
    
    public void maullar(){
        System.out.println("Miau Miau");
    }
    
    /**
     * Método que imprime garrasCortadas, esterilizado y cazador de un gato
     * @return El booleano de garrasCortadas, esterilizado y cazador de un gato
     */
    
    @Override
    public String toString() {
        return super.toString()+"Gato{" + "garrasCortadas=" + garrasCortadas + ", esterilizado=" + esterilizado + ", cazador=" + cazador + '}';
    }   
}
