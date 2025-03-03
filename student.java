/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.techwebdocs.lab2;
import java.util.Scanner;
public class student {
private String name;
private int rollnum;
private String department;
public void display()
{
    System.out.println("the name of student is:"+name);
    System.out.println("the roll number of student is:"+rollnum);
    System.out.println("the department of student is:"+department);
}
    public static void main(String args[]) {
       student s1 =new student();
       student s2 =new student();
       Scanner student1=new Scanner(System.in);
        System.out.println("enter the name of student 1");
       s1.name=student1.nextLine();
        System.out.println("enter the rollnumber of student 1");
       s1.rollnum=student1.nextInt();
       student1.nextLine();
        System.out.println("enter the department of student 1");
       s1.department=student1.nextLine();
       // now entering the data of second student 
        System.out.println("enter the name of student 2");
       s2.name=student1.nextLine();
       System.out.println("enter the rollnumber of student 2");
       s2.rollnum=student1.nextInt();
       student1.nextLine();
       System.out.println("enter the department of student 2");
       s2.department=student1.nextLine();
       s1.display();
       s2.display();
    }
}
