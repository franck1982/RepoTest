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


	/*
	 * remplir une Map qui contient les symptoms liés aux occurences
	 * 
	 */
	public void remplirMap(List<String> liste , Map<String,Integer> mapSymptoms )

	{
		int i =0;
		for(String element:liste)
		{
			i=1;
			if (mapSymptoms.keySet().contains(element))
				//incrémentez l' occurence du symptome
				i = mapSymptoms.get(element) + 1;
			//mettre à jour l'élément dans la Map avec la nouvelle occurence.
			mapSymptoms.put(element,i);
		}



	}
	

	/**
	 * 
	 *  la fonction execute pour créer une fichier de résultat
	 * ***/
	public void execute(ISymptomReader reader) {
		//mettre dans une methode execute dans Analytics counter
				//creer une liste qui contient tous les symptoms de la même façon que dans symptoms.txt
		
				List<String> liste = reader.GetSymptoms();
				// creer une TreeMap qui trie automatiquement le contenu par ordre alphabétique pour avoir un symptome lié à une occurence 
				Map<String,Integer> mapSymptoms = new TreeMap<String,Integer>();
				
				//remplir une Map qui contient les symptoms liés aux occurences
				remplirMap(liste, mapSymptoms);
				//remplir le Fichier result.txt .
				remplirFichier("result.txt" , mapSymptoms);
			

		


}
