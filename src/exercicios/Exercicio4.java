package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		leia.close();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);

	}

}
