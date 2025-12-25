package edu.isgb.tp1;


	import java.util.Scanner;

	public class EX9 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Entrez la valeur de X : ");
	        int X = sc.nextInt();

	       
	        System.out.print("Entrez la valeur de n : ");
	        int n = sc.nextInt();

	        
	        int resultat = 1; //
	        for (int i = 1; i <= n; i++) {
	            resultat *= X;
	        }

	      
	        System.out.println(X + " puissance " + n + " = " + resultat);

	        sc.close();
	    }
	}



