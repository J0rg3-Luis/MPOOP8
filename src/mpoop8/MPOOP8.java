/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop8;

import actividad.Auto;
import actividad.Copiloto;
import actividad.Gato;
import actividad.Perro;
import actividad.Piloto;
import actividad.SerVivo;
import figuras.Cuadrilatero;
import figuras.Poligono;
import figuras.Triangulo;

/**
 *
 * @author alumno
 */
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n------------ Poligono ------------");
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        SerVivo vivo = new SerVivo();
        
        System.out.println("\n------------ Triángulo ------------");
        poligono=new Triangulo();
        System.out.println(poligono);
        System.out.println("\n------------ Cuadrilátero ------------");
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        System.out.println("\n------------ Poligono-Triángulo ------------");
        Object objeto = new Object();
        System.out.println(objeto);
        objeto = new Poligono();
        System.out.println(objeto);
        objeto = new Triangulo();
        System.out.println(objeto);
        
        System.out.println("\n------------ Poligono-Triángulo-Cuadrilátero ------------");
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
        
        //Triangulo t2 = new Poligono(); -->no se puede

    System.out.println("\n------------ Asignación de asientos en el auto ------------\n");
    Perro perro = new Perro(false, false, true, "Pastor aleman", "negro", 10.8f, "Kobe", 1);
    Gato gato = new Gato (false, true, true, "Persa", "negro", 3.6f, "Michi", 2);
    Piloto piloto = new Piloto(1234, 2010, 2, perro, 1.73f, true,"Alfonso",35 );
    Copiloto copiloto = new Copiloto("cafe", 3, true, gato, 1.65f, false, "Paulina", 30);
    
    Auto auto = new Auto(piloto, copiloto, perro, gato);
        System.out.println(auto);
        System.out.println("\n------------ Asignación de asientos en el auto-instanceof ------------\n");
        getSerVivo(new Piloto());
        getSerVivo(new Copiloto());
        getSerVivo(new Gato());
        getSerVivo(new Perro());
        
    }
    
    public static void getPoligono(Poligono pol){
       if(pol instanceof Triangulo){
           System.out.println("El poligono es un triangulo");
       }else if(pol instanceof Cuadrilatero){
           System.out.println("El poligono es un cuadrilatero");   
       }else{
           System.out.println("Es otra figura");
       }
    }
    
    public static void getSerVivo(SerVivo vivo){
        
        Perro perro = new Perro(false, false, true, "Pastor aleman", "negro", 10.8f, "Kobe", 1);
        Gato gato = new Gato (false, true, true, "Persa", "negro", 3.6f, "Michi", 2);
        Piloto piloto = new Piloto(1234, 2010, 2, perro, 1.73f, true,"Alfonso",35 );
        Copiloto copiloto = new Copiloto("cafe", 3, true, gato, 1.65f, false, "Paulina", 30);
       if(vivo instanceof Piloto){
           System.out.println("El piloto está en el asiento delantero izquierdo "+ piloto);
       }else if(vivo instanceof Copiloto){
           System.out.println("El copiloto está en el asiento delantero derecho "+ copiloto);   
       }else if (vivo instanceof Perro) {
           System.out.println("El perro está en la caja transportadora 1 "+ perro);
       }else {
           System.out.println("El gato está en la caja transportadora 2 "+ gato);
       }
    }
    }

