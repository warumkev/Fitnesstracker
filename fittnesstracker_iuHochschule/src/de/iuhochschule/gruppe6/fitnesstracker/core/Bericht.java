package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Bericht {

	private String benutzerName;
    private Benutzer benutzer;

    public Bericht(String benutzerName, Benutzer benutzer) {
        this.benutzerName = benutzerName;
        this.benutzer = benutzer;
    }

    public void generateProgressReport() {
        System.out.println("Fortschrittsbericht für " + benutzerName + ":");
        System.out.println("Sportart: " + benutzer.getSport());
        System.out.println("Tägliches Schrittziel: " + benutzer.getschrittZiel());
        System.out.println("Tägliches Kalorienziel: " + benutzer.getKalorienZiel());
        System.out.println("Tägliches Sportzeitziel: " + benutzer.getTrainingsZeitZiel());
        System.out.println("Verbrannte Kalorien: " + benutzer.getVerbrannteKalolrien());
        System.out.println("Aktuelle Sportzeit: " + benutzer.getAktuelleTrainingszeit());
    }
}
