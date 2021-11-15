package org.generation.italy.security;

public class PasswordGenerator {
	public static void main(String[] args) {
		//commento a caso
		
		String nome = "Pinco";
		String cognome = "Pallo";
		String colore = "magenta";
		int giorno = 12;
		int mese = 5;
		int anno = 1994;
		int data = giorno + mese + anno;
		String password = nome + "-" + cognome + "-" + colore + "-" + data;
		System.out.println("La password è: " + password);
		System.out.println(password);
	}
}
