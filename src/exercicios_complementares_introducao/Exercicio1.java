package exercicios_complementares_introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b;
		float soma, diferenca, multiplicacao, divisao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = leia.nextInt();
		
		leia.close();
		
		soma = a + b;
		diferenca = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Diferença: " + diferenca);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);

	}

}
