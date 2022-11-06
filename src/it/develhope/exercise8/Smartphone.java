package it.develhope.exercise8;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


public class Smartphone implements Cloneable{
    @Getter
    @Setter
    private String brandName;

    @Getter
    @Setter
    private String modelName;

    @Getter
    @Setter
    private int batterymAh;

    @Getter
    @Setter
    private SmartPhonePrice producerPrice;

    @Getter
    @Setter
    private SmartPhonePrice retailPrice;

    public Smartphone(String brandName,String modelName,int batterymAh, SmartPhonePrice producer, SmartPhonePrice retail){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producer;
        this.retailPrice = retail;
    }

    @Override
    public String toString() {
        return "Smarphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smarphone = (Smartphone) o;
        return batterymAh == smarphone.batterymAh && brandName.equals(smarphone.brandName) && modelName.equals(smarphone.modelName) && producerPrice.equals(smarphone.producerPrice) && retailPrice.equals(smarphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
