package br.com.programacao.estruturada;

import java.util.Scanner;

public class MediaNotasAluno {
    private  static final Scanner scanner = new Scanner(System.in);

    public static void menu(){
        System.out.println("Calculadora de medias de notas \n");
        System.out.print("Digite a quantidade de notas a ser calculadas: ");
        int cont = scanner.nextInt();
        double resultado = mediaAluno(cont);
        System.out.println("A media das " + cont + " Notas do aluno é de: "+resultado);

        System.out.println("\n1 - para continuar");
        System.out.println("0 - para voltar ao Menu anterior");
        System.out.print("Resposta: ");
        cont = scanner.nextInt();
        if (cont == 1){
            menu();
        }
    }

    private static double mediaAluno(int cont){
        double notas = 0;
        for (int i = 1; i<=cont;i++){
            System.out.print("Digite a nota "+ i + ": " );
            notas += scanner.nextInt();
        }
        return notas/cont;
    }
}
