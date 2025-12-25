package edu.isgb.tp3;

public class TestExercice4 {
	

	    public static void main(String[] args) {

	        Exercice4 z1 = new Exercice4(1.0, 2.0);
	        System.out.println("z1=" + z1.info());

	        Exercice4 z2 = new Exercice4(2.0, 1.0);
	        System.out.println("z2=" + z2.info());

	        Exercice4 z3 = z1.produit(z2); 
	        System.out.println("z1 x z2 =" + z3.info());

	        Exercice4 z4 = Exercice4.produit(z2, z1); 
	        System.out.println("z2 x z1 =" + z4.info());
	    }
	}



