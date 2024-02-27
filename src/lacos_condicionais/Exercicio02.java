package lacos_condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		leia.close();
		
		if(num%2 == 0 && num >= 0) {			
			System.out.println("O Número " + num + " é par e positivo!");
		} else if(num%2 == 0 && num < 0) {
			System.out.println("O Número " + num + " é par e negativo!");
		} else if(num%2 != 0 && num >= 0) {
			System.out.println("O Número " + num + " é ímpar e positivo!");
		} else {
			System.out.println("O Número " + num + " é ímpar e negativo!");
		}
	}

}
