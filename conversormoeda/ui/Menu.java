package ui;

import conversao.Api;
import conversao.Conversor;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    public void menu() {
        boolean exibeMenu = true;
        while (exibeMenu) {
            System.out.println("------------------------------------------------------");
            System.out.println("Bem vindo ao conversao.Conversor de Moeda !");
            System.out.println("------------------------------------------------------");
            System.out.println();
            System.out.println("Escolha uma opção de conversão:");
            System.out.println();
            System.out.println("1) [USD] para [ARS]");
            System.out.println("2) [ARS] para [USD]");
            System.out.println("3) [USD] para [BRL]");
            System.out.println("4) [BRL] para [USD]");
            System.out.println("5) [USD] para [COP]");
            System.out.println("6) [COP] para [USD]");
            System.out.println("7) Sair");
            System.out.println("-------------------------------------------------------");

            System.out.println("Escolha uma opção de conversão:");
            String opcao = teclado.next();

            switch (opcao) {
                case "1":
                    this.converter("USD","ARS");
                    break;

                case "2":
                    this.converter("ARS","USD");
                    break;

                case "3":
                    this.converter("USD","BRL");
                    break;

                case "4":
                    this.converter("BRL","USD" );
                    break;

                case "5":
                    this.converter("USD","COP");
                    break;

                case "6":
                    this.converter("COP","USD" );
                    break;

                default:
                    if(opcao.equals("7")) {
                        System.out.println("Obrigado !!");
                        exibeMenu = false;
                    } else {
                        System.out.println("Opção Inválida ! Selecione uma opção valida, ou, Opção \"7\" para sair. ");
                    }
                    break;

            }


        }
    }
    public void converter (String baseCode, String targetCode) {
        System.out.println("Informe um valor para conversão: ");
        try {
            double valor = this.teclado.nextDouble();
            Conversor conversor = new Conversor(baseCode, targetCode, valor);
            Api api = new Api(conversor);
            System.out.println(api.callApi());
        } catch (Exception e) {
            System.out.println("Valor digitado é inválido... Utilize ',' para converter numeros decimais.");
        }



    }
}
