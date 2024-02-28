package laco_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
        int idade=0, menores21=0, maiores50=0;
        Scanner leia = new Scanner(System.in);

        while (idade >= 0) {
            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();

            if(idade >= 0 && idade < 21) {
            	menores21++;
            } else if(idade >= 0 && idade > 50) {
            	maiores50++;
            }
        }
        
        System.out.println("Total de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
	}
}