package entities;

import java.util.Objects;

public class Dolar extends Coin{

    public Dolar(Double value) {
        this.value = value;
    }

    @Override
    public double converter() {
        return value * 5;
    }

    @Override
    public void info() {
        System.out.printf("Dolar - US$ %.2f%n", value);
    }

    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Dolar dolarObject = (Dolar) obj;

        if (!Objects.equals(this.value, dolarObject.value)){
            return false;
        }
        System.out.println("Moeda removida!");
        return true;
    }
}
