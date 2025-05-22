package br.com.programacao.estruturada;

import java.util.Scanner;

public class ConversorTemperatura {
    private static final Scanner scanner = new Scanner(System.in);
    public static void menu() {
        int opcao;
        do {
            System.out.println("\n=== Conversor de Temperatura ===");
            System.out.println("1. Celsius para Kelvin");
            System.out.println("2. Celsius para Fahrenheit");
            System.out.println("3. Kelvin para Celsius");
            System.out.println("4. Kelvin para Fahrenheit");
            System.out.println("5. Fahrenheit para Celsius");
            System.out.println("6. Fahrenheit para Kelvin");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    converterCelsiusParaKelvin();
                    break;
                case 2:
                    converterCelsiusParaFahrenheit();
                    break;
                case 3:
                    converterKelvinParaCelsius();
                    break;
                case 4:
                    converterKelvinParaFahrenheit();
                    break;
                case 5:
                    converterFahrenheitParaCelsius();
                    break;
                case 6:
                    converterFahrenheitParaKelvin();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void converterCelsiusParaKelvin() {
        System.out.print("Informe a temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double k = celsiusParaKelvin(c);
        System.out.printf("%.2f °C = %.2f K%n", c, k);
    }

    private static void converterCelsiusParaFahrenheit() {
        System.out.print("Informe a temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double f = celsiusParaFahrenheit(c);
        System.out.printf("%.2f °C = %.2f °F%n", c, f);
    }

    private static void converterKelvinParaCelsius() {
        System.out.print("Informe a temperatura em Kelvin: ");
        double k = scanner.nextDouble();
        double c = kelvinParaCelsius(k);
        System.out.printf("%.2f K = %.2f °C%n", k, c);
    }

    private static void converterKelvinParaFahrenheit() {
        System.out.print("Informe a temperatura em Kelvin: ");
        double k = scanner.nextDouble();
        double f = celsiusParaFahrenheit(kelvinParaCelsius(k));
        System.out.printf("%.2f K = %.2f °F%n", k, f);
    }

    private static void converterFahrenheitParaCelsius() {
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double f = scanner.nextDouble();
        double c = fahrenheitParaCelsius(f);
        System.out.printf("%.2f °F = %.2f °C%n", f, c);
    }

    private static void converterFahrenheitParaKelvin() {
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double f = scanner.nextDouble();
        double k = celsiusParaKelvin(fahrenheitParaCelsius(f));
        System.out.printf("%.2f °F = %.2f K%n", f, k);
    }

    // Métodos de conversão
    private static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    private static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
