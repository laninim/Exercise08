package it.develhope.exercise8;

public class Test {

    public static void main(String[] args) {

        SmartPhonePrice s1 = new SmartPhonePrice("Euro",299.00);
        SmartPhonePrice s2 = new SmartPhonePrice("Euro",599.00);
        SmartPhonePrice s3 = new SmartPhonePrice("Euro",399.00);
        SmartPhonePrice s4 = new SmartPhonePrice("Euro",199.00);

        Smartphone samsung = new Smartphone("Samsung","S20",90,s1,s2);
        Smartphone iphone = new Smartphone("Apple","Iphone14",85,s3,s4);

        System.out.println(samsung.toString() + "\n" + iphone.toString());

        if(samsung.equals(iphone)){
            System.out.println("Smartphone product, are equals");
        }else{
            System.out.println("Smartphone product, not equals");
        }

        Smartphone cloneSmartphone = null;

        try{
            cloneSmartphone =(Smartphone) iphone.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println("Unable clone the device");
        }

        System.out.println("Cloned device \n" + cloneSmartphone);

        if(iphone.equals(cloneSmartphone)){
            System.out.println("The second device and the cloned smartphone, are equals!");
        }
    }
}
