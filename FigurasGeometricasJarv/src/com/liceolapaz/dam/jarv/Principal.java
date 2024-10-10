package com.liceolapaz.dam.jarv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int init = 0;
        double lado;
        double altura;
        double base;
        double apotema;
        double area;
        double perimetro;
        int nLados;
        do {
            menu();
            int opcion = escogerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el lado del triángulo");
                    lado = leerlado();
                    System.out.println("Introduzca la base del triángulo:");
                    base = leerbase();
                    System.out.println("Introduzca la altura del triángulo:");
                    altura = leerAltura();
                    area = areaTriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + area);
                    perimetro = perimetroTriangulo(lado);
                    System.out.println("El perímetro del triángulo es: " + perimetro);
                    break;
                case 2:
                    System.out.println("Introduzca la base del rectángulo:");
                    base = leerbase();
                    System.out.println("Introduzca la altura del rectángulo:");
                    altura = leerAltura();
                    area = areaRectangulo(base, altura);
                    System.out.println("El área del rectángulo es: " + area);
                    perimetro = perimetroRectangulo(base, altura);
                    System.out.println("El perímetro del rectángulo es: " + perimetro);
                    break;
                case 3:
                    System.out.println("Introduzca el lado del cuadrado:");
                    lado = leerlado();
                    area = areaCuadrado(lado);
                    System.out.println("El área del cuadrado es: " + area);
                    perimetro = perimetroCuadrado(lado);
                    System.out.println("El perímetro del cuadrado es: " + perimetro);
                    break;
                case 4:
                    System.out.println("Introduzca el número de lados del polígono");
                    nLados = leerNLados();
                    if (nLados < 5) {
                        System.out.println("El polígono debe tener al menos 5 lados");
                    } else {
                        System.out.println("Introduzca el lado del polígono:");
                        lado = leerlado();
                        System.out.println("Introduzca el apotema del polígono:");
                        apotema = leerApotema();
                        perimetro = perimetroPoligono(lado, nLados);
                        area = areaPoligono(perimetro, apotema);
                        System.out.println("El área del polígono es: " + area);
                        System.out.println("El perímetro del polígono es: " + perimetro);
                        break;
                    }
                    break;
                case 0:
                    System.out.println("Aplicación Cerrada");
                    init = 1;
                    break;
                    default:
                        System.out.println("Introduzca una opción válida");
            }
        } while (init == 0);
    }

    private static double areaPoligono(double perimetro, double apotema) {
        return (perimetro * apotema)/2;
    }

    private static double perimetroPoligono(double lado, int nLados) {
        double perimetro = lado * nLados;
        return perimetro;
    }

    private static double leerApotema() {
        Scanner leer = new Scanner(System.in);
        return leer.nextDouble();
    }

    private static int leerNLados() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static double perimetroCuadrado(double lado) {
        double perimetro = lado+lado+lado+lado;
        return perimetro;
    }

    private static double areaCuadrado(double lado) {
        double area = lado*lado;
        return area;
    }

    private static double perimetroRectangulo(double base, double altura) {
        double perimetro = base+base+altura+altura;
        return perimetro;
    }

    private static double leerlado() {
        Scanner leer = new Scanner(System.in);
        return leer.nextDouble();
    }

    private static double perimetroTriangulo(double lado) {
        double perimetro = lado + lado + lado;
        return perimetro;
    }

    private static double areaRectangulo(double base, double altura) {
        double area = base*altura;
        return area;
    }

    private static double areaTriangulo(double base, double altura) {
        double area = (base*altura)/2;
        return area;
    }


    private static double leerAltura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double leerbase() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int escogerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void menu() {
        System.out.println("FIGURAS GEOMÉTRICAS\n" +
                "1. Triángulo\n" +
                "2. Rectángulo\n" +
                "3. Cuadrado\n" +
                "4. Pentágono/Polígono\n" +
                "0. Salir\n" +
                "Escoja una opción:");
    }
}
