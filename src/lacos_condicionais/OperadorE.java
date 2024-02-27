package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		int idade;
		boolean carteiraM;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.print("Você tem carteira de habilitação? (true/false) ");
		carteiraM = leia.nextBoolean();
		
		leia.close();
		
		if(idade >= 18 && carteiraM) {
			System.out.print("Você pode dirigir! =D");
		} else {
			System.out.print("Você não pode dirigir! :(");
		}
	}

}
