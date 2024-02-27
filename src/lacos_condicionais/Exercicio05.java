package lacos_condicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int cod, qtd, total;		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: ");
		cod = leia.nextInt();
		
		System.out.print("Digite a quantidade: ");
		qtd = leia.nextInt();
		
		leia.close();
		
		switch(cod) {
		case 1:
			total = 10 * qtd;
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: R$" + total);
			break;
			
		case 2:
			total = 15 * qtd;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$" + total);
			break;
		case 3:
			total = 18 * qtd;System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: R$" + total);
			break;
		case 4:
			total = 12 * qtd;
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: R$" + total);
			break;
		case 5:
			total = 8 * qtd;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: R$" + total);
			break;
		case 6:
			total = 13 * qtd;
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: R$" + total);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
			

	}

}
