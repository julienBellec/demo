package fr.jbellec.nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Template de code pour ouverture / lecture de fichier avec un try with ressource
 * 
 * @author IJBE3080
 *
 */
public class TryWithRessource {

    public static void main(String[] args) {

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

    }
}