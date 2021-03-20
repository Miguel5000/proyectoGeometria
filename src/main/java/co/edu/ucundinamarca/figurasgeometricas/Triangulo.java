/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 * Clase encargada de hacer cálculos referentes a los triángulos
 * @author Miguel Ángel Manrique Téllez
 * @since 1.0.0
 * @version 1.0.0
 */
public class Triangulo extends FiguraGeometrica{

    /**
     * Posee los 3 lados del triángulo
     */
    private float lados[];

    /**
     * Constructor que inicializa el triángulo
     * @param lados variable que posee los 3 lados del triángulo
     */
    public Triangulo(float... lados) {
        this.lados = lados;
    }
    
    /**
     * Retorna el área del triángulo
     * @return area
     */
    @Override
    public float calcularArea() {
        float semiPerimetro = this.calcularPerimetro()/2;
        return (float)(Math.sqrt(semiPerimetro*(semiPerimetro-getLados()[0])*(semiPerimetro-getLados()[1])*(semiPerimetro-getLados()[2])));
    }

    /**
     * Retorna el perímetro del triángulo
     * @return perimetro
     */
    @Override
    public float calcularPerimetro() {
        float suma = 0;
        
        for(float lado: getLados())
            suma += lado;
        
        return suma;
    }

    /**
     * Retorna los datos que se le pasaron al triángulo al momento de su creación
     * @return informacionDeEntrada
     */
    @Override
    public String mostrarInformacionDeEntrada() {
        String informacion = "Este triángulo tiene 3 lados cuyas longitudes son ";
        
        for(float lado:getLados())
            informacion += lado + ", ";
        
        informacion = informacion.substring(0, informacion.length()-2);
        
        return informacion;
    }

    /**
     * Retorna los lados del triángulo
     * @return lados
     */
    public float[] getLados() {
        return lados;
    }

    /**
     * Establece los lados al triángulo
     * @param lados variable que posee los lados del triángulo
     */
    public void setLados(float[] lados) {
        this.lados = lados;
    }
    
    
}
