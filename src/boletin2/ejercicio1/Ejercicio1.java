package boletin2.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

	static String FICHERO = "src\\boletin2\\ejercicio1\\carta.txt";

	public static void main(String[] args) {

		String cad = "";

		int caracteres = 0;

		int lineas = 0;

		int palabras = 0;

		String arrayPala[];

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO));) {

			cad = reader.readLine();

			System.out.println(cad);

			// Deberia ser un while, pero me da pereza cmabiarlo :b
			do {

				lineas++;

				arrayPala = cad.split(" ");

				palabras += arrayPala.length;

				for (int i = 0; i < arrayPala.length; i++) {

					caracteres += arrayPala[i].length();

				}

				cad = reader.readLine();

			} while (cad != null);

			System.out.println("Caracteres: " + caracteres);
			System.out.println("Lineas: " + lineas);
			System.out.println("Palabras: " + palabras);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
