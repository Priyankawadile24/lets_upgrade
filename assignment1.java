class Employee{

    int age= 23;
    String name="saurabh" ;
    String city="chennai";
    void display()
    {
        System.out.println("the name is "+name);
        System.out.println("the age is "+age);
        System.out.println("the city is "+city);
    }

};
public class Main {

    public static void main(String[] args) {
        Employee e= new  Employee();
        Employee e1= new  Employee();

        e.display();
    }
}