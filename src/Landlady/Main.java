package Landlady;

public class Main {
    public static void main(String[] args){
        Apartment myApartment = new Apartment("ISHIMWE","KG 203 ST", "13","KIGALI", "REMERA", 400000);
        House myHouse = new House("Jane Doe", "KG 552 ST", "KIGALI", "NYARUTARAMA", 7500000);
        System.out.println(myApartment);
        System.out.printf("$%,.2f\n", myApartment.firstPayment());
        System.out.println("\n" + myHouse);
        System.out.printf("$%,.2f\n", myHouse.firstPayment());

    }
}
