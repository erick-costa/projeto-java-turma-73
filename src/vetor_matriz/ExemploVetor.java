package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		String cachorros[]= new String[3];
		int indice;

		Scanner leia = new Scanner(System.in);
		
		for(indice = 0; indice < 3; indice++) {
			System.out.print("Digite o nome: ");
			cachorros[indice] = leia.nextLine();
		}
		
		for(indice = 0; indice < cachorros.length; indice++) {
			System.out.println("Cachorros[" + indice +"]: " + cachorros[indice] );
		}
	}

}
