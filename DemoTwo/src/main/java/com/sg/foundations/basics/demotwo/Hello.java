/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.demotwo;

import java.util.Scanner;

/**
 *
 * @author hachem
 */
public class Hello {
     public static void main(String[] args) {
         String message="hello world";
         message+= "_from IDE";
        System.out.println("message");
        
    
 /*  int getNumber(){
       return 42;
   }*/
    System.out.println("give a number: ");
   int numberEntred;
   Scanner myScanner = new Scanner(System.in);   
   numberEntred = myScanner.nextInt();
   System.out.println(numberEntred); 
}

    public int getNumber() {
       return 42; 
    }
}
