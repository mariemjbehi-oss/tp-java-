package edu.isgb.tp1;
import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nombres = new int[6];

       
        System.out.println("Entrez 6 entiers :");
        for (int i = 0; i < 6; i++) {
            System.out.print("Entier " + (i + 1) + " : ");
            nombres[i] = sc.nextInt();
        }

     
        int max = nombres[0];
        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }

      
        System.out.println("Le maximum est = " + max);

        sc.close();
    }
}





