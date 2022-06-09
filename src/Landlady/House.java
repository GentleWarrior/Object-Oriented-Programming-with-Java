package Landlady;

public class House extends Residence implements Rentable{
    private final double SECURITY_DEPOSIT = 1000.00;

    public House(String name, String address, String city, String province, double monthlyRent) {
        super(name, address, city, province, monthlyRent);
    }

    public double firstPayment(){
        return getMonthlyRent() + APPLICATION_FEE + SECURITY_DEPOSIT;
    }
}
