package exercicios_complementares_introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int segundos, minutos, horas;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		segundos = leia.nextInt();
		
		leia.close();
		
		horas = segundos / 3600;
		segundos = segundos % 3600;
		
		minutos = segundos/60;
		segundos = segundos % 60;
		
		System.out.printf("Valor formatado: %d:%d:%d" ,horas, minutos, segundos);
	}

}
	