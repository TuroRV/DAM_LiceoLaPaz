import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
            boolean init = true;
            double num1 = 0;
            double num2 = 0;
        do {
            menu();
            Scanner opcion = new Scanner(System.in);
            if (opcion.hasNextInt()) {
                switch (opcion.nextLine()) {
                    case "1":
                        num1 = pedirOperando1();
                        num2 = pedirOperando2();
                        Operaciones.suma(num1, num2);
                        break;
                    case "2":
                        num1 = pedirOperando1();
                        num2 = pedirOperando2();
                        Operaciones.resta(num1, num2);
                        break;
                    case "3":
                        num1 = pedirOperando1();
                        num2 = pedirOperando2();
                        Operaciones.multiplicacion(num1, num2);
                        break;
                    case "4":
                        num1 = pedirOperando1();
                        num2 = pedirOperando2();
                        Operaciones.division(num1, num2);
                        break;
                    case "0":
                        System.out.println("Aplicación cerrada");
                        init = false;
                        break;
                    default:
                        System.out.println("Introduzca una opción válida");
                        break;
                }
            } else {
                System.out.println("Introduzca números enteros");
            }
        } while (init);
    }

    private static double pedirOperando2() {
        System.out.println("Introduza el segundo operando: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static double pedirOperando1() {
        System.out.println("Introduza el primer operando: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void menu() {
        System.out.println("CALCULADORA JAVA 3000 \n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "0. Salir");
    }
}
