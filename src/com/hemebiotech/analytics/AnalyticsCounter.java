package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter{

	/*
	 * remplir un fichier qui contient les symptoms triés liés aux occurences
	 * 
	 */

	public void remplirFichier(String pathResult , Map<String,Integer> mapSymptoms  ) 

	{

       //try-with-ressource pour fermer automatiquement le Writer 
		
		try(FileWriter writer = new FileWriter (pathResult))
		{

			//parcours tous les symptomes dans la Map 
			for(String element:mapSymptoms.keySet())
			{
				//ecrire chaque symptome avec son occurence
				writer.write(element +" : "+mapSymptoms.get(element) + "\n");
				System.out.println(element +" : "+mapSymptoms.get(element));
			}

		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
	

	}

	@Override
	public void remplirMap(List<String> liste, Map<String, Integer> mapSymptoms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(ISymptomReader reader) {
		// TODO Auto-generated method stub
		
	}



}
