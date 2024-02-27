package lacos_condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String grupo, tipo, alimentacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o grupo (vertebrado/invertebrado): ");
		grupo = leia.next();
		
		System.out.print("Digite o tipo do animal (ave/mamifero/inseto/anelideo): ");
		tipo = leia.next();
		
		System.out.print("Digite a alimentação (carnivoro/onivoro/herbivoro/hematofago) ");
		alimentacao = leia.next();
		
		leia.close();
		
		if(grupo.equals("vertebrado")) {
			if(tipo.equals("ave")) {
				if(alimentacao.equals("carnivoro")) {
					System.out.println("Águia");
				} else if(alimentacao.equals("onivoro")) {
					System.out.println("Pomba");
				}
			}
			else if(tipo.equals("mamifero")) {
				if(alimentacao.equals("onivoro")) {
					System.out.println("Homem");
				} else if(alimentacao.equals("herbivoro")) {
					System.out.println("Vaca");
				}
			}
		} else if(grupo.equals("invertebrado")) {
			if(tipo.equals("inseto")) {
				if(alimentacao.equals("hematofago")) {
					System.out.println("Pulga");
				} else if(alimentacao.equals("herbivoro")) {
					System.out.println("Lagarta");
				}
			}
			else if(tipo.equals("anelideo")) {
				if(alimentacao.equals("hematofago")) {
					System.out.println("Sanguessuga");
				} else if(alimentacao.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		
	}

}
