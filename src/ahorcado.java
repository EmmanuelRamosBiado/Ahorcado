import java.util.Arrays;
import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fallo = 0;
		int letrano = 0;
		boolean valor = false;

		System.out.print("Introduce el título de una película: ");

		String pelicula = sc.nextLine();
		String ahorcado = "AHORCADO";

		char array[] = pelicula.toCharArray();
		char array2[] = ahorcado.toCharArray();
		char oculto[] = new char[array.length];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {
				oculto[i] = '-';
			}
		}

		do {

			System.out.print("Introduce una letra: ");
			char letra = sc.next().toLowerCase().charAt(0);

			for (int i = 0; i < array.length; i++) {
				if (array[i] == letra) {
					oculto[i] = letra;
				} else {
					letrano++;
					if (letrano == oculto.length) {
						fallo++;
					}
				}
			}

			for (int i = 0; i < array.length; i++) {
				System.out.print(oculto[i]);
			}
			System.out.print("  --->  ");

			for (int i = 0; i < fallo; i++) {
				System.out.print(array2[i]);
			}

			System.out.println("");

			letrano = 0;

			if (Arrays.equals(array, oculto)) {
				valor = true;
			} 

		} while ((valor != true) && (fallo < 8));

		if (fallo == 8) {
			System.out.println("Has perdido.");
		}

		if (valor == true) {
			System.out.println("Has ganado.");
		}

	}

}
