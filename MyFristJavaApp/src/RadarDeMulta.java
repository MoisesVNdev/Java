import java.util.Scanner;

public class RadarDeMulta {

    private static final int VELOCIDADE_PERMITIDA = 80;
    private static final double VALOR_MULTA = 10.00; // R$10 para cada km/h acima da velocidade permitida

    public static void menu(){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nDescubra se você foi multado!");
            System.out.println("Informe abaixo a velocidade que você estava.");
            System.out.print("Velocidade: ");
            infoRadar(scanner.nextInt());

            System.out.println("\n1 - Consultar novamente");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

        }while (opcao !=0);

    }
    public static void infoRadar(int velocidade){

        if (velocidade <= 80){
            System.out.println("Velocidade dentro do permitido não houve multa!");
        } else{
            System.out.println("Voce foi multado em: R$ " + calculoMulta(velocidade));
        }
    }
    public static double calculoMulta(int velocidade){

        if (velocidade <= 100){
            return  ((velocidade + 7) - VELOCIDADE_PERMITIDA) * VALOR_MULTA;
        }else {
            return  (velocidade * 0.1) * VALOR_MULTA;
        }
    }
}
