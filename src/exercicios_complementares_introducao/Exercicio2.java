package exercicios_complementares_introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float raio;
		double area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		raio = leia.nextFloat();
		
		leia.close();
		
		area = 3.14159 * (raio * raio);
		
		System.out.println("Área: " + area);

	}

}
