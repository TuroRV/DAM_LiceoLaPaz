package com.liceolapaz.dam.jarv;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        boolean init = true;
        int contadorJugador = 0;
        int contadorMaquina = 0;
        String respuesta;
        do {
            while (contadorMaquina < 3 && contadorJugador < 3) {
                double numeroMaquina = generarMaquina();
                menu();
                Scanner opcion = new Scanner(System.in);
                if (opcion.hasNextInt()) {
                switch (opcion.nextInt()) {
                    case 1:
                        System.out.println("Has elegido piedra");
                        Thread.sleep(500);
                        generarMaquina();
                        if (numeroMaquina == 1) {
                            System.out.println("La máquina ha elegido piedra, empate");
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 2) {
                            System.out.println("La máquina ha elegido papel, pierdes!");
                            contadorMaquina++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 3) {
                            System.out.println("La máquina ha elegido tijeras, ganas!");
                            contadorJugador++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("Has elegido papel");
                        Thread.sleep(500);
                        generarMaquina();
                        if (numeroMaquina == 1) {
                            System.out.println("La máquina ha elegido piedra, ganas!");
                            contadorJugador++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 2) {
                            System.out.println("La máquina ha elegido papel, empate!");
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 3) {
                            System.out.println("La máquina ha elegido tijeras, pierdes!");
                            contadorMaquina++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Has elegido tijeras");
                        Thread.sleep(500);
                        generarMaquina();
                        if (numeroMaquina == 1) {
                            System.out.println("La máquina ha elegido piedra, pierdes!");
                            contadorMaquina++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 2) {
                            System.out.println("La máquina ha elegido papel, ganas!");
                            contadorJugador++;
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        } else if (numeroMaquina == 3) {
                            System.out.println("La máquina ha elegido tijeras, empate!");
                            System.out.println("Jugador: " + contadorJugador + ", Máquina: " + contadorMaquina);
                            Thread.sleep(500);
                            break;
                        }
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } else {
                    System.out.println("Introduzca una opción válida");
                }
                }
            if (contadorMaquina < contadorJugador) {
                System.out.println("El jugador gana!");
            } else {
                System.out.println("La máquina gana!");
            }
            System.out.println("¿Quieres volver a jugar? S/N");
            respuesta = leerRespuesta();
            if (Objects.equals(respuesta, "n")) {
                System.out.println("Gracias por jugar a piedra papel tijeras");
                init = false;
            } else if (Objects.equals(respuesta,"s")) {
                contadorMaquina=0;
                contadorJugador=0;
                System.out.println("Vamos allá!");
                Thread.sleep(500);
            } else {
                System.out.println("Introduzca una respuesta válida");
            }
        } while (init);
    }

    private static String leerRespuesta() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static double generarMaquina() {
        int min = 1;
        int max = 3;
        return Math.floor(Math.random() * (max - min + 1) + min);
    }

    private static void menu() {
        System.out.println(
                "Elige tu opción\n" +
                "1. Piedra\n" +
                "2. Papel\n" +
                "3. Tijera");
    }
}
