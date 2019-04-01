package fr.jbellec.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesUtils {

	public static void main(String[] args)  {

	       listeDirectories("./data/");
	     
	}

	private static void listeDirectories(String path) {
	       Path source = Paths.get("./data/").toAbsolutePath();
	       try {
			Files.list(source).filter(f -> f.toFile().isDirectory()).sorted().forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}