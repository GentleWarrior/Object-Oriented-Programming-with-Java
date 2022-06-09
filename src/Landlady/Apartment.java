package Landlady;

public class Apartment extends Residence implements Rentable{
    private String apartmentNumber;

    public Apartment(String name, String address,String apartmentNumber, String city, String province, double monthlyRent) {
        super(name, address, city, province, monthlyRent);
        this.apartmentNumber = apartmentNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double firstPayment(){
        return getMonthlyRent() + APPLICATION_FEE + (getMonthlyRent() / 2);
    }


    public String toString(){
        return getName() + "\n" + getAddress() +"\n" + "Apt: " + apartmentNumber + "\n" + getCity() + "," + getProvince();

    }
}
