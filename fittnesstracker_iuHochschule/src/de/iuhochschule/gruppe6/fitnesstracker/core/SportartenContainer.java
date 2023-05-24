package de.iuhochschule.gruppe6.fitnesstracker.core;

import java.util.ArrayList;
import java.util.List;

public class SportartenContainer {

	private List<SportArt> SportArten;
	
	
	
	public SportartenContainer() {
		
		SportArten = new ArrayList<>();
		
		SportArten.add(new SportArt("Gehen",1));
		SportArten.add(new SportArt("Funktionelles Krafttraining",2));
		SportArten.add(new SportArt("Core-Training",3));
		SportArten.add(new SportArt("Rad indoor",4));
		SportArten.add(new SportArt("gem. Cardiotraining",5));
		SportArten.add(new SportArt("Hochintensives Intervalltraining",6));
		SportArten.add(new SportArt("Crosstrainer",7));
		SportArten.add(new SportArt("Pilates",8));
		SportArten.add(new SportArt("Tanzen",9));
		SportArten.add(new SportArt("Schwimmen",10));
		SportArten.add(new SportArt("Rad outdoor",11));
		SportArten.add(new SportArt("Laufen indoort",12));
		SportArten.add(new SportArt("Laufen outdoor",13));
		SportArten.add(new SportArt("Crosstrainer",14));
		SportArten.add(new SportArt("Rudern",15));
		SportArten.add(new SportArt("Treppen steigen",16));
		SportArten.add(new SportArt("Wandern",17));
		SportArten.add(new SportArt("Yoga",18));
		SportArten.add(new SportArt("Cool-down",19));
		SportArten.add(new SportArt("Tai Chi",20));
		SportArten.add(new SportArt("Surfen",21));
		SportArten.add(new SportArt("Klettern",22));
		SportArten.add(new SportArt("Kampfsport",23));
		SportArten.add(new SportArt("Rennen",24));
	}
	
	
	public List<SportArt> getSportArten() {
		return SportArten;
	}
}

