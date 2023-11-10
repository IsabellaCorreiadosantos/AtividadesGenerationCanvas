package LoopsDeRepeticaoo;

import java.util.Scanner;

public class PraticaFor1 {

	public static void main(String[] args) {
		
		
		int n1, n2;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();// 5
		System.out.println("\nDigite o último número do intervalo:: ");
		n2 = leia.nextInt();// 5

		if (n1 > n2) {
			System.out.println("\nIntervalo inválido!\r\n");
		} else {
			for (int index = n1; index <= n2; index++) {
				if (index % 3 == 0 && index % 5 == 0) {
					System.out.println(index + " é multiplo de 3 e 5");
				}
			}

		}
		
	}
}