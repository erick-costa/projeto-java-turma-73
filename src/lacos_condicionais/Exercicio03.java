package lacos_condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int idade;
		String nome;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do(a) doador(a): ");
		nome = leia.nextLine();
		
		System.out.print("Digite a idade do(a) doador(a): ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue? (true/false) ");
		primeiraDoacao = leia.nextBoolean();
		
		leia.close();
		
		if(idade >= 18 && idade <= 69) {		
			if(idade >= 60 && primeiraDoacao) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			} else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
	}

}
