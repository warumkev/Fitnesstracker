package de.iuhochschule.gruppe6.fitnesstracker.core;

public class SportArt {
private String name;
private int position;

public SportArt(String name, int position) {
	name = name;
	position = position;
}

//public SportArt (SportArt sportToCopy) {
//	name = sportToCopy.name;
//	position = sportToCopy.position;
//}

public String getName() {
	return name;
}

public int getPosition() {
	return position;
}


}


