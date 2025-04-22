package boletin1.ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int num;
		int suma = 0;
		int media;
		int cont = 0;

		try (Scanner reader = new Scanner(new FileReader("src\\boletin1\\ejercicio2\\Enteros.txt"));) {

			while (reader.hasNextInt()) {
				num = reader.nextInt();
				suma += num;
				cont++;
			}

			media = suma / cont;

			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);

			reader.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error de lectura: " + e.getMessage());
		}

	}

}
