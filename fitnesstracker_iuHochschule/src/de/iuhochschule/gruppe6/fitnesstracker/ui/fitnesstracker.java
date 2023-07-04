package de.iuhochschule.gruppe6.fitnesstracker.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import de.iuhochschule.gruppe6.fitnesstracker.core.Bericht;
import de.iuhochschule.gruppe6.fitnesstracker.core.SportArt;
import de.iuhochschule.gruppe6.fitnesstracker.core.SportartenContainer;
import de.iuhochschule.gruppe6.fitnesstracker.core.Benutzer;

public class fitnesstracker {
	static Map<String, Benutzer> benutzerMap = new HashMap<>();
    static Benutzer angemeldeterBenutzer = null;

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            if (angemeldeterBenutzer == null) {
	                System.out.println("Willkommen! Bitte wähle eine Option:");
	                System.out.println("1 = Anmelden");
	                System.out.println("2 = Neuen Account erstellen");
	                System.out.println("3 = Beenden");

	                int option = sc.nextInt();
	                sc.nextLine(); 

	                switch (option) {
	                    case 1:
	                        anmelden(sc);
	                        break;
	                    case 2:
	                        neuenAccountErstellen(sc);
	                        break;
	                    case 3:
	                        System.out.println("Das Programm wird beendet.");
	                        return;
	                    default:
	                        System.err.println("Ungültig! Bitte versuche es erneut.");
	                }
	            } else {
	                System.out.println("Willkommen, " + angemeldeterBenutzer.getName() + "!");
	                System.out.println("Was möchtest du tun?");
	                System.out.println("1 Sport machen");
	                System.out.println("2 Fortschritt anzeigen");
	                System.out.println("3 Account löschen");
	                System.out.println("4 Abmelden");

	                int option = sc.nextInt();
	                sc.nextLine(); // Clear the newline character from input

	                switch (option) {
	                    case 1:
	                        sportAuswahl(sc);
	                        break;
	                    case 2:
	                        angemeldeterBenutzer.generateFortschrittBericht();
	                        break;
	                    case 3:
	                        benutzerLöschen(sc);
	                        break;
	                    case 4:
	                        angemeldeterBenutzer = null;
	                        System.out.println("Du wurdest erfolgreich abgemeldet.");
	                        break;
	                    default:
	                        System.err.println("Ungültig! Bitte versuche es erneut.");
	                }
	            }
	        }
	    }

	    private static void anmelden(Scanner sc) {
	        System.out.println("Gib deinen Benutzernamen ein:");
	        String benutzername = sc.nextLine();

	        if (benutzerMap.containsKey(benutzername)) {
	            System.out.println("Gib dein Passwort ein:");
	            String passwort = sc.nextLine();

	            Benutzer benutzer = benutzerMap.get(benutzername);
	            if (benutzer.getPasswort().equals(passwort)) {
	                angemeldeterBenutzer = benutzer;
	                System.out.println("Anmeldung erfolgreich. Willkommen, " + angemeldeterBenutzer.getName() + "!");
	            } else {
	                System.out.println("Falsches Passwort. Anmeldung fehlgeschlagen.");
	            }
	        } else {
	            System.out.println("Benutzername existiert nicht. Bitte erstelle einen neuen Account.");
	        }
	    }

	    private static void neuenAccountErstellen(Scanner sc) {
	        System.out.println("Gib deinen Benutzernamen ein:");
	        String benutzername = sc.nextLine();

	        if (benutzerMap.containsKey(benutzername)) {
	            System.out.println("Benutzername existiert bereits. Bitte wähle einen anderen Benutzernamen.");
	            return;
	        }

	        System.out.println("Gib dein Passwort ein:");
	        String passwort = sc.nextLine();

	        System.out.println("Gib deinen Namen ein:");
	        String name = sc.nextLine();

	        System.out.println("Gib dein Alter ein:");
	        int alter = sc.nextInt();
	        sc.nextLine(); 

	        System.out.println("Gib dein Gewicht ein:");
	        double gewicht = sc.nextDouble();
	        sc.nextLine(); 

	        System.out.println("Gib deine Größe ein:");
	        double groesse = sc.nextDouble();
	        sc.nextLine(); 

	        System.out.println("Gib dein Trainingszeit-Ziel ein:");
	        int trainingsZeitZiel = sc.nextInt();
	        sc.nextLine();

	        System.out.println("Gib dein Kalorien-Ziel ein:");
	        int kalorienZiel = sc.nextInt();
	        sc.nextLine(); 

	        System.out.println("Gib dein Schrittziel ein:");
	        int schrittziel = sc.nextInt();
	        sc.nextLine(); 

	        Benutzer neuerBenutzer = new Benutzer (name, alter, gewicht, groesse, passwort, trainingsZeitZiel, kalorienZiel, schrittziel);

	        benutzerMap.put(benutzername, neuerBenutzer);
	        angemeldeterBenutzer = neuerBenutzer;

	        System.out.println("Account erfolgreich erstellt. Willkommen, " + angemeldeterBenutzer.getName() + "!");
	    }

	    private static void sportAuswahl(Scanner sc) {
	        System.out.println("Möchtest du Sport machen? (JA/NEIN)");
	        String antwort = sc.nextLine();

	        if (antwort.equalsIgnoreCase("JA")) {
	            List<SportArt> sportArten = SportartenContainer.getSportArten();

	            System.out.println("Wähle eine Sportart aus:");
	            for (SportArt sportArt : sportArten) {
	                System.out.println(sportArt.getId() + ". " + sportArt.getName());
	            }

	            int sportAuswahl = sc.nextInt();
	            sc.nextLine(); 

	            SportArt ausgewählteSportArt = null;
	            for (SportArt sportArt : sportArten) {
	                if (sportArt.getId() == sportAuswahl) {
	                    ausgewählteSportArt = sportArt;
	                    break;
	                }
	            }

	            if (ausgewählteSportArt != null) {
	               
	                System.out.println("Du hast " + ausgewählteSportArt.getName() + " ausgewählt.");
	            } else {
	                System.out.println("Ungültige Sportart. Bitte versuche es erneut.");
	            }
	        } else if (antwort.equalsIgnoreCase("NEIN")) {
	            angemeldeterBenutzer.generateFortschrittBericht();
	        } else {
	            System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
	        }
	    }

	    private static void benutzerLöschen(Scanner sc) {
	        System.out.println("Bist du sicher, dass du deinen Account löschen möchtest? (JA/NEIN)");
	        String antwort = sc.nextLine();

	        if (antwort.equalsIgnoreCase("JA")) {
	            benutzerMap.remove(angemeldeterBenutzer.getName());
	            angemeldeterBenutzer = null;
	            System.out.println("Dein Account wurde erfolgreich gelöscht.");
	        } else if (antwort.equalsIgnoreCase("NEIN")) {
	            System.out.println("Accountlöschung abgebrochen.");
	        } else {
	            System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
	        }
	    }

	}


