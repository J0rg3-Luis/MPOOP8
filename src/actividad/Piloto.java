/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un Piloto
 * @author alumno
 */

public class Piloto extends Persona{
    private int folioLicencia, añoDeRegistro, horasManejando;

    /**
     * Constructor vacío
     */
    
    public Piloto() {
    }
    
    /**
     * Constructor que recibe folioLicencia, añoDeRegristro, horasManejando, mascota, altura, lentes, nombre y edad
     * @param folioLicencia El folio de licencia del piloto
     * @param añoDeRegistro El año de registro de la licencia del piloto
     * @param horasManejando Las horas manejando que lleva el piloto
     * @param mascota La mascota que tiene el piloto
     * @param altura La altura del piloto
     * @param lentes El booleano si usa o no lentes el piloto
     * @param nombre El nombre del piloto
     * @param edad La edad del piloto
     */

    public Piloto(int folioLicencia, int añoDeRegistro, int horasManejando, Mascota mascota, float altura, boolean lentes, String nombre, int edad) {
        super(mascota, altura, lentes, nombre, edad);
        this.folioLicencia = folioLicencia;
        this.añoDeRegistro = añoDeRegistro;
        this.horasManejando = horasManejando;
    }

    public int getFolioLicencia() {
        return folioLicencia;
    }

    public void setFolioLicencia(int folioLicencia) {
        this.folioLicencia = folioLicencia;
    }

    public int getAñoDeRegistro() {
        return añoDeRegistro;
    }

    public void setAñoDeRegistro(int añoDeRegistro) {
        this.añoDeRegistro = añoDeRegistro;
    }

    public int getHorasManejando() {
        return horasManejando;
    }

    public void setHorasManejando(int horasManejando) {
        this.horasManejando = horasManejando;
    }
    
    /**
     * Método que indica que está encendiendo el auto el piloto
     */
    
    public void encenderAuto(){
        System.out.println("Estoy prendiendo el auto");
    }
    
    /**
     * Método que indica que está cambiando la velocidad del auto el piloto
     */
    
    public void cambiarVelocidad(){
        System.out.println("Estoy camnbiando de velocidad");
    }
    
    /**
     * Método que indica que está conduciendo el piloto
     */
    
    public void conducir(){
        System.out.println("Estoy conduciendo");
    }
    
    /**
     * Método que imprime el folioLicencia, añoDeRegristro y horasManejando un piloto 
     * @return El número del folioLicencia, el añoDeRegristro y el total de horasManejando de un piloto 
     */
    
    @Override
    public String toString() {
        return super.toString()+"Piloto{" + "folioLicencia=" + folioLicencia + ", añoDeRegistro=" + añoDeRegistro + ", horasManejando=" + horasManejando + '}';
    }
}
