package LoopsDeRepeticaoo;

import java.util.Scanner;

public class PraticaWhile1 {

	public static void main(String[] args) {

		int idade=0,quantmenor=0,quantmaior=0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {

			if (idade > 50){
				
				quantmaior++;

				if (idade < 29) {
					quantmenor++;
				}
				System.out.println("\nEntre com a sua idade: ");
				idade = leia.nextInt();
		}
			System.out.println("\n"+quantmenor+" Pessoas com menos de 21 anos ");
			System.out.println("\n"+quantmaior+" pessoas com mais de 50 anos ");
			
		}
	
	}
}
