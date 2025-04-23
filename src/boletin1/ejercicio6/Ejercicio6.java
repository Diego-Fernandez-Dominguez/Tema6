package boletin1.ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio6 {
	public static void main(String[] args) {

		final String FICHERO1 = "src\\boletin1\\ejercicio6\\Desordenados.txt";
		final String FICHERO2 = "src\\boletin1\\ejercicio6\\Ordenados.txt";

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO1))) {

			BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO2));

			cad = reader.readLine();

			do {
				numeros.add(Integer.parseInt(cad));

				cad = reader.readLine();

			} while (cad != null);

			numeros.sort((a, b) -> {
				return a - b;
			});

			for (int num : numeros) {

				writer.write(num);
				writer.newLine();

			}

			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error, archivo no encontrado: " + e.getMessage());

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		/*
		 * try (Scanner reader = new Scanner(new FileReader(FICHERO1))) {
		 * 
		 * BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO2));
		 * 
		 * numerin = reader.nextInt();
		 * 
		 * do { numeros.add(numerin);
		 * 
		 * numerin = reader.nextInt();
		 * 
		 * } while (reader.hasNextInt());
		 * 
		 * numeros.sort((a, b) -> { return a - b; });
		 * 
		 * for (int num : numeros) {
		 * 
		 * writer.write(num); writer.newLine();
		 * 
		 * }
		 * 
		 * writer.flush(); writer.close();
		 * 
		 * } catch (FileNotFoundException e) {
		 * System.err.println("Error, archivo no encontrado: " + e.getMessage());
		 * 
		 * } catch (IOException e1) { e1.printStackTrace(); }
		 */

	}

}
