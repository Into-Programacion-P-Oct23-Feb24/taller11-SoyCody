/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String[] ciudades = crearArreglo();
        imprimirCadenas(ciudades);
    }
    
    public static String[] crearArreglo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de ciudades que vaya a ingresar: ");
        int n = entrada.nextInt();
        String[] ciudades = new String[n];
        entrada.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la ciudad " + (i + 1) + ": ");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static void imprimirCadenas(String[] arreglo) {
        System.out.println("Ciudades con 4 o 5 caracteres:");
        for (String ciudad : arreglo) {
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                System.out.println(ciudad);
            }
        }
    }

    
}
