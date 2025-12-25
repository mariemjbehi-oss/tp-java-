package edu.isgb.tp2;
import java.util.Scanner;
public class EXERCICE4 {


	    public static void main(String[] args) {

	        Scanner clavier = new Scanner(System.in); 

	        
	        System.out.print("Entrez le premier entier X = ");
	        int x = clavier.nextInt();

	        System.out.print("Entrez le deuxième entier Y = ");
	        int y = clavier.nextInt();

	       
	        int maximum = (int) Math.max(x, y); 

	        
	        System.out.println("Le maximum entre " + x + " et " + y + " est : " + maximum);

	        clavier.close(); 
	    }
	}



