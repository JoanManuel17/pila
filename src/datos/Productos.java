/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author joan.penna
 */
public class Productos extends Base {

    
    private String nombreProducto;
    private int cantidadProducto;
    private double valor;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProducto, double valor) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.valor = valor;
    }
    
    

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Get the value of cantidadProducto
     *
     * @return the value of cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Set the value of cantidadProducto
     *
     * @param cantidadProducto new value of cantidadProducto
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    @Override
    public Base copy() {
        
       return new Productos(nombreProducto, cantidadProducto, valor);
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", cantidadProducto=" + cantidadProducto + ", valor=" + valor + '}';
    }
    
}
