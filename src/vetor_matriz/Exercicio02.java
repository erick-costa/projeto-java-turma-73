package vetor_matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int soma = 0, vetorInteiros[] = new int[10];
		float media;
		
        Scanner leia = new Scanner(System.in);
        
        for(int indice = 0; indice < 10; indice ++) {
            System.out.print("Digite o " + (indice + 1)  +"º Número: ");
            vetorInteiros[indice] = leia.nextInt();
            
            soma += vetorInteiros[indice];
        }
        
        System.out.println("Elementos nos índices ímpares: ");
        
        for(int indice = 0; indice < 10; indice++) {
        	if(indice % 2 != 0) {
        		System.out.print(vetorInteiros[indice] + " ");
        	}
        }
        
        System.out.println("\nElementos pares: ");
        
        for(int indice = 0; indice < 10; indice++) {
        	if(vetorInteiros[indice] % 2 == 0) {
        		System.out.print(vetorInteiros[indice] + " ");
        	}
        }
        
        System.out.println("\nSoma: " + soma);
        
        media = soma / 10;
        
        System.out.println("Média: " + media);
	}
	
}