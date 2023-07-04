package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Benutzer {
	    private String name;
	    private int alter;
	    private double gewicht;
	    private double groesse;
	    private String passwort;
	    private int schrittZiel;
	    private int kalorienZiel;
	    private int trainingsZeitZiel;
	    private int verbrannteKalorien;
	    private int aktuelleTrainingszeit;
	    private int aktuelleSchritte;

	    public Benutzer(String name, int alter, double gewicht, double groesse,String passwort, int schrittZiel, int kalorienZiel, int trainingsZeitZiel) {
	        this.name = name;
	        this.alter = alter;
	        this.gewicht = gewicht;
	        this.groesse = groesse;
	        this.passwort = passwort;
	        this.schrittZiel = schrittZiel;
	        this.kalorienZiel = kalorienZiel;
	        this.trainingsZeitZiel = trainingsZeitZiel;
	        this.verbrannteKalorien = 0;
	        this.aktuelleTrainingszeit = 0;
	       
	    }

	    // Getter und Setter für die Attribute
	    

	    
        public String getPasswort() {
			return passwort;
		}

		public void setPasswort(String passwort) {
			this.passwort = passwort;
		}

		public int getAlter() {
			return alter;
		}

		public void setAlter(int alter) {
			this.alter = alter;
		}

		public double getGewicht() {
			return gewicht;
		}

		public void setGewicht(double gewicht) {
			this.gewicht = gewicht;
		}

		public double getGroesse() {
			return groesse;
		}

		public void setGroesse(double groesse) {
			this.groesse = groesse;
		}

		public int getAktuelleSchritte() {
			return aktuelleSchritte;
		}

		//       Training starten
	    public void startTraining() {
	       
	    }
//       Training beenden
	    public void endTraining() {

	    }
        public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSchrittZiel() {
			return schrittZiel;
		}

		public void setSchrittZiel(int schrittZiel) {
			this.schrittZiel = schrittZiel;
		}

		public int getKalorienZiel() {
			return kalorienZiel;
		}

		public void setKalorienZiel(int kalorienZiel) {
			this.kalorienZiel = kalorienZiel;
		}

		public int getTrainingsZeitZiel() {
			return trainingsZeitZiel;
		}

		public void setTrainingsZeitZiel(int trainingsZeitZiel) {
			this.trainingsZeitZiel = trainingsZeitZiel;
		}


		public int getVerbrannteKalorien() {
			return verbrannteKalorien;
		}

		public int getAktuelleTrainingszeit() {
			return aktuelleTrainingszeit;
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
	        System.out.println("Sportart: " + SportArt.getName());
	        System.out.println("Tägliches Schrittziel: " + schrittZiel);
	        System.out.println("Tägliches Kalorienziel: " + kalorienZiel);
	        System.out.println("Tägliches Sportzeitziel: " + trainingsZeitZiel);
	        System.out.println("Verbrannte Kalorien: " + verbrannteKalorien);
	        System.out.println("Aktuelle Sportzeit: " + aktuelleTrainingszeit);
	    }
	}



