package edu.isgb.tp1;

public class EX4 {


	    public static void main(String[] args) {

	       
	        if (args.length < 2) {
	            System.out.println("Usage : java Ex4 <chaine> <nombre>");
	            return;
	        }

	        String texte = args[0];           
	        int n = Integer.parseInt(args[1]); 

	       
	        for (int i = 0; i < n; i++) {
	            System.out.println(texte);
	        }
	    }
	}



