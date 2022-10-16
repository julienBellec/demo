package fr.jbellec.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe templates de code pour des méthodes de gestion de fichiers
 *
 * @author IJBE3080
 */
public class UseFlux {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("./data/exmple.txt").toAbsolutePath();
        Path dest = Files.createTempFile("unicode-uppercase-", null);

        System.out.println("Emplacement du fichier temporaire " + dest.toString());

        // Passage des fichiers en paramètre
        copyUpperCase(source, dest);

        // Passage de Reader / Writer en paramètre
        try (BufferedReader reader = Files.newBufferedReader(source); BufferedWriter writer = Files.newBufferedWriter(dest);) {
            copyUpperCase(reader, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Utilisation d'un StringWriter comme destination
        StringWriter stringWriter = new StringWriter();
        try (BufferedReader reader2 = Files.newBufferedReader(source); BufferedWriter writer2 = new BufferedWriter(stringWriter);) {
            copyUpperCase(reader2, writer2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(stringWriter.toString());

    }

    /**
     * Méthode plus restrictive : utilise en param des fichiers
     *
     * @param source emplacement du fichier source
     * @param dest   emplacement du fichier destinataire
     * @throws IOException exception liée au fichier
     */
    public static void copyUpperCase(Path source, Path dest) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(source); Writer writer = Files.newBufferedWriter(dest)) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase() + "\n");
            }
        }
    }

    /**
     * Méthode plus généraliste : elle prend en paramètre des flux
     *
     * @param reader flux d entrée
     * @param writer flux de sortie
     * @throws IOException exeption
     */
    public static void copyUpperCase(Reader reader, Writer writer) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            writer.write(line.toUpperCase() + "\n");
        }
    }
}
