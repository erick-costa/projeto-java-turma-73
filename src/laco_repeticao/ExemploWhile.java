package laco_repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		String continua = "s";
        int numero1, numero2, resultado;
        Scanner leia = new Scanner(System.in);

        while (!continua.equals("n")) {
            System.out.print("Digite primeiro valor: ");
            numero1 = leia.nextInt();

            System.out.print("Digite segundo valor: ");
            numero2 = leia.nextInt();

            resultado = numero1 + numero2;

            System.out.println("O resultado da soma é: " + resultado);

            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("\nDeseja somar dois valores?");
            System.out.print("\nDigite s para sim OU digite n para não: ");
            continua = leia.next();
            System.out.println("++++++++++++++++++++++++++++++++++");
        }
	}
}