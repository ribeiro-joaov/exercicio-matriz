package application;


import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows? ");
        int r = sc.nextInt();
        System.out.print("How manu columns? ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Type the row #" + i + " and column #" + j);
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.print("Type one number to search: ");
        int pickNumber = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == pickNumber) {
                    System.out.println("position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);

                    }

                }
            }
        }
    }
}

