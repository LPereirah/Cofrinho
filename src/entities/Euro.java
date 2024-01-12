package entities;

import java.util.Objects;

public class Euro extends Coin{

    public Euro(Double value) {
        this.value = value;
    }

    @Override
    public double converter() {
        return value * 5.4;
    }

    @Override
    public void info() {
        System.out.printf("Euro - $ %.2f%n", value);
    }

    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Euro euroObject = (Euro) obj;

        if (!Objects.equals(this.value, euroObject.value)){
            return false;
        }
        System.out.println("Moeda removida!");
        return true;
    }
}
