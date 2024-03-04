package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Estruturas {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("        1 - Adicionar cliente na fila");
		System.out.println("        2 - Listar todos os clientes");
		System.out.println("        3 - Retirar cliente da fila");
		System.out.println("        0 - Sair");
		System.out.println("**********************************************");
		
		do {	
			System.out.print("\nDigite uma opção: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 0:
				System.out.print("Programa finalizado!");
				break;
				
			case 1:
				System.out.print("Digite o nome: ");
				fila.add(leia.next());
				System.out.println("\nCliente adicionado!");
				break;
				
			case 2:
				System.out.println("\nLista de clientes na fila:");
				System.out.println(fila);
				break;
				
			case 3:
				if(!fila.isEmpty()) {
					System.out.println("\nFila:");
					fila.remove();
					System.out.print(fila);
					System.out.println("\nO cliente foi chamado!");
				} else {
					System.out.println("\nA fila está vazia!");
				}
				break;
				
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while(opcao != 0);	
		
		leia.close();
	}
}