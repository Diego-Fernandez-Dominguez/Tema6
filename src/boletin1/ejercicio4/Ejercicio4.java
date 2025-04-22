package boletin1.ejercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		String cad = "";

		Scanner reader = new Scanner(System.in);

		try (BufferedWriter esc = new BufferedWriter(new FileWriter("src\\boletin1\\ejercicio4\\Texto4.txt"))) {

			System.out.println("Dime el texto");
			cad = reader.nextLine();

			do {

				esc.write(cad);
				esc.newLine();

				System.out.println("Dime el texto");
				cad = reader.nextLine();

			} while (!cad.equalsIgnoreCase("fin"));

		} catch (IOException e) {
			System.err.println("Error de escritura en el fichero: " + e.getMessage());

		} finally {

		}

	}

}
