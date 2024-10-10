package com.liceolapaz.dam.arv;

import java.util.Scanner;

public class Principal {

    private static final int ANHO_ACTUAL = 2024;

    public static void main(String[] args) {
        //Preguntar año de nacimiento
        preguntarAnhoNacimiento();
        //Leer el número introducido con el teclado y guardarlo en una variable
        int anhoNacimiento = leerAnhoNacimiento();
        //Escribir mensaje en función del año de nacimiento
        escribirMensaje(anhoNacimiento);
    }

    private static void escribirMensaje(int anhoNacimiento) {
        if (ANHO_ACTUAL < anhoNacimiento) {
            System.out.println("No puedes haber nacido en el futuro");
        }
        else if (anhoNacimiento < ANHO_ACTUAL - 150) {
            System.out.println("Quen chegara a súa edad");
        }
        else if (ANHO_ACTUAL - anhoNacimiento >= 18) {
            System.out.println("Puedes pasar");
        }
        else if (ANHO_ACTUAL - anhoNacimiento <= 18) {
            System.out.println("No puedes pasar");
        }
    }

    private static int leerAnhoNacimiento() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void preguntarAnhoNacimiento() {
        System.out.print("Escriba su año de nacimiento: ");
    }
}
