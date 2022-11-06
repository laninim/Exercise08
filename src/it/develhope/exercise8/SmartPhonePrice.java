package it.develhope.exercise8;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class SmartPhonePrice implements Cloneable{
    @Setter
    @Getter
   private String priceType;

    @Setter
    @Getter
    private double priceInEuros;

   public SmartPhonePrice (String priceType, double priceInEuros){
       this.priceType = priceType;
       this.priceInEuros = priceInEuros;
   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SmartPhonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhonePrice that = (SmartPhonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
