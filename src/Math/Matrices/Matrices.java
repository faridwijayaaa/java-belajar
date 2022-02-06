package Math.Matrices;

import java.util.Scanner;

class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;

        // Declaration row and Column
        // Matrices form (Row * Column)
        System.out.print("Row: ");
        row = input.nextInt();
        System.out.print("Column: ");
        column = input.nextInt();

        int a[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrices " + row + " x " + column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (a[i][j] > 0) {
                    System.out.print(" " + a[i][j] + "    ");
                } else {
                    System.out.print(a[i][j] + "    ");
                }
            }
            System.out.println();
        }
    }
}