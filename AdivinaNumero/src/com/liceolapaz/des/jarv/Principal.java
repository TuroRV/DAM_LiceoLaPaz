package com.liceolapaz.des.jarv;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int init = 1;
        while(init == 1) {
        //Mostrar el mensaje por pantalla
        menu();
        //Leer la opción indicada por el usuario y guardar en variable
        int opcion = leerOpcion();
        //Generar número aleatorio entre el rango marcado por el usuario

        switch (opcion) {
            case 1:
            System.out.println("Tienes 3 intentos para adivinar un número aleatorio entre el 1 y el 10, suerte!");
            Random rand = new Random();
            int random1 = rand.nextInt(1,10);
                //System.out.println(random1);

                int contador = 0;
                do {
                    int respuesta1 = pedirRespuesta1();
                    contador++;

                if (respuesta1 == random1) {
                    System.out.println("Enhorabuena, has acertado!");
break;
                }
                else {
                    System.out.println("Vaya, has fallado. Prueba de nuevo");
                }
        } while (contador < 3);
            break;

            case 2:
                System.out.println("Tienes 5 intentos para elegir un número aleatorio entre el 1 y el 50, suerte!");
                Random rando = new Random();
                int random2 = rando.nextInt(1,50);
                //System.out.println(random2);
                int contador2 = 0;
                do {
                    contador2++;
                    int respuesta2 = pedirRespuesta2();
                    if (respuesta2 == random2) {
                        System.out.println("Enhorabuena, has acertado!");
                        break;
                    } else {
                        System.out.println("Vaya, has fallado. Prueba de nuevo");
                    }

                }while (contador2 < 5);
                break;
                case 0:
                    System.out.println("Hasta la vista!");
                    init = 0;
                    break;
                    default:
                        System.out.println("Error");
        }
        //Pedir al usuario que introduzca un número, las veces establecidas
          //según el rango , si coincide con el
          //escrito por el usuario mostrar mensaje
    }}

    private static int pedirRespuesta2() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int pedirRespuesta1() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("ADIVINA EL NÚMERO\n" +
                "1. Del 1 al 10 (3 intentos)\n" +
                "2. Del 1 al 50 (5 intentos)\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
