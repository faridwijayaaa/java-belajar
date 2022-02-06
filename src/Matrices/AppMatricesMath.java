package Matrices;

import java.util.Scanner;

public class AppMatricesMath {

    public static void main(String[] args) {
        MatricesMath matricesMath = new MatricesMath();
        Scanner input = new Scanner(System.in);
        int a[][] = { { 2, -3 }, { 1, 6 } };
        int b[][] = { { 4, 1 }, { 5, -2 } };
        int c[][];
        matricesMath.setRow(2);
        matricesMath.setColumn(2);

        System.out.println("Matrix A");
        matricesMath.print(a);
        System.out.println();

        System.out.println("Matrix B");
        matricesMath.print(b);
        System.out.println();

        // Menu Input
        System.out.println(
                "----Operation Matrix----\n1. Addition Matrix\n2. Subtraction Matrix\n3. Multiplication Matrix");
        System.out.print("\nMasukan pilihan: ");
        int pil = input.nextInt();
        System.out.println();
        switch (pil) {
            case 1:
                System.out.println("Matrix A + B");
                c = matricesMath.addition(a, b);
                matricesMath.print(c);
                break;
            case 2:
                System.out.println("Matrix A - B");
                c = matricesMath.subtraction(a, b);
                break;
            case 3:
                System.out.println("Matrix A * B");
                c = matricesMath.multiplication(a, b);
                matricesMath.print(c);
                break;
            default:
                System.out.println("Pilihan tidak ada.");
        }
    }
}
