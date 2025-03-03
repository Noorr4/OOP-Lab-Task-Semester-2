/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.techwebdocs.lab2;
import java.util.Scanner;
public class department {
  public String departhead;
    public String departname;
    department(String depname,String dephead)
    {
        this.departname=depname;
        this.departhead=dephead;
    }
   public void display()
    {
        System.out.println("the name of the department is:" +departname);
        System.out.println("the department head is:" +departhead);
    }
    public static void main(String args[]) {
        department obj=new department("Faculty Of Computing","ma'am kiran");
        Scanner depart=new Scanner(System.in);
        System.out.println("enter the name of department");
        obj.departname=depart.nextLine();
        System.out.println("enter the department head");
        obj.departhead=depart.nextLine();
        obj.display();
        
    }
}
