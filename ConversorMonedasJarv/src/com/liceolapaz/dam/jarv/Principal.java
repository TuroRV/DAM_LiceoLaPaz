package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int init = 0;
        do {
        double dolares = 0;
        double libras = 0;
        double yenes = 0;
        double cambioDolares = 0.86;
        double cambioLibras = 1.19;
        double cambioYenes = 0.0075;
        menu();
        int opcion = leerOpcion();
        switch(opcion) {
            case 1:
                System.out.println("Introduzca el valor de dólares que desea convertir:");
                dolares = leerDolares();
                double resultado = convertirDolares(dolares,cambioDolares);
                System.out.println(dolares + " dólares equivalen a " + resultado + " euros");
                break;
            case 2:
                System.out.println("Introduzca el valor de libras que desea convertir:");
                libras = leerLibras();
                double resultado2 = convertirLibras(libras,cambioLibras);
                System.out.println(libras + " libras equivalen a " + resultado2 + " euros");
                break;
            case 3:
                System.out.println("Introduzca el valor de yenes que desea convertir:");
                yenes = leerYenes();
                double resultado3 = convertirYenes(yenes,cambioYenes);
                System.out.println(yenes + " yenes equivalen a " + resultado3 + " euros");
                break;
            case 0:
                System.out.println("Hasta pronto");
                init = 1;
                break;
            default:
                System.out.println("Escoja una opción válida");
        }

    }while (init == 0);}

    private static double convertirYenes(double yenes, double cambioYenes) {
        double resultado = yenes * cambioYenes;
        return resultado;
    }

    private static double convertirLibras(double libras, double cambioLibras) {
        double resultado = libras*cambioLibras;
        return resultado;
    }

    private static double convertirDolares(double dolares, double cambioDolares) {
        double resultado = dolares * cambioDolares;
        return resultado;
    }


    private static double leerYenes() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerLibras() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerDolares() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void menu() {
        System.out.println("CONVERSOR DE MONEDAS\n" +
                "1. Dólares\n" +
                "2. Libras\n" +
                "3. Yens\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
