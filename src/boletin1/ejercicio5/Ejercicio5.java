package boletin1.ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		final String FICHERO = "src\\boletin1\\ejercicio5\\datos.txt";
		String cad = "";

		int num = 0;

		Scanner reader = new Scanner(System.in);

		try (BufferedWriter esc = new BufferedWriter(new FileWriter(FICHERO, true))) {

			System.out.println("Dime tu nombre");
			cad = reader.nextLine();

			System.out.println("Dime tu edad");
			num = reader.nextInt();

			esc.write(cad + " " + num);

			esc.newLine();

			esc.flush();

		} catch (IOException e) {
			System.err.println("Error de escritura en el fichero: " + e.getMessage());
		}
		reader.close();
	}

}
