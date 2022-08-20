package com.covid.coronatracker.models;

public class LocationStats {
	
	private String state;
	private String country;
	private String zone;
	private int latestTotalCases;
	private int diffFromPrevDay;
	
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	//	Getters and setters
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", zone=" + zone + ", latestTotalCases="
				+ latestTotalCases + ", diffFromPrevDay=" + diffFromPrevDay + "]";
	}
	
	
	
}
