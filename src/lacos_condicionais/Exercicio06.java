package lacos_condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int cod;
		String nome;
		float salario;
		double novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo: ");
		cod = leia.nextInt();
		
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		leia.close();
		
		switch(cod) {
		case 1:
			novoSalario = salario + (0.1 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (0.07 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08 * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Novo Salário: R$" + novoSalario);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

	}

}
