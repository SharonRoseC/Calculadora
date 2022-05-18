package calculadoraMain;

import calculadoraPackage.CalculadoraCientifica;

import java.util.Scanner;

public class CasesCalculadoraCientifica {

    public void resultado() {
        Scanner input = new Scanner(System.in);
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        int opcao = 0;
        do {
            System.out.println("=================================\n" +
                    "|	--------Calculadora Cientifica--------- |\n" +
                    "|	----------------------------------------|\n" +
                    "|	Escolha uma opção	                    |\n" +
                    "|	----------------------------------------|\n" +
                    "|	1 - Potência		                    |\n" +
                    "|	2 - Raiz quadrada	                    |\n" +
                    "|	3 - Seno		                        |\n" +
                    "|	4 - Cosseno		                        |\n" +
                    "|	5 - Tangente		                    |\n" +
                    "|	6 - Logaritmo		                    |\n" +
                    "|	0 - Voltar para o menu                  |\n" +
                    "=================================\n");
            System.out.println("Digite sua opcao:");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Informe um número para calcular a potência");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.println("Informe o expoente a elevar:");
                    calcCientifica.setNum2(input.nextDouble());
                    System.out.printf("%.1f %s %.1f = %.1f\n", calcCientifica.getNum1(), "**", calcCientifica.getNum2(), calcCientifica.exponenciar());
                    break;
                case 2:
                    System.out.println("Informe um número para calcular a raiz quadrada");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.printf(printaNumerosCalcCientifica(calcCientifica.getNum1(), "√", calcCientifica.calcularRaizQuadrada()));
                    break;
                case 3:
                    System.out.println("Informe um número para calcular o seno");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.printf(printaNumerosCalcCientifica(calcCientifica.getNum1(), "sin()", calcCientifica.calcularSeno()));
                    break;
                case 4:
                    System.out.println("Informe um número para calcular o cosseno");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.printf(printaNumerosCalcCientifica(calcCientifica.getNum1(), "cos()", calcCientifica.calcularCosseno()));
                    break;
                case 5:
                    System.out.println("Informe um número para calcular a tangente");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.printf(printaNumerosCalcCientifica(calcCientifica.getNum1(), "tan()", calcCientifica.calcularTangente()));
                    break;
                case 6:
                    System.out.println("Informe um número para calcular o logaritmo");
                    calcCientifica.setNum1(input.nextDouble());
                    System.out.printf(printaNumerosCalcCientifica(calcCientifica.getNum1(), "log10", calcCientifica.calcularLogaritmo()));
                    break;
                default:
                    if(opcao == 0){
                        System.out.println("Voltando para o menu");
                    }else {
                        System.out.println("Opção indisponivel");
                    }

            }
        }while (opcao != 0);
    }

    private String printaNumerosCalcCientifica(double num1, String sinal, double resultado) {
        if (num1 % 1 != 0 || resultado % 1 != 0) {
            return String.format("%s %.2f = %.2f\n", sinal, num1, resultado);
        } else {
            return String.format("%s %.0f = %.0f\n", sinal, num1, resultado);
        }
    }


}
