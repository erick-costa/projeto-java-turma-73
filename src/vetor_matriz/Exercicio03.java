package vetor_matriz;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int l, c, somaPrincipal=0, somaSecundaria=0;
		
		Scanner leia = new Scanner(System.in);

		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				System.out.print("Digite o " + (l + 1)  +"º número da " + (c + 1) + "ª coluna: ");
	            matriz[l][c] = leia.nextInt();
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				if((l == 0 && c == 0) || (l == 1 && c == 1) || (l == 2 && c == 2)) {
					somaPrincipal += matriz[l][c];
					System.out.print(matriz[l][c] + " ");
				}
			}
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				if((l == 0 && c == 2) || (l == 1 && c == 1) || (l == 2 && c == 0)) {
					somaSecundaria += matriz[l][c];
					System.out.print(matriz[l][c] + " ");
				}
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSecundaria);
	}

}
