package com.bridgelabzAddress;
import java.util.*;
public class AddressList {

    public static void main(String[] args){
         String firstname= " ";
         String lastname= " ";
         String address= " ";
         String city= " ";
         String state =" ";
         String zip= " ";
         String email= " ";
         int phno= 0;
         Scanner s=new Scanner(System.in);
         Scanner s1=new Scanner(System.in);
         System.out.println("Enter your first name");
         firstname=s.next();
         System.out.println("Enter your last name");
         lastname=s.next();
         System.out.println("Enter your address");
         address=s.next();
         System.out.println("Enter your city");
         city=s.next();
         System.out.println("Enter your state");
         state=s.next();
         System.out.println("Enter your zip");
         zip=s.next();
         System.out.println("Enter your email");
         email=s.next();
         System.out.println("Enter your phnone number");
         phno=s1.nextInt();
         System.out.println("First name:"+firstname);
        System.out.println("Last name:"+lastname);
        System.out.println("Address:"+address);
        System.out.println("City:"+city);
        System.out.println("State:"+state);
        System.out.println("Zip"+zip);
        System.out.println("Email:"+email);
        System.out.println("Phone Number:"+phno);


    }
}
