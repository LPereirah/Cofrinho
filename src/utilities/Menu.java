package utilities;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    static Scanner input = new Scanner(System.in);
    private static PiggyBank piggyBank = new PiggyBank();
    private static Coin coinReal;
    private static Coin coinDolar;
    private static Coin coinEuro;

    public static void menu() {
        Locale.setDefault(Locale.US);

        System.out.println("Cofrinho:");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Calcular total convertido em real");
        System.out.println("0 - Encerrar");
        System.out.print(">> ");
        String menu = input.next();

        switch (menu) {
            case "1":
                menuAdd();
                break;
            case "2":
                menuRemove();
                break;
            case "3":
                piggyBank.listOfCoins();
                break;
            case "4":
                piggyBank.totalConvert();
                break;
            case "0":
                System.out.println("Encerrando...");
                return;
            default:
                System.out.println("Opção inválida. Tente denovo. \n");
                menu();
        }
    }

    public static void menuAdd () {
        System.out.println("Adicionar Moeda");
        System.out.println("--------------");
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.print(">> ");
        String menu = input.next();
        double value;

        switch (menu) {
            case "1":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinReal = new Real(value);
                piggyBank.add(coinReal);
                break;
            case "2":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinDolar = new Dolar(value);
                piggyBank.add(coinDolar);
                break;
            case "3":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinEuro = new Euro(value);
                piggyBank.add(coinEuro);
                break;
            default:
                System.out.println("Opção inválida. Tente denovo. \n");
                menuAdd();
        }
        System.out.println();
        menu();
    }

    public static void menuRemove () {
        System.out.println("Remover Moeda");
        System.out.println("--------------");
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.print(">> ");
        String menu = input.next();
        double value;

        switch (menu) {
            case "1":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinReal = new Real(value);
                piggyBank.remove(coinReal);
                break;
            case "2":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinDolar = new Dolar(value);
                piggyBank.remove(coinDolar);
                break;
            case "3":
                System.out.print("Digite o valor: ");
                value = input.nextDouble();
                coinEuro = new Euro(value);
                piggyBank.remove(coinEuro);
                break;
            default:
                System.out.println("Opção inválida. Tente denovo. \n");
                menuAdd();
        }
        System.out.println();
        menu();
    }
}
