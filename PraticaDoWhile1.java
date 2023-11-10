package LoopsDeRepeticaoo;

import java.util.Scanner;

public class PraticaDoWhile1 {

	public static void main(String[] args) {

		int somaP = 0, num;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\ndigite numeros ou 0 para sair ");
			num = leia.nextInt();

			if (num > 0) {
				somaP += num;
			} else if (num < 0) {

			}

		} while (num != 0);

		System.out.println("\nnumeros positivos " + somaP);

	}

}
