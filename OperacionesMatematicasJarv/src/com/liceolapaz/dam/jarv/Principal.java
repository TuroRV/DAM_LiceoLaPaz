package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int init = 0;
        double operando;
        double base;
        double resultado;
        int exponente;
        do {
            menu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la base:");
                    base = leerBase();
                    System.out.println("Introduzca el exponente");
                    exponente = leerExponente();
                    resultado = Math.pow(base, exponente);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Introduzca el operando:");
                    operando = leerOperando();
                    resultado = Math.sqrt(operando);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.println("Aplicación cerrada");
                    init = 1;
                    break;
                default:
                    System.out.println("Introduzca una opción válida");
            }
        } while (init == 0);
    }

    private static double leerOperando() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int leerExponente() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static double leerBase() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void menu() {
        System.out.println("POTENCIAS Y RAICES CUADRADAS\n" +
                "1. Potencia\n" +
                "2. Raíz cuadrada\n" +
                "3. Salir\n" +
                "Escoja una opción:");
    }
}
