/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 * Clase encargada de establecer la estructura que tendrán todas las figuras geométricas
 * @author Miguel Ángel Manrique Téllez
 * @since 1.0.0
 * @version 1.0.0
 */
public abstract class FiguraGeometrica implements Informacion {
    /**
     * Retorna el área de la figura
     * @return area
     */
    public abstract float calcularArea();
    /**
     * Retorna el perímetro de la figura
     * @return perimetro
     */
    public abstract float calcularPerimetro();
    
}
