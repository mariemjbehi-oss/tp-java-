package edu.isgb.tp3;

public class Exercice4 {
	

	    
	    private double reel;
	    private double imaginaire;

	   
	    public Exercice4(double reel, double imaginaire) {
	        this.reel = reel;
	        this.imaginaire = imaginaire;
	    }

	   
	    public String info() {
	        return reel + " + " + imaginaire + "i";
	    }

	  
	    public Exercice4 produit(Exercice4 z) {
	        double r = this.reel * z.reel - this.imaginaire * z.imaginaire;
	        double i = this.reel * z.imaginaire + this.imaginaire * z.reel;
	        return new Exercice4(r, i);
	    }

	   
	    public static Exercice4 produit(Exercice4 z1, Exercice4 z2) {
	        double r = z1.reel * z2.reel - z1.imaginaire * z2.imaginaire;
	        double i = z1.reel * z2.imaginaire + z1.imaginaire * z2.reel;
	        return new Exercice4(r, i);
	    }
	}



