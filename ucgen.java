package Anlasilmayan;

import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        int i, k, l, n;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı girin : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            for (l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

