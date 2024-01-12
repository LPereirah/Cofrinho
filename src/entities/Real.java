package entities;

import java.util.Objects;

public class Real extends Coin {

    public Real(double value) {
        this.value = value;
    }

    @Override
    public double converter() {
        return value;
    }

    @Override
    public void info() {
        System.out.printf("Real - R$ %.2f%n", value);
    }

    @Override
    public boolean equals(Object obj){
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Real realObject = (Real) obj;

        if (!Objects.equals(this.value, realObject.value)){
            return false;
        }
        return true;
    }
}