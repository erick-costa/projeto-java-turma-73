package vetor_matriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num, vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == num) {
				System.out.println("O número " + num + " está localizado na posição: " + i);
				break;
			} else if(i == 9) {				
				System.out.println("O número " + num + " não foi encontrado");
			}
		}
	}

}
