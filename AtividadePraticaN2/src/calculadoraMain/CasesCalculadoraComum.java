package calculadoraMain;

import calculadoraPackage.CalculadoraComum;
import java.util.Scanner;

public class CasesCalculadoraComum {

    public void resultado() {
        Scanner input = new Scanner(System.in);
        CalculadoraComum calcComum = new CalculadoraComum();
        int opcao = 0;
        do {
            System.out.println("=================================\n" +
                    "|	--------Calculadora Comum--------|\n" +
                    "|	---------------------------------|\n" +
                    "|	        Escolha uma opção	     |\n" +
                    "|	---------------------------------|\n" +
                    "|	1 - Somar		                 |\n" +
                    "|	2 - Subtrair		             |\n" +
                    "|	3 - Multiplicar		             |\n" +
                    "|	4 - Dividir		                 |\n" +
                    "|	0 - Voltar para o menu		     |\n" +
                    "=================================\n");
            System.out.println("Digite sua opcao:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o primeiro numero");
                    calcComum.setNum1(input.nextDouble());
                    System.out.println("Informe o segundo numero");
                    calcComum.setNum2(input.nextDouble());
                    System.out.printf(printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "+", calcComum.soma()));
                    break;
                case 2:
                    System.out.println("Informe o primeiro numero");
                    calcComum.setNum1(input.nextDouble());
                    System.out.println("Informe o segundo numero");
                    calcComum.setNum2(input.nextDouble());
                    System.out.printf(printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "-", calcComum.subtracao()));;
                    break;
                case 3:
                    System.out.println("Informe o primeiro numero");
                    calcComum.setNum1(input.nextDouble());
                    System.out.println("Informe o segundo numero");
                    calcComum.setNum2(input.nextDouble());
                    System.out.printf(printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "x", calcComum.multiplicacao()));
                    break;
                case 4:
                    System.out.println("Informe o primeiro numero");
                    calcComum.setNum1(input.nextDouble());
                    System.out.println("Informe o segundo numero");
                    calcComum.setNum2(input.nextDouble());
                    System.out.printf(printaNumerosCalcComum(calcComum.getNum1(), calcComum.getNum2(), "/", calcComum.dividir()));
                    break;
                default:
                    if(opcao == 0){
                        System.out.println("Voltando para o menu");
                    }else {
                        System.out.println("Opção indisponivel");
                    }

            }
        } while (opcao != 0);

    }

    private String printaNumerosCalcComum(double num1, double num2, String sinal, double resultado) {
        if (num1 % 1 != 0 || num2 % 1 != 0 || resultado % 1 != 0) {
            return String.format("%.2f %s %.2f = %.2f\n", num1, sinal, num2, resultado);
        } else {
            return String.format("%.0f %s %.0f = %.0f\n", num1, sinal, num2, resultado);
        }
    }

}

