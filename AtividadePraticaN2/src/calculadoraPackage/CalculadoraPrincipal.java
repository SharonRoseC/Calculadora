package calculadoraPackage;

import java.util.Scanner;

public class CalculadoraPrincipal {
	static Scanner input = new Scanner(System.in);
	
	static void printaNumerosCalcComum(double num1, double num2, String sinal, double resultado) {
		if (num1 % 1 != 0 || num2 % 1 != 0 || resultado % 1 != 0) {						
			System.out.printf("%.2f %s %.2f = %.2f\n", num1, sinal, num2, resultado);
		} else {
			System.out.printf("%.0f %s %.0f = %.0f\n", num1, sinal, num2, resultado);
		}
	}
	
	static void printaNumerosCalcCientifica(double num1, String sinal, double resultado) {
		if (num1 % 1 != 0 || resultado % 1 != 0) {						
			System.out.printf("%s %.2f = %.2f\n", sinal, num1, resultado);
		} else {
			System.out.printf("%s %.0f = %.0f\n", sinal, num1, resultado);
		} 
	}
	
	public static void main(String ...args) {
		CalculadoraComum calcComum = new CalculadoraComum();
		
		CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
		
		int opcao = -1;
		int escolhaCalculadora = 0;
		
		try {
			System.out.println("=========================================\n" +
							   "|	----------MENU----------	|\n" +
							   "|	------------------------	|\n" +
							   "|	Escolha a calculadora		|\n" +
							   "|	------------------------	|\n" +
							   "|	1 - Calculadora Comum		|\n" +
							   "|	2 - Calculadora Científica	|\n" +
							   "|	0 - Sair			|\n" +
							   "=========================================\n");
		
		escolhaCalculadora = input.nextInt();
			if (escolhaCalculadora == 1) {
				while (opcao != 0) {	
					System.out.println("=================================\n" +
								   		"|	--------MENU--------	|\n" +
								   		"|	--------------------	|\n" +
								   		"|	Escolha uma opção	|\n" +
								   		"|	--------------------	|\n" +
								   		"|	1 - Somar		|\n" +
								   		"|	2 - Subtrair		|\n" +
								   		"|	3 - Multiplicar		|\n" +
								   		"|	4 - Dividir		|\n" +
								   		"|	0 - Sair		|\n" +
						   				"=================================\n");
					opcao = input.nextInt();
					
					switch(opcao) {
						case 1:
							System.out.println("Informe o primeiro numero");
							calcComum.setNum1(input.nextDouble());
							System.out.println("Informe o segundo numero");
							calcComum.setNum2(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "+", calcComum.soma());
							break;
						case 2:
							System.out.println("Informe o primeiro numero");
							calcComum.setNum1(input.nextDouble());
							System.out.println("Informe o segundo numero");
							calcComum.setNum2(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "-", calcComum.subtracao());
							break;
						case 3:
							System.out.println("Informe o primeiro numero");
							calcComum.setNum1(input.nextDouble());
							System.out.println("Informe o segundo numero");
							calcComum.setNum2(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "x", calcComum.multiplicacao());
							break;
						case 4:
							System.out.println("Informe o primeiro numero");
							calcComum.setNum1(input.nextDouble());
							System.out.println("Informe o segundo numero");
							calcComum.setNum2(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "/", calcComum.dividir());
							break;
						default:
							System.out.println("Opção indisponivel");
					}
				}
		} else {
				while (opcao != 0) {	
					System.out.println("=================================\n" +
								   		"|	--------MENU--------	|\n" +
								   		"|	--------------------	|\n" +
								   		"|	Escolha uma opção	|\n" +
								   		"|	--------------------	|\n" +
								   		"|	1 - Potência		|\n" +
								   		"|	2 - Raiz quadrada	|\n" +
								   		"|	3 - Seno		|\n" +
								   		"|	4 - Cosseno		|\n" +
								   		"|	5 - Tangente		|\n" +
								   		"|	6 - Logaritmo		|\n" +
								   		"|	0 - Sair		|\n" +
						   				"=================================\n");
					opcao = input.nextInt();
					
					switch(opcao) {
						case 1:
							System.out.println("Informe um número para calcular a potência");
							calcCientifica.setNum1(input.nextDouble());
							System.out.println("Informe o expoente a elevar:");
							calcCientifica.setExpoente(input.nextDouble());
							System.out.printf("%.1f %s %.1f = %.1f\n", calcCientifica.getNum1(), "**", calcCientifica.getExpoente(), calcCientifica.exponenciar());
							break;
						case 2:
							System.out.println("Informe um número para calcular a raiz quadrada");
							calcCientifica.setNum1(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcCientifica(calcCientifica.getNum1(), "√", calcCientifica.calcularRaizQuadrada());
							break;
						case 3:
							System.out.println("Informe um número para calcular o seno");
							calcCientifica.setNum1(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcCientifica(calcCientifica.getNum1(), "sin()", calcCientifica.calcularSeno());
							break;
						case 4:
							System.out.println("Informe um número para calcular o cosseno");
							calcCientifica.setNum1(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcCientifica(calcCientifica.getNum1(), "cos()", calcCientifica.calcularCosseno());
							break;
						case 5:
							System.out.println("Informe um número para calcular a tangente");
							calcCientifica.setNum1(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcCientifica(calcCientifica.getNum1(), "tan()", calcCientifica.calcularTangente());
							break;
						case 6:
							System.out.println("Informe um número para calcular o logaritmo");
							calcCientifica.setNum1(input.nextDouble());
							CalculadoraPrincipal.printaNumerosCalcCientifica(calcCientifica.getNum1(), "log10", calcCientifica.calcularLogaritmo());
							break;
						default:
							System.out.println("Opção indisponivel");
					}
				}
			}
		} catch(Exception err) {
			System.out.println(err);
		}
	}
}