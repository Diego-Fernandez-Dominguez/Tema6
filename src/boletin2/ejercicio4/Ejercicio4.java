package boletin2.ejercicio4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

	static String FICHERO = "scr\\boletin2\\ejercicio4\\SecretoMuySecretoPeroMuchoEhhhhhNoLoDebeLeerNadie.txt";

	public static void main(String[] args) {

		/*
		 * String[] alf; String[] cod;
		 */
		char[] alf;
		char[] cod;

		char carac = 0;

		/*
		 * try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO));) {
		 * 
		 * alf = reader.readLine().split(" "); cod = reader.readLine().split(" ");
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

		try {
			FileReader reader = new FileReader(FICHERO);

			carac = (char) reader.read();
			
			while (carac != -1) {

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
