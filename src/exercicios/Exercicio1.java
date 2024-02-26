package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo Salário: " + novoSalario);
	}

}
