/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 * Clase encargada de hacer cálculos referentes a los cuadrados
 * @author Miguel Ángel Manrique Téllez
 * @since 1.0.0
 * @version 1.0.0
 */
public class Cuadrado extends FiguraGeometrica{
    /**
     * Es la longitud de uno de los lados del cuadrado
     */
    private float longitudLado;

    /**
     * Constructor que inicializa el cuadrado
     * @param longitudLado variable que posee la longitud de uno de los lados del cuadrado
     */
    public Cuadrado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    /**
     * Retorna el área del cuadrado
     * @return area
     */
    @Override
    public float calcularArea() {
        return this.getLongitudLado()*this.getLongitudLado();
    }
    /**
     * Retorna el perímetro del cuadrado
     * @return perimetro
     */
    @Override
    public float calcularPerimetro() {
        return this.getLongitudLado()*4;
    }
    /**
     * Retorna los datos que se le pasaron al cuadrado al momento de su creación
     * @return informacionDeEntrada
     */
    @Override
    public String mostrarInformacionDeEntrada() {
        return "Este cuadrado tiene 4 lados de longitud " + this.longitudLado;
    }

    /**
     * Retorna la longitud de cualquier lado del cuadrado
     * @return the longitudLado
     */
    public float getLongitudLado() {
        return longitudLado;
    }

    /**
     * Establece la longitud de los lados del cuadrado
     * @param longitudLado variable que poaee la longitud de uno de los lados del cuadrado
     */
    public void setLongitudLado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    
    
    
}
