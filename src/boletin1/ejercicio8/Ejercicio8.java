package boletin1.ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {

	static String FICHERO = "src\\boletin1\\ejercicio8\\Temperaturas.txt";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = -1;

		do {

			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1 -> {
				escribirDatos();
			}

			case 2 -> {
				mostrarDatos();
			}

			case 3 -> {
				System.out.println("Adioh");

			}

			default -> {
				System.out.println("Opcion no valida");

			}
			}

		} while (opc != 3);
	}

	public static void menu() {

		System.out.println("1. Registra nueva temperatura.");
		System.out.println("2. Mostrar historial de registros.");
		System.out.println("3. Salir.");

	}

	public static void escribirDatos() {

		String fecha = "";

		int max;

		int min;

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO, true));) {
			BufferedReader reader = new BufferedReader(new FileReader(FICHERO));

			if (reader.readLine() == null ) {
				writer.write("Fecha, Temperatura máxima, Temperatura mínima");
				writer.newLine();
			}

			System.out.println("Dime la fecha (año-mes-dia): ");
			fecha = sc.nextLine();

			System.out.println("Dime la temperatura max: ");
			max = sc.nextInt();

			System.out.println("Dime la temperatura min: ");
			min = sc.nextInt();

			writer.newLine();
			writer.write(fecha + ", " + max + ", " + min);
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void mostrarDatos() {

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO))) {

			cad = reader.readLine();
			cad = reader.readLine();

			do {

				System.out.println(cad);

				cad = reader.readLine();

			} while (cad != null);

		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado: " + e.getMessage());
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
