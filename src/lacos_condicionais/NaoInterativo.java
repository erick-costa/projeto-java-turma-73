package lacos_condicionais;

public class NaoInterativo {

	public static void main(String[] args) {
//		int idade = 10;
//		
//		if(idade >= 18) {
//			System.out.println("Você é maior de idade");
//		}
//		else {
//			System.out.println("Você é menor de idade");
//		}
		
		int x = 5, y = 10;
		
		if(x > y) {
			System.out.print("X maior que Y ");
		} else if(x == y) {
			System.out.print("Não tem maior: ");
		} else {
			System.out.print("Y maior que X ");
		}

	}

}
