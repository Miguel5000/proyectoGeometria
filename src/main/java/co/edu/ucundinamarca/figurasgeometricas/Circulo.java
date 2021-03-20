/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 *
 * @author Miguel
 */
public class Circulo extends FiguraGeometrica{
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float)(Math.PI*Math.pow(this.radio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float)(2*Math.PI*this.radio);
    }

    @Override
    public String mostrarInformacionDeEntrada() {
        return "Este círculo tiene un radio de " + this.radio + " de longitud";
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    
}
