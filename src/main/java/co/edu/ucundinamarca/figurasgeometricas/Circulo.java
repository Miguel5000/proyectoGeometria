/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 * Clase encargada de hacer cálculos referentes a los círculos
 * @author Miguel Ángel Manrique Téllez
 * @since 1.0.0
 * @version 1.0.0
 */
public class Circulo extends FiguraGeometrica{
    
    /**
     * Es el radio del círculo
     */
    private float radio;

    /**
     * Constructor que inicializa el círculo
     * @param radio variable que posee la longitud del radio del círculo
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * Retorna el área del círculo
     * @return area
     */
    @Override
    public float calcularArea() {
        return (float)(Math.PI*Math.pow(this.radio, 2));
    }
    /**
     * Retorna el perímetro del círculo
     * @return perimetro
     */
    @Override
    public float calcularPerimetro() {
        return (float)(2*Math.PI*this.radio);
    }
    /**
     * Retorna los datos que se le pasaron al círculo al momento de su creación
     * @return informacionDeEntrada
     */
    @Override
    public String mostrarInformacionDeEntrada() {
        return "Este círculo tiene un radio de " + this.radio + " de longitud";
    }

    /**
     * Retorna el radio del círculo
     * @return radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Establece la longitud del radio del círculo
     * @param radio variable que posee el radio del círculo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    
}
