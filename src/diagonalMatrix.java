import java.util.Scanner;

public class diagonalMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input row : ");
        int row = scn.nextInt();
        int col = row;
        float[][] arr = new float[row][col];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input row " + i + " element: ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextFloat();
            }
        }
        float diagonalSum = 0;
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                if (i == j) diagonalSum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Diagonal total : " + diagonalSum);

    }
}