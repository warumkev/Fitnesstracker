package de.iuhochschule.gruppe6.fitnesstracker.core;

public class Aktivitaet {

	 private String sportart;
	    private int dauerInMinuten;
	    private int verbrannteKalorien;

	    public Aktivitaet(String sportart, int dauerInMinuten, int verbrannteKalorien) {
	        this.sportart = sportart;
	        this.dauerInMinuten = dauerInMinuten;
	        this.verbrannteKalorien = verbrannteKalorien;
	    }

	    public String getSportart() {
	        return sportart;
	    }

	    public int getDauerInMinuten() {
	        return dauerInMinuten;
	    }

	    public int getVerbrannteKalorien() {
	        return verbrannteKalorien;
}
}
