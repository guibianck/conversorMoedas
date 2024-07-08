import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda converter = new ConversorMoeda();

        System.out.print("Digite a moeda de origem (ex: USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Digite a moeda de destino (ex: BRL): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        try {
            double result = converter.convert(fromCurrency, toCurrency, amount);
            System.out.println(amount + " " + fromCurrency + " em " + toCurrency + ": " + result);
        } catch (IOException e) {
            System.err.println("Erro na conversão: " + e.getMessage());
        }
    }
}
