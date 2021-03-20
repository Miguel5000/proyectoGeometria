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
public class Cuadrado extends FiguraGeometrica{

    private float longitudLado;

    public Cuadrado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    
    @Override
    public float calcularArea() {
        return this.getLongitudLado()*this.getLongitudLado();
    }

    @Override
    public float calcularPerimetro() {
        return this.getLongitudLado()*4;
    }

    @Override
    public String mostrarInformacionDeEntrada() {
        return "Este cuadrado tiene 4 lados de longitud " + this.mostrarInformacionDeEntrada();
    }

    /**
     * @return the longitudLado
     */
    public float getLongitudLado() {
        return longitudLado;
    }

    /**
     * @param longitudLado the longitudLado to set
     */
    public void setLongitudLado(float longitudLado) {
        this.longitudLado = longitudLado;
    }
    
    
    
}
