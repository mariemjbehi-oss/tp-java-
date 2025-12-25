package edu.isgb.tp1;
import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();

        boolean premier = true;

        if (n <= 1) {
            premier = false;
        } else {
            
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    premier = false;
                    break; // 
                }
            }
        }

     
        if (premier) {
            System.out.println(n + " est un nombre premier");
        } else {
            System.out.println(n + " n'est pas un nombre premier");
        }

        sc.close();
    }
}


	        

	       




	   