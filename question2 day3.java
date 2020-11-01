package com.Employee1;
import java.io.*;
import java.util.Scanner;

class Details
{
    String name;
    int date, month, year, Monthly_Salary;
    int age;
    void get_details() {

        System.out.print("Enter Name");
        Scanner s =new Scanner(System.in);
        name = s.next();
        System.out.print("Enter date of birth, month of birth and year of birth");
        date= s.nextInt();
        month= s.nextInt();
        year= s.nextInt();
        System.out.println("Enter the monthly salary of employee");
        Monthly_Salary=s.nextInt();
    }
    void calc_age()
    {
        age=(2020-year);
    }
    void Disp() {
        System.out.print("The name of employee is  " + name);
        System.out.println("The age is " + age);
        System.out.println("The salary is " + Monthly_Salary);
        System.out.print("The tax to pay is");

            if (Monthly_Salary >= 500000)
            {
                System.out.println("20%");
            }
            else if (Monthly_Salary >=400000 && Monthly_Salary<50000)
            {
                System.out.println("15%");
            }
            else if (Monthly_Salary >=300000 && Monthly_Salary<400000 )
            {
                System.out.println("10%");
            }
            else if(Monthly_Salary>=200000 && Monthly_Salary <300000)
            {
                System.out.println("5%");
            }
            else
            {
                System.out.println("0%");
            }


    }
}
public class Main {

    public static void main(String[] args) {
               Details d= new Details();
               d.get_details();
               d.calc_age();
               d.Disp();

    }
}
