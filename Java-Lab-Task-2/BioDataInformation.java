//3. Take some information about yourself (i.e. name, age, cgpa, department, section etc) as input and display them.
package com.mycompany.ooplabtask2;

import java.util.Scanner;

public class BioDataInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your Name:");
        String name = input.nextLine();

        System.out.print("Enter your Age:");
        int age = input.nextInt();

        System.out.print("Enter your CGPA:");
        double cgpa = input.nextDouble();
        
        System.out.print("Enter your Department:");
        String department = input.nextLine();

        System.out.print("Enter your Section:");
        String section = input.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + department);
        System.out.println("Section: " + section);

    }
}
