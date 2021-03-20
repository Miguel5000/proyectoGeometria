/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.proyectogeometria;

import co.edu.ucundinamarca.figurasgeometricas.Circulo;
import co.edu.ucundinamarca.figurasgeometricas.Cuadrado;
import co.edu.ucundinamarca.figurasgeometricas.FiguraGeometrica;
import co.edu.ucundinamarca.figurasgeometricas.Informacion;
import co.edu.ucundinamarca.figurasgeometricas.Triangulo;
import java.util.Scanner;

/**
 * Clase encargada de iniciar la aplicación
 * @author Miguel Ángel Manrique Téllez
 * @since 1.0.0
 * @version 1.0.0
 */
public class Principal {
    /**
     * Constructor que ejecuta las instrucciones iniciales de la aplicación
     */
    public Principal() {
        
        iniciar();
        
    }
    
    /**
     * Método que posee la lógica principal de la aplicación
     */
    private void iniciar(){
        
        Scanner lector = new Scanner(System.in);
        String respuesta = "";
        
        do{
            
            System.out.println("Digite la opción de la figura que desea calcular:");
            System.out.println("1) Cuadrado");
            System.out.println("2) Triángulo");
            System.out.println("3) Círculo");
            
            FiguraGeometrica figura = null;
            
            int opcion = lector.nextByte();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Digite la longitud de uno de los lados del cuadrado");
                    figura = new Cuadrado(lector.nextFloat());
                    break;
                    
                case 2:
                    
                    System.out.println("Digite la longitud de los 3 lados del triángulo");
                    figura = new Triangulo(lector.nextFloat(), lector.nextFloat(), lector.nextFloat());
                    break;
                    
                case 3:
                    
                    System.out.println("Digite el radio del círculo");
                    figura = new Circulo(lector.nextFloat());
                    break;
                    
                default:
                    
                    System.out.println("Opción no válida");
                
            }
            
            if(figura != null){
            
                System.out.println("El área de la figura es " + figura.calcularArea());
                System.out.println("El perímetro de la figura es " + figura.calcularPerimetro() + "\n");

                Informacion informacion = figura;

                System.out.println("Información de entrada de la figura:");
                System.out.println(informacion.mostrarInformacionDeEntrada() + "\n");
            
            }
                
            System.out.println("¿Desea hacer los cálculos para otra figura? (S/N)");
            lector.nextLine();
            respuesta = lector.nextLine();
            
        }while(respuesta.equalsIgnoreCase("S"));
        
    }
    /**
     * Método de entrada de la aplicación
     * @param args variable que recibe las variables de inicio de la aplicación para conectarla con operaciones del S.O como por ejemplo al abrir un archivo con esta aplicación
     */
    public static void main(String[] args) {
     
        new Principal();
        
    }
    
}
