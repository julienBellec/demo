package fr.jbellec.nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Template de code pour ouverture / lecture de fichier avec un try with ressource
 * 
 * @author IJBE3080
 *
 */
public class TryWithRessource {

    public static void main(String[] args) {

		String link = "https://nel-vip-va-r.pe-qvr.net/nel/jcms/24263719_Text/2019-08-01-08-42-12-titre-bo";
		
		link = link.substring(link.indexOf("jcms/", 0) +  "jcms/".length());
		System.out.println(link.substring(0, link.indexOf('/')));

    	
    	System.out.println("---------- First Method -----");
    	
        try (FileInputStream fis = new FileInputStream("./data/exmple.txt");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(fis, StandardCharsets.UTF_8))) {
            
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    	System.out.println("---------- Second Method -----");
        try {
            
        	Files.readAllLines(Paths.get("./data/exmple.txt")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}