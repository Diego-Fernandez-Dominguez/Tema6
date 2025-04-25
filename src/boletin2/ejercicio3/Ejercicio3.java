package boletin2.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

	static String FICHERO = "src\\boletin2\\ejercicio3\\Texto3.txt";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cont = 0;

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO));) {

			cad = reader.readLine();

			while (cont < 5 && cad != null) {

				System.out.println(cad);
				cad = reader.readLine();
				cont++;

				if (cont == 5) {
					sc.nextLine();
					cont = 0;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
