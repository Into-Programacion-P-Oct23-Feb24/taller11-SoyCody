/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double n1;
        double n2;
        double n3;
        double n4;
        String cadena = "";
        String calificacion;
        System.out.println("Ingrese la nota 1");
        n1= entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        n2= entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        n3= entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        n4= entrada.nextDouble();
        calificacion = obtenerPromedio(n1, n2, n3, n4);
        cadena = "El promedio de las notas: " + n1 + ", " + n2 + ", " + n3 + 
                ", " + n4 + " es " + calificacion;
        System.out.println(cadena);
    }
    public static String obtenerPromedio(double n1, double n2, double n3, 
            double n4){
        double promedio;
        String calificacion;
        promedio = (n1 + n2 + n3 + n4)/4;
        if (promedio > 8){
             calificacion = "Sobresaliente";
        } else if (promedio > 5){
            calificacion = "Muy bueno";
        } else {
            calificacion = "Regular";
        }
        return calificacion;
    }
    
}
