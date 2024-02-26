package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite sua(s) hora(s) extra(s): ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Digite o desconto: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salário Líquido: " + salarioLiquido);

	}

}
