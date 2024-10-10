package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Pedir cantidad de números
        pedirCantidadNumeros();
        //Leer cantidad y guardar en variable
        int cantidadNumeros = leerCantidad();
        //Crear variable para guardar cantidad

        //Pedir 10 números enteros

        //Crear variable paraguardar números
        int [] numeros = new int[cantidadNumeros];
        pedirNumeros(cantidadNumeros);
        //Crear variable para contar números
        int contador = 0;
        //Mientras que el contador no sea 10
        do {
            //Leer el número y guardarlo
           numeros[contador] = leerNumero();
            //Incrementar el contador
            contador++;
        } while (contador < cantidadNumeros);
        //Sumar números y guardar resultado
        int resultado = sumarNumeros(numeros);
        //Mostrar el resultado
mostrarResultado(resultado);
    }

    private static int leerCantidad() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void pedirCantidadNumeros() {
        System.out.println("Introduzca la cantidad de números");
    }

    private static void mostrarResultado(int resultado) {
        System.out.println("La suma de los números es: " + resultado);
    }

    private static int sumarNumeros(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros(int cantidadNumeros) {
        System.out.println("Introduzca " + cantidadNumeros +  " números enteros:");
    }
}
