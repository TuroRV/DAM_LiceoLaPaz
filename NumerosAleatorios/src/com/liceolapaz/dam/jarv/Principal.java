package com.liceolapaz.dam.jarv;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Pedir un numero al usuario.
        pedirNumeroABuscar();
        //Leer el número y guardar en una variable.
        int numeroABuscar = leerNumero();
        //Pedir el número de intentos.
        pedirIntentosMaximos();
        //Leer el número de intentos y guardarlo.
            // En este caso podemos reaprovechar el método de leer numero
        int maximoIntentos = leerNumero();
        //Guardar número de intentos
        int numeroIntentos = 0;
        //Mientras no llegamos al máximo de intentos
        while (numeroIntentos < maximoIntentos) {
            //Generar un número aleatorio y guardarlo
            int numAleatorio = generarNumeroAleatorio(1,10);
            //Sumar un intento al contador de intentos
            numeroIntentos++;
            //Escribir el número generado por pantalla
            System.out.println("El número generado es: " + numAleatorio);
            //Comprobar si ese número generado es el que estamos buscando
            comprobarNumeroAleatorio(numAleatorio, numeroABuscar, numeroIntentos, maximoIntentos);
            //Si el número aleatorio es el buscado salir del bucle
            if (numAleatorio == numeroABuscar) {
                break;
            }
        }
    }

    private static void comprobarNumeroAleatorio(int numAleatorio, int numeroABuscar, int numeroIntentos, int maximoIntentos) {
        if (numAleatorio == numeroABuscar) {
            System.out.println("Se ha encontrado el número en " + numeroIntentos + " intento(s).");
        } else if (numeroIntentos == maximoIntentos) {
            System.out.println("No se ha encontrado el número");
        }
    }

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void pedirIntentosMaximos() {
        System.out.print("Introduzca el número máximo de intentos: ");
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeroABuscar() {
        System.out.print("Introduzca un número entero entre 1-10: ");
    }
}
