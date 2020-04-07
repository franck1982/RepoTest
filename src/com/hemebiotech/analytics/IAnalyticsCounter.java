package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface IAnalyticsCounter {
	/*
	 * remplir un fichier qui contient les symptoms triés liés aux occurences
	 * 
	 */

	public void remplirFichier(String pathResult , Map<String,Integer> mapSymptoms  ) ;

	
	
	/*
	 * remplir une Map qui contient les symptoms liés aux occurences
	 * 
	 */
	public void remplirMap(List<String> liste , Map<String,Integer> mapSymptoms );


	
	public void execute(ISymptomReader reader) ;
	
}
