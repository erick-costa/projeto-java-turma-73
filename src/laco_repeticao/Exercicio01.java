package laco_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int contador, num1, num2;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite primeiro número do intervalo: ");
        num1 = leia.nextInt();

        System.out.print("Digite segundo número do intervalo: ");
        num2 = leia.nextInt();
        
        leia.close();
        
        if(num1 < num2) {
        	for(contador=num1; contador <= num2; contador++) { 
        		if(contador%3==0 && contador%5==0) {
        			System.out.println(contador + " é múltiplo de 3 e 5");
        		}
        	}
        } else {
        	System.out.println("Intervalo inválido!");
        }
	}
}