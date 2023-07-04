package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Bericht {

	private String benutzerName;
    private Benutzer benutzer;
    private SportArt sport;

    public Bericht(String benutzerName, Benutzer benutzer, SportArt sport) {
        this.benutzerName = benutzerName;
        this.benutzer = benutzer;
        this.sport = sport;
    }

    public void generateProgressReport() {
        System.out.println("Fortschrittsbericht für " + benutzerName + ":");
        System.out.println("Sportart: " + SportArt.getName());
        System.out.println("Tägliches Schrittziel: " + benutzer.getSchrittZiel());
        System.out.println("Tägliches Kalorienziel: " + benutzer.getKalorienZiel());
        System.out.println("Tägliches Sportzeitziel: " + benutzer.getTrainingsZeitZiel());
        System.out.println("Verbrannte Kalorien: " + benutzer.getVerbrannteKalorien());
        System.out.println("Aktuelle Sportzeit: " + benutzer.getAktuelleTrainingszeit());
    }
}
