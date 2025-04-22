package boletin1.ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		double num;
		double suma = 0;
		double media;
		int cont = 0;

		try (Scanner reader = new Scanner(new FileReader("src\\boletin1\\ejercicio1\\NumerosReales.txt"));) {

			while (reader.hasNextDouble()) {
				num = reader.nextDouble();
				suma += num;
				cont++;
			}

			media = suma / cont;

			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);

			reader.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error al leer el archivo " + e.getMessage());
		}

	}

}
