/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un Perro
 * @author alumno
 */
public class Perro extends Mascota{
    private boolean colaCortada, orejasCortadas, pedigri;

    /**
     * Constructor vacío
     */
    
    public Perro() {
    }
    
    /**
     * Constructor que recibe colaCortada, orejasCortadas, pedigri, raza, color, peso, nombre y edad 
     * @param colaCortada El booleano si tiene o no cola cortada el perro
     * @param orejasCortadas El booleano si tiene o no orejas cortadas el perro
     * @param pedigri El booleano si tiene o no pedigrí el perro
     * @param raza La raza del perro 
     * @param color El color del pelaje del perro
     * @param peso Los kilos que pesa el perro
     * @param nombre El nombre del perro
     * @param edad La edad del perro
     */
    
    public Perro(boolean colaCortada, boolean orejasCortadas, boolean pedigri, String raza, String color, float peso, String nombre, int edad) {
        super(raza, color, peso, nombre, edad);
        this.colaCortada = colaCortada;
        this.orejasCortadas = orejasCortadas;
        this.pedigri = pedigri;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    public boolean isOrejasCortadas() {
        return orejasCortadas;
    }

    public void setOrejasCortadas(boolean orejasCortadas) {
        this.orejasCortadas = orejasCortadas;
    }

    public boolean isPedigri() {
        return pedigri;
    }

    public void setPedigri(boolean pedigri) {
        this.pedigri = pedigri;
    }
    
    /**
     * Método que indica que está correteando el perro
     */
    
    public void corretear(){
        System.out.println("Estoy correteando");
    }
    
    /**
     * Método que indica que está trayendo un palo el perro
     */
    
    public void traerPalo(){
        System.out.println("Voy por el palo");
    }
    
    /**
     * Método que indica que está marcando su territorio el perro
     */
    
    public void marcarTerritorio(){
        System.out.println("Este territorio es mio");
    }
    
    /**
     * Método que imprime colaCortada, orejasCortadas y pedigrí de un perro
     * @return El booleano de colaCortada, orejasCortadas y pedigri de un perro
     */
    
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + ", orejasCortadas=" + orejasCortadas + ", pedigri=" + pedigri + '}';
    }
}
