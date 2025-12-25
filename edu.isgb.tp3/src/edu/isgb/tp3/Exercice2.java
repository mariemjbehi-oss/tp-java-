package edu.isgb.tp3;

public class Exercice2 {
	

	   
	    private int x;
	    private static int y;
	    private int z;

	   
	    public Exercice2() {
	        x = 0;
	        y++;
	        z = y;
	    }

	   
	    public Exercice2(int x) {
	        this.x = x;
	        y++;
	        z = y;
	    }

	 
	    void affiche() {
	        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	    }

	  
	    public static void main(String[] args) {
	        Exercice2 a = new Exercice2();
	        a.affiche();

	        Exercice2 b = new Exercice2(1);
	        a.affiche();
	        b.affiche();
	    }
	}



