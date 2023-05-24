package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Benutzer {
	    private String name;
	    private String sport;
	    private int schrittZiel;
	    private int kalorienZiel;
	    private int trainingsZeitZiel;
	    private int verbrannteKalorien;
	    private int aktuelleTrainingszeit;

	    public Benutzer(String name, String sport, int dailyStepsGoal, int dailyCaloriesGoal, int dailyExerciseTimeGoal) {
	        this.name = name;
	        this.sport = sport;
	        this.schrittZiel = schrittZiel;
	        this.kalorienZiel = kalorienZiel;
	        this.trainingsZeitZiel = trainingsZeitZiel;
	        this.verbrannteKalorien = 0;
	        this.aktuelleTrainingszeit = 0;
	    }

	    // Getter und Setter für die Attribute

	    public void getSport(String sport) {
	        this.sport = sport;
	    }
//       Training starten
	    public void startTraining() {
	       
	    }
//       Training beenden
	    public void endTraining() {

	    }
//       Kalorien aktualisieren
	    public void updateVerbrannteKalorien(int kalorien) {
	        this.verbrannteKalorien += kalorien;
	    }
//       Trainingszeit aktualisieren
	    public void updateTrainingszeit(int minuten) {
	        this.aktuelleTrainingszeit += minuten;
	    }

	    public void generateFortschrittBericht() {
	        System.out.println("Fortschrittsbericht für " + name + ":");
	        System.out.println("Sportart: " + sport);
	        System.out.println("Tägliches Schrittziel: " + schrittZiel);
	        System.out.println("Tägliches Kalorienziel: " + kalorienZiel);
	        System.out.println("Tägliches Sportzeitziel: " + trainingsZeitZiel);
	        System.out.println("Verbrannte Kalorien: " + verbrannteKalorien);
	        System.out.println("Aktuelle Sportzeit: " + aktuelleTrainingszeit);
	    }
	}



