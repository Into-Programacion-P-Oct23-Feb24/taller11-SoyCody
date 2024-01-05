/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenidos\nDigite 1 para calcular el area"
                + "de un cuadrado, digite 2 para calcular el area de un "
                + "triangulo y 3 para obtener el area de un rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1){
            obtenerCuadrado();
        } else if (opcion == 2) {
            obtenerTriangulo();
        } else if (opcion == 3){
            obtenerRectangulo();
        } else {
            System.out.println("Error");
        }
    }
    public static void obtenerCuadrado(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double area;
        double lado;
        System.out.println("Ingrese el tamaño del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.println("El area es: " + area);
    }
    public static void obtenerTriangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double area;
        double base;
        double altura;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese su altura");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        System.out.println("El area es: " + area);
    }
    public static void obtenerRectangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese su altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("El area es: " + area);
    }
}
