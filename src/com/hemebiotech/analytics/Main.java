package com.hemebiotech.analytics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		IAnalyticsCounter counter = new AnalyticsCounter();
		counter.execute(reader);
	}

}
