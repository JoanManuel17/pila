/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.OperacionesPila;
import modelo.Pila;

/**
 *
 * @author joan.penna
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila<Productos> pilaP = new Pila<>();
        pilaP.apilar(new Productos("Arroz", 2, 5000));
        pilaP.apilar(new Productos("Lentejas", 3, 7000));
        pilaP.apilar(new Productos("Pollo", 4, 15000));
        pilaP.apilar(new Productos("Atun", 3, 20000));
        pilaP.apilar(new Productos("Tomate", 2, 4000));
        pilaP.apilar(new Productos("Aguate", 1, 5000));

        System.out.println("Pila \n" + pilaP.toString());

        //pilaP.desapilar();
        //System.out.println("Pila \n"+ pilaP.toString());
        Pila<Productos> pd = OperacionesPila.pilaDuplicada(pilaP);
        System.out.println("Pila Duplicada\n" + pd.toString());

        Pila<Productos> pi = OperacionesPila.pilaInvertida(pilaP);
        System.out.println("Pila Invertida\n" + pi.toString());
    }

}
