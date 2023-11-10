package LoopsDeRepeticaoo;

import java.util.Scanner;

public class PraticaFor2 {

	public static void main(String[] args) {
		
		int num,quantpar=0,quantimpar=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				quantpar++;
			}else {
				quantimpar++;
			}
		}
		
			System.out.println("\nTemos: "+quantpar+" numeros par e "+quantimpar+" numeros impar");
	}

}
