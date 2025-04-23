package boletin1.ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	static String FICHERO = "src\\boletin1\\ejercicio7\\Contactos.txt";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		TreeMap<String, Integer> contactos = new TreeMap<String, Integer>();

		int opc = -1;

		String nombre = "";

		int telefono;

		do {

			menu();
			System.out.println("Elige una opcion");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1 -> {

				System.out.println("Dime el nombre: ");
				nombre = sc.nextLine();

				System.out.println("Dime el numero: ");
				telefono = sc.nextInt();

				if (contactos.size() == 20) {
					System.out.println("Compa, no se puede anyadir");

				} else {
					contactos.put(nombre, telefono);
				}

			}

			case 2 -> {
				System.out.println("Dime el nombre: ");
				nombre = sc.nextLine();

				if (contactos.containsKey(nombre)) {
					System.out.println(contactos.get(nombre));
				} else {
					System.out.println("No existe ese contacto");
				}
			}

			case 3 -> {
				System.out.println(contactos.toString());
			}

			case 4 -> {

				sacarListaOrdenada(contactos);
				System.out.println("Adioh");
			}

			default -> {
				System.out.println("Opcion no valida");

			}
			}

		} while (opc != 4);
	}

	public static void menu() {

		System.out.println("1. Nuevo contacto.");
		System.out.println("2. Buscar por nombre.");
		System.out.println("3. Mostrar todos.");
		System.out.println("4. Salir.");

	}

	public static void sacarListaOrdenada(TreeMap<String, Integer> mapa) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO, true));) {

			mapa.forEach((nombre, telefono) -> {
				try {
					writer.write(nombre + ": " + telefono);
					writer.newLine();
					writer.flush();

				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		} catch (IOException e) {
			e.getMessage();
		}

	}

}
