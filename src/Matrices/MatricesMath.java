package Matrices;

public class MatricesMath {
    int row, column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] addition(int[][] a, int[][] b) {
        int c[][] = new int[getRow()][getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public int[][] subtraction(int[][] a, int[][] b) {
        int c[][] = new int[getRow()][getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public int[][] multiplication(int[][] a, int[][] b) {
        int c[][] = new int[getRow()][getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public void print(int[][] a) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                if (a[i][j] > 0) {
                    System.out.print(" " + a[i][j] + "   ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
