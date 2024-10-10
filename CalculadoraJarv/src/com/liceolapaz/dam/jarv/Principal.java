package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int init = 0;
        do {
        menu();
        int opcion = leerOpcion();
        double operando1 = 0;
        double operando2 = 0;
        double resultado = 0;
        switch (opcion) {
            case 1:
            operando1 = pedirOperando1();
            operando2 = pedirOperando2();
            resultado = operando1 + operando2;
                System.out.println("El resultado es: " + resultado);
            break;
            case 2: operando1 = pedirOperando1();
            operando2 = pedirOperando2();
            resultado = operando1 - operando2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3: operando1 = pedirOperando1();
            operando2 = pedirOperando2();
            resultado = operando1 * operando2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4: operando1 = pedirOperando1();
            operando2 = pedirOperando2();
            if (operando2 == 0){
                System.out.println("El divisor no puede ser 0");
            }
            resultado = operando1 / operando2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 0:
                System.out.println("Hasta la vista");
                init = 1;
                break;
                default:
                    System.out.println("Introduzca una opción valida");
        }
    }while (init == 0);}

    private static double pedirOperando2() {
        System.out.println("Introduzca el segundo operando");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double pedirOperando1() {
        System.out.println("Introduzca el primer operando");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("CALCULADORA\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Producto\n" +
                "4. División\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
