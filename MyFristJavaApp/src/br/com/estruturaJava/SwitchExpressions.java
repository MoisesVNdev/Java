package br.com.estruturaJava;

import java.util.Scanner;

public class SwitchExpressions {
    private static Scanner scanner = new Scanner(System.in);
    private static int dias, mes;
    public static void menu(){

        do
        {
            System.out.println("\nDigite um numero de 1 a 12 para saber quantos dias tem nesse mês!");
            System.out.print("Resposta: ");
            diasNoMes(scanner.nextInt());

            System.out.println(dias + " Dias");
            System.out.println("\n1 - para tentar novamente ");
            System.out.println("0 - para voltar ao menu anterior");
            System.out.print("Resposta: ");
            mes= scanner.nextInt();
        }while (mes!=0);
    }
    public static void diasNoMes(int mes){
        dias = switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Valor invalido");
                yield 0;
            }
        };

    }
}
