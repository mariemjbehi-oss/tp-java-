package edu.isgb.tp3;

public class Exercice1 {


	    
	    private int heure;
	    private int minute;
	    private int seconde;

	   
	    public Exercice1(int heure) {
	        this.heure = heure;
	        this.minute = 0;  
	        this.seconde = 0;   
	    }

	    
	    public Exercice1(int heure, int minute) {
	        this(heure);       
	        this.minute = minute;
	       
	    }

	   
	    public Exercice1(int heure, int minute, int seconde) {
	        this(heure, minute); // 
	        this.seconde = seconde;
	    }

	  
	    public void affiche() {
	        System.out.println("Il est " + heure + " heures " + minute + " minutes " + seconde + " secondes");
	    }

	    
	    public static void main(String[] args) {
	        Exercice1 e  = new Exercice1(10);
	        e.affiche();

	        e = new Exercice1(10, 12);
	        e.affiche();

	        e = new Exercice1(10, 12, 45);
	        e.affiche();
	    }
	}



