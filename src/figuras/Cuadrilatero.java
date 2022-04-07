/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que realiza el cálculo de perímetro y área de un Cuadrilátero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float a,b;
    private float base, altura;
    
    /**
     * Constructor vacío
     */
    
    public Cuadrilatero() {
    }
    
    /**
     * Método que asigna el valor de la base y altura de un cuadrilátero
     * @param base El valor de la base del cuadrilátero
     * @param altura El valor de la altura del cuadrilátero
     */
    
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método que calcula el valor del perímetro del cuadrilátero
     * @return El valor del perímetro del cuadrilátero
     */
    
    @Override
    public float perimetro(){
        return 2*a+2*b;
    }
    
    /**
     * Método que calcula el valor del área del cuadrilátero
     * @return El valor del área del cuadrilátero
     */
    
    @Override
    public float area(){
        return base*altura;
    }
    
    /**
     * Método que imprime el valor de alfa, beta, a, b, base y altura de un cuadrilátero
     * @return El valor del ángulo alfa, ángulo beta, lado a, lado b, base y altura del cuadrilátero
     */
    
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }  
}
