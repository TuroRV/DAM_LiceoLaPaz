package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Falta asegurar que si el usuario tiene cuenta normal no permita que el saldo sea negativo
        // probablemente usando un boolean loginNormal

        int init = 0;
        int init2 = 0;
        boolean login = false;
        boolean loginPremium = false;
        double cuentaUsuario = 0;
        double saldoNormal = 0;
        double saldoPremium = 0;
        do {
            menu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    do {
                    menuCuenta();
                    int opcionCuenta = leerOpcionCuenta();
                    switch (opcionCuenta) {
                        case 1:
                            System.out.println("Indique el saldo inicial de la cuenta normal:");
                            saldoNormal = leerSaldoNormal();
                            if (saldoNormal < 0) {
                                System.out.println("El saldo de las cuentas normales no puede ser negativo");
                                saldoNormal = 0;
                            } else {
                                login = true;
                                loginPremium = false;
                                cuentaUsuario = saldoNormal;
                                System.out.println("Ha creado su Cuenta Normal\n" +
                                        "Su saldo inicial es: " + saldoNormal);
                            }
                            break;
                        case 2:
                            System.out.println("Indique el saldo inicial de la cuenta premium:");
                            saldoPremium = leerSaldoPremium();
                            login = true;
                            loginPremium = true;
                            cuentaUsuario = saldoPremium;
                            System.out.println("Ha creado su Cuenta Premium \n" +
                                    "Su saldo inicial es: " + saldoPremium);
                            break;
                        case 0:
                            init2 = 1;
                            menu();
                            break;
                        default:
                            System.out.println("Introduzca una opción válida");
                            break;
                    }} while (init2 == 0);
                    break;
                case 2:
                    System.out.println("Escriba el valor a ingresar");
                    double ingreso = leerIngreso();
                    if (ingreso < 0) {
                        System.out.println("El ingreso no puede ser un valor negativo");
                    } else if (login == false) {
                        System.out.println("No tiene cuenta en nuestro banco");}
                    else {
                        cuentaUsuario += ingreso;
                        System.out.println("El saldo actual es: " + cuentaUsuario);
                    }
                    break;
                case 3:
                    System.out.println("Escriba el valor a retirar");
                    double retirada = leerRetirada();
                    if (retirada < 0) {
                        System.out.println("El retiro no puede tener un valor negativo");
                    } else if (login == false) {
                        System.out.println("No tiene cuenta en nuestro banco");}
                    else if (retirada > cuentaUsuario && loginPremium == false)
                        {
                            System.out.println("Las cuentas normales no permiten saldos negativos");
                    } else {
                        cuentaUsuario -= retirada;
                        System.out.println("El saldo actual es: " + cuentaUsuario);
                    }
                    break;
                case 4:
                    System.out.println("El saldo actual es: " + cuentaUsuario);
                    break;
                case 0:
                    System.out.println("Aplicación cerrada");
                    init = 1;
                    break;
                default:
                    System.out.println("Escoja una opción válida");
                    break;
            }
        } while (init == 0);
    }

    private static double leerRetirada() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerIngreso() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerSaldoPremium() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerSaldoNormal() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int leerOpcionCuenta() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void menuCuenta() {
        System.out.println("Tipo de cuenta\n" +
                "1. Cuenta normal\n" +
                "2. Cuenta Premium\n" +
                "0. Cancelar\n" +
                "Escoja una opción:");
    }

    private static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    private static void menu() {
        System.out.println("BANCO\n" +
                "1. Crear cuenta\n" +
                "2. Ingresar dinero\n" +
                "3. Retirar dinero\n" +
                "4. Consultar saldo\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
