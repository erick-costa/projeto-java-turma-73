package lacos_condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		c = leia.nextInt();
		
		leia.close();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if(soma == c) {
			System.out.println("A Soma de A + B é Igual a C");
		} else {
			System.out.println("A Soma de A + B é Menor do que C");
		}
	}

}
