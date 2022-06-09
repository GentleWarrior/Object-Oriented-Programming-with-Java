package Landlady;

public class Residence {
    private String name;
    private String address;
    private String city;
    private String province;
    private double monthlyRent;

    public Residence(String name, String address, String city, String province, double monthlyRent) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.monthlyRent = monthlyRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String toString(){
        return name + "\n" + address + "\n" + city + "," + province;
    }
}
