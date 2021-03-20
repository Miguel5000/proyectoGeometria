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
public class Triangulo extends FiguraGeometrica{

    private float lados[];

    public Triangulo(float... lados) {
        this.lados = lados;
    }
    
    @Override
    public float calcularArea() {
        float semiPerimetro = this.calcularPerimetro()/2;
        return (float)(Math.sqrt(semiPerimetro*(semiPerimetro-lados[0])*(semiPerimetro-lados[1])*(semiPerimetro-lados[2])));
    }

    @Override
    public float calcularPerimetro() {
        float suma = 0;
        
        for(float lado: lados)
            suma += lado;
        
        return suma;
    }

    @Override
    public String mostrarInformacionDeEntrada() {
        String informacion = "Este triángulo tiene 3 lados cuyas longitudes son ";
        
        for(float lado:lados)
            informacion += lado + ", ";
        
        informacion = informacion.substring(0, informacion.length()-2);
        
        return informacion;
    }
    
}
