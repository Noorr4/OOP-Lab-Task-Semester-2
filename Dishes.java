/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.first;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Dishes {
    String type;
    String ingre;
    String cusiane;
    public static void main(String[] args)
    {
       Dishes obj =new Dishes(); 
        System.out.println("enter the type of dishes");
       Scanner ml=new Scanner(System.in);
       obj.type=ml.nextLine();
        System.out.println("enter the ingredents");
        Scanner ul=new Scanner(System.in);
        obj.ingre=ul.nextLine();
        System.out.println("enter the cusine");
        Scanner hl=new Scanner(System.in);
        obj.cusiane=hl.nextLine();
        System.out.println("WELCOME TO THE RESTRUANT");
        System.out.println("your type is"+obj.type);
        System.out.println("your ingreadents are"+obj.ingre);
        System.out.println("your cusiane is:"+obj.cusiane);
       
       
    }
}
