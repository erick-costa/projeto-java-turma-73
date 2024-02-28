package laco_repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 int num=0, somaPositivos=0;
	        Scanner leia = new Scanner(System.in);

	        do {
	        	System.out.print("Digite um número: ");
	            num = leia.nextInt();
	            
	            if(num > 0) {
	            	somaPositivos += num;
	            }
	            
	        } while(num != 0);
	        
	        System.out.println("A soma dos números positivos é: " + somaPositivos);
	}
}