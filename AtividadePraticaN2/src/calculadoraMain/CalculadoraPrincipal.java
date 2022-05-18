package calculadoraMain;

import java.util.Scanner;

public class CalculadoraPrincipal {

    public static void main(String[] args) {
        CasesCalculadoraComum calculadoraComum = new CasesCalculadoraComum();
        CasesCalculadoraCientifica casesCalculadoraCientifica = new CasesCalculadoraCientifica();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        boolean validar = true;
        do {
            validar = true;
            try {
                System.out.println("=========================================\n" +
                        "|	----------MENU----------	|\n" +
                        "|	------------------------	|\n" +
                        "|	Escolha a calculadora		|\n" +
                        "|	------------------------	|\n" +
                        "|	1 - Calculadora Comum		|\n" +
                        "|	2 - Calculadora Científica	|\n" +
                        "|	0 - Sair			        |\n" +
                        "=========================================\n");
                System.out.println("Digite sua opção:");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        calculadoraComum.resultado();
                        break;
                    case 2:
                        casesCalculadoraCientifica.resultado();
                        break;
                    default:
                        if (opcao == 0) {
                            System.out.println("Finalizado!");
                        } else {
                            System.out.println("Opção indisponivel");
                        }
                }
            } catch (Exception e) {
                System.out.println("Houve um problema,tente novamente!");
                validar = false;
            }
        } while (opcao != 0 || validar == false);
    }
}


