import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;
		
		while (opcao!=6) {
			FuncoesUteis.exibirMenu(); 
			opcao = leitor.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			
			case 2:
				System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
				
				System.out.println("O resultado foi " + FuncoesUteis.somar(valor1, valor2) + "!\n\n");
				
				break;
				
			case 3:
				System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
				System.out.println("O resultado foi " + FuncoesUteis.subtrair(valor1, valor2) + "!\n\n");
				break;
				
			case 4:
				System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
				System.out.println("O resultado foi " + FuncoesUteis.dividir(valor1, valor2) + "!\n\n");
				break;
				
			case 5:
				System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
				System.out.println("O resultado foi " + FuncoesUteis.multiplicar(valor1, valor2) + "!\n\n");
				break;
				
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
