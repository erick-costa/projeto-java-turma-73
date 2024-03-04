package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01Collections {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("\nDigite a "+ (i+1) + "ª cor: ");
			cores.add(leia.next());
		}
		
		System.out.println("\nListar todas as cores:\n " + cores);
		
		cores.sort(null);
		
		System.out.println("\nListar todas as cores:\n " + cores);

	}

}
