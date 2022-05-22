import java.util.ArrayList;
import java.util.Random;

public class ValoresAleatorios {

	public static void main(String[] args) {

		int tamaño;
		int valor;
		Random rd = new Random();

		ArrayList<Integer> tabla = new ArrayList<Integer>();

		tamaño = rd.nextInt(20) + 10;

		for (int i = 0; i <= tamaño; i++) {
			valor = rd.nextInt(101);
			tabla.add(valor);
		}

		mostrar(tabla);

		suma(tabla);

		borrarPares(tabla);

		divisiblesPor3(tabla);

		valor555(tabla);

	}

	public static void mostrar(ArrayList<Integer> tabla) {
		System.out.println("Contenido = " + tabla);
	}

	public static void suma(ArrayList<Integer> tabla) {
		int suma = 0;
		for (int valor : tabla) {
			suma += valor;
		}
		System.out.println("La suma es = " + suma);
	}

	public static void borrarPares(ArrayList<Integer> tabla) {
		tabla.removeIf(x -> x % 2 == 0);
		System.out.println("Contenido sin pares = " + tabla);
	}

	public static void divisiblesPor3(ArrayList<Integer> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			int num = tabla.get(i);
			if (num % 3 == 0) {
				tabla.set(i, 0);
			}
		}
		System.out.println("Contenido sin divisores de 3 = " + tabla);
	}

	public static void valor555(ArrayList<Integer> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			int num = tabla.get(i);
			if (num != 0 && num % 5 == 0) {
				tabla.add(i, 555);
				i++;
			}
		}
		System.out.println("Contenido con 555 en div 5 = " + tabla);
	}
}
