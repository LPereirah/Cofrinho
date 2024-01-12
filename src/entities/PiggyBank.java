package entities;

import utilities.Menu;

import java.util.ArrayList;
import java.util.List;

public class PiggyBank {

    private List<Coin> listCoins = new ArrayList<>();

    public void add(Coin coin){
        listCoins.add(coin);
    }

    public void remove(Coin coin){
        if (listCoins.isEmpty()){
            System.out.println("O cofrinho está vazio.");
        }
        else if(!listCoins.contains(coin)){
            System.out.println("O cofrinho não possui tal moeda.");
        }
        else {
            listCoins.remove(coin);
            System.out.println("Moeda removida!");
        }
    }

    public void listOfCoins(){
        if (listCoins.isEmpty()){
            System.out.println("Não há moedas no cofrinho.");
            System.out.println();
        }
        else {
            for (Coin c : listCoins){
                c.info();
            }
            System.out.println();
        }
        Menu.menu();
    }

    public void totalConvert(){
        double sum = 0;
        for (Coin c : listCoins){
            sum += c.converter();
        }
        System.out.printf("Total convertido: R$ %.2f%n", sum);
        System.out.println();
        Menu.menu();
    }
}
