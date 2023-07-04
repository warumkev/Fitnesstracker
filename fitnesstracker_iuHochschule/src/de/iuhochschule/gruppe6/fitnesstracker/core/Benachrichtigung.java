package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Benachrichtigung {
	   private Benutzer benutzer;
	    private int fortschritt;

	    public Benachrichtigung(Benutzer benutzer, int fortschritt) {
	        this.benutzer = benutzer;
	        this.fortschritt = fortschritt;
	    }

	    public void anzeigenSchritte() {
	        System.out.println("Schritte-Ziel erreicht: " + benutzer.getAktuelleSchritte());
	        System.out.println("Fortschritt: " + fortschritt + " / " + benutzer.getSchrittZiel());
	    }
	    
	    public void anzeigenTrainingsZeit() {
	        System.out.println("Trainingszeit-Ziel erreicht: " + benutzer.getAktuelleTrainingszeit());
	        System.out.println("Fortschritt: " + fortschritt + " / " + benutzer.getTrainingsZeitZiel());
	    }
	    
	    public void anzeigenKalorien() {
	        System.out.println("Kalorien-Ziel erreicht: " + benutzer.getVerbrannteKalorien());
	        System.out.println("Fortschritt: " + fortschritt + " / " + benutzer.getKalorienZiel());
	    }
}
