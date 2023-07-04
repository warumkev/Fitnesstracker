package de.iuhochschule.gruppe6.fitnesstracker.core;

public class SportArt {
private static String name;
private int id;

public SportArt(String name, int id) {
	this.name = name;
	this.id = id;
}

// Name der Sportart und id, 
//da in der Klasse Sportartencontainer, die Sportarten nummeriert sind

public static String getName() {
	return name;
}

public int getId() {
	return id;
}


}


