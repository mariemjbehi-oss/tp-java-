package edu.isgb.tp1;


	import java.util.Scanner;

	public class EX8 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Entrez la taille du triangle : ");
	        int n = sc.nextInt();

	       
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
	        }

	        sc.close();
	    }
	}



