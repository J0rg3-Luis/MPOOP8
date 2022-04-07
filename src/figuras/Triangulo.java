/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que realiza el cálculo de perímetro y área de un Triángulo
 * @author alumno
 */
public class Triangulo extends Poligono{
    
    private int alfa, beta, gamma;
    private float a,b,c;
    private float base, altura;

    /**
     * Constructor vacío
     */
    
    public Triangulo() {
    }
    
    /**
     * Método que asigna el valor de la base y altura de un triángulo
     * @param base El valor de la base del triángulo
     * @param altura El valor de la altura del triángulo
     */
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
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
     * @return El valor del perímetro del triángulo
     */
    
    @Override
    public float perimetro(){
        return a+b+c;
    }
    
    /**
     * Método que calcula el valor del área del triángulo
     * @return El valor del área del triángulo
     */
    
    @Override
    public float area(){
        return (base*altura)/2;
    }
    
    /**
     * Método que imprime el valor de alfa, beta, gamma, a, b, c, base y altura de un triángulo
     * @return El valor del ángulo alfa, ángulo beta, ángulo gamma, lado a, lado b, lado c, base y altura del triángulo
     */
    
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }     
}
