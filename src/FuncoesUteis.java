
public class FuncoesUteis {
	

	public static void exibirMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
		System.out.println("6 - Sair");
	}
	
	public static double somar(double v1, double v2) {
		return v1 + v2;
		}

	public static double subtrair(double v1, double v2) {
		return v1 - v2;
		}

	public static double dividir(double v1, double v2) {
		if (v2==0) {
		return 0;
		}else {
		return v1 / v2;
		}
		}

	public static double multiplicar(double v1, double v2) {
		return v1 * v2;
		}
	
}
