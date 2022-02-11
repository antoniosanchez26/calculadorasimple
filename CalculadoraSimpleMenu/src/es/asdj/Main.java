package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0, suma = 0, resta = 0, opcion;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("MENÚ");
            System.out.println("============================");
            System.out.println("1.- Sumar.");
            System.out.println("2.- Restar.");
            System.out.println("0.- Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Numero 1: ");
                numero1 = entrada.nextInt();
                System.out.print("Numero 2: ");
                numero2 = entrada.nextInt();
                suma = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + suma);
            } else if (opcion == 2) {
                System.out.print("Numero 1: ");
                numero1 = entrada.nextInt();
                System.out.print("Numero 2: ");
                numero2 = entrada.nextInt();
                resta = (numero1 - numero2);
                System.out.println(numero1 + " - " + numero2 + " = " + resta);
            } else if (opcion != 0){
                System.out.println();
                System.out.println("ERROR , da una opcion válida");
            }
            entrada.nextLine();

            System.out.print("Pulsa INTRO para continuar...");
            entrada.nextLine();
            System.out.println();
        } while (opcion != 0);
        System.out.println("Apagando calculadora...");
    }
}