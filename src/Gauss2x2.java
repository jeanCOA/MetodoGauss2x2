import java.util.Scanner;

public class Gauss2x2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;

        System.out.println("=== Metodo de Gauss 2x2 ===");
        System.out.println("Forma: a*x + b*y = e");
        System.out.println("       c*x + d*y = f\n");

        // Entrada
        System.out.print("Ingrese a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese e: ");
        e = sc.nextDouble();

        System.out.print("Ingrese c: ");
        c = sc.nextDouble();

        System.out.print("Ingrese d: ");
        d = sc.nextDouble();

        System.out.print("Ingrese f: ");
        f = sc.nextDouble();

        // Mostrar matriz inicial
        System.out.println("\nMatriz inicial:");
        mostrarMatriz(a, b, e, c, d, f);

        // Validación
        if (a == 0) {
            System.out.println("\nNo se puede aplicar Gauss porque a = 0 (division por 0)");
            return;
        }

        // Paso 1: hacer cero abajo
        double factor = c / a;

        c = c - factor * a;
        d = d - factor * b;
        f = f - factor * e;

        System.out.println("\nDespues de eliminar (hacer 0 abajo):");
        mostrarMatriz(a, b, e, c, d, f);

        // Validar si hay solución
        if (d == 0) {
            if (f == 0) {
                System.out.println("\nInfinitas soluciones");
            } else {
                System.out.println("\nNo tiene solucion");
            }
            return;
        }

        // Paso 2: hacer 1 el pivote de abajo
        f = f / d;
        d = d / d; // queda 1

        System.out.println("\nHaciendo 1 el pivote de abajo:");
        mostrarMatriz(a, b, e, c, d, f);

        // Paso 3: eliminar arriba
        e = e - b * f;
        b = b - b * d;

        System.out.println("\nEliminando arriba (forma escalonada):");
        mostrarMatriz(a, b, e, c, d, f);

        // Paso 4: hacer 1 el pivote de arriba
        e = e / a;
        a = a / a;

        System.out.println("\nMatriz final (con 1's):");
        mostrarMatriz(a, b, e, c, d, f);

        // Resultados
        double x = e;
        double y = f;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        sc.close();
    }

    // Metodo para imprimir la matriz
    public static void mostrarMatriz(double a, double b, double e,
                                     double c, double d, double f) {

        System.out.println(a + "\t" + b + "\t|\t" + e);
        System.out.println(c + "\t" + d + "\t|\t" + f);
    }
} 