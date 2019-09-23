package pl.blackcat.kursjava.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbe: ");
		double liczba;

		while (true) {
			try {
				liczba = scanner.nextDouble();
				break;
			} catch (InputMismatchException exception) {
				System.out.println("To co podałeś, zdecydowanie nie jest liczbą.");
				System.out.print("Spróbuj jeszcze raz: ");
				scanner.next();

			}
		}

		if (liczba < 0) {
			throw new IllegalArgumentException("Pierwiastek rzeczywisty z liczby ujemnej nie istnieje!");
		} else {
			System.out.println("Pierwiastek rzeczywisty z liczby " + liczba + " wynosi: " + Math.sqrt(liczba));
		}


	}
}
