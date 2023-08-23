package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc;
	private static File archivo;
	private static PrintWriter pr;
	private static ObjectInputStream ois;
	private static ObjectOutputStream ous;

	public FileHandler() {
		// TODO Auto-generated constructor stub
	}

	public static Properties cargarPropiedades(String nom_archivo) {

		File aux = new File("src/propiedades/" + nom_archivo);
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(aux));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
