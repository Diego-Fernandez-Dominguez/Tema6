package boletin1.ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio6 {

	final static String FICHERO1 = "src\\boletin1\\ejercicio6\\Desordenados.txt";

	final static String FICHERO2 = "src\\boletin1\\ejercicio6\\Ordenados.txt";

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros = leer();

		numeros.sort((a, b) -> {
			return a - b;
		});

		escribir(numeros);

	}

	public static ArrayList<Integer> leer() {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO1))) {

			cad = reader.readLine();

			do {
				lista.add(Integer.parseInt(cad));

				cad = reader.readLine();

			} while (cad != null);

		} catch (FileNotFoundException e) {
			System.err.println("Error, archivo no encontrado: " + e.getMessage());

		} catch (IOException e) {
			e.getMessage();
		}

		return lista;

	}

	public static void escribir(ArrayList<Integer> lista) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO2))) {

			for (int num : lista) {

				writer.write(String.valueOf(num));
				writer.newLine();

			}

			writer.flush();
			writer.close();

		} catch (IOException e) {

			e.getMessage();
		}

	}
}
