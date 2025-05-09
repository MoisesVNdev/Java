import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("---------- Menu de opções -----------");
            System.out.println("Escolha uma das funções abaixo: \n");
            System.out.println("1 - Exibir a tabela das variaveis primitivas do Java");
            System.out.println("2 - Exibir as representações numericas do Java");
            System.out.println("3 - Calculadora de media de nota");
            System.out.println("4 - Conversor de temperatura");
            System.out.println("5 - Dias do mês por Switch Expresions");
            System.out.println("6 - Rada de multa");
            System.out.println("0 - para encerra o programa");
            System.out.print("Escolha uma das opções acima: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    Variables.variaveis();
                    break;
                case 2:
                    RepresentacaoNumerica.representacaoNumerica();
                    break;
                case 3:
                    MediaNotasAluno.menu();
                    break;
                case 4:
                    ConversorTemperatura.menu();
                    break;
                case 5:
                    SwitchExpressions.menu();
                    break;
                case 6:
                    RadarDeMulta.menu();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    System.out.println("Programa Encerrado...");
                    break;
                default:
                    System.out.println("Opção digitada invalida");
                    break;
            }
        }while (opcao!=0);
    }
}