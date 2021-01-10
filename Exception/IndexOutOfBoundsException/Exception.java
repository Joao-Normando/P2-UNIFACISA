package programa;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// EXEMPLO DE ERRO DE EXCEÇÃO ESTOURO DE BUSCA LIMITE DO VECTOR
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid position!");
		}
		System.out.println("End of program");
		sc.close();
		}

	}

