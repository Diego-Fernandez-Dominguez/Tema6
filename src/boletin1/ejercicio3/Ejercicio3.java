package boletin1.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
	public static void main(String[] args) {

		String cad;

		int sumaEdad = 0;

		double sumaEsta = 0;

		int cont = 0;

		String[] linea;

		try (BufferedReader lector = new BufferedReader(new FileReader("src\\boletin1\\ejercicio3\\Alumnos.txt"))) {
			cad = lector.readLine();

			do {

				linea = cad.split(" ");

				System.out.println(linea[0]);

				sumaEdad += Integer.parseInt(linea[1]);

				sumaEsta += Double.parseDouble(linea[2]);

				cont++;

				cad = lector.readLine();

			} while (cad != null);

			System.out.println("Media edad: " + (sumaEdad / cont));
			System.out.println("Media estatura: " + (sumaEsta / cont));

		} catch (FileNotFoundException e) {
			System.err.println("Error de lectura de archivo: " + e.getMessage());

		} catch (IOException e) {
			e.printStackTrace();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
