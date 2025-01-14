package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Mostrar menú
        escribirMenu();
        //Pedir una opción
        pedirOpcion();
        //Leer esa opción y guardar en una variable
        int opcion = leerOpcion();
        //Realizar la acción correspondiente a la opción escogida
        realizarAccion(opcion);
    }

    private static void realizarAccion(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("Hasta la próxima!");
                System.exit(0);
                break;
                case 1:
                    System.out.println("Has elegido la opción 1");
                    break;
                    case 2:
                        System.out.println("Has elegido la opción 2");
                        break;
                        case 3:
                            System.out.println("Has elegido la opción 3");
                            break;
                            default:
                                System.out.println("Has elegido una opción no válida");
                                break;
        }
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("*** MENÚ PRINCIPAL ***\n" +
                "1. Opción 1\n" +
                "2. Opción 2\n" +
                "3. Opción 3\n" +
                "0. Salir");
    }
}
