public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){

        this.name = name;
    }
    public void setAge(int name){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return (address);
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
