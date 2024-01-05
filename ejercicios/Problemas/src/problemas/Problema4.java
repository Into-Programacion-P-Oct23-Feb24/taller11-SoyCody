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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cedula;
        String nombre;
        int opcion;
        boolean bandera = true;
        String fin;

        System.out.println("Escriba el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de cedula");
        cedula = entrada.nextInt();
        System.out.println("Digite 1 si desea calcular la planilla"
                + " de luz o 2 si desea caluclar el predio del bien "
                + "inmueble");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerPlanilla(nombre, cedula);
        } else if (opcion == 2) {
            obtenerPredio(nombre, cedula);
        }
        System.out.println("Escriba la letra x si desea dejar de ingresar"
                + "datos\n");
        fin = entrada.nextLine();
        if (fin == "x") {
            bandera = false;

        }
    }

    public static void obtenerPlanilla(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorKv;
        double consumoKv;
        double total;
        System.out.println("Ingrese el valor del Kilowatio");
        valorKv = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de su consumo");
        consumoKv = entrada.nextDouble();
        total = valorKv * consumoKv;
        System.out.println("Cliente " + nombre + " con cédula " + cedula
                + " debe cancelar el valor de $" + total);
    }

    public static void obtenerPredio(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double impuesto;
        double valor;
        System.out.println("Ingrese el valor de la compra");
        valor = entrada.nextDouble();
        impuesto = valor * 0.2;
        System.out.println("Cliente " + nombre + " con cédula " + cedula
                + " tiene un bien inmueble valorado en $" + valor
                + "y tiene que pagar de predio $" + impuesto + ".");
    }
}
