package com.Student;
import java.io.*;
import java.util.Scanner;
class Student
{
     int m1,m2,m3,m4,m5;
     float sum,per;
     void perc() {
         System.out.println("enter 5 suject marks:");
         Scanner sc = new Scanner(System.in);
         m1 = sc.nextInt();
         m2 = sc.nextInt();
         m3 = sc.nextInt();
         m4 = sc.nextInt();
         m5 = sc.nextInt();
         sum = (m1+m2+m3+m4+m5);
         per=((sum/500)*100);
         System.out.print("the percentage is ="+per+" and grade is ");

         if(per>=80)
         {
             System.out.print("A");
         }
         else if(per>=60 && per<80)
         {
             System.out.print("B");
         }
         else if(per>=40 && per<60)
         {
             System.out.print("C");
         }
         else
         {
             System.out.print("D");
         }


     }
}
public class Main {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.perc();


    }
}
