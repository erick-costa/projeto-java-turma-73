package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, y;		
			
		System.out.print("Digite um valor para X: ");
		x = leia.nextInt();
		System.out.print("Digite um valor para Y: ");
		y = leia.nextInt();
		
		leia.close();
		
		if(x > y) {
			System.out.print("X maior que Y ");
		} else if(x == y) {
			System.out.print("Não tem maior: ");
		} else {
			System.out.print("Y maior que X ");
		}
		 
	}

}
