/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author hachem
 */
public class WindowMaster {
    public static void main(String[] args){
        float height, width;
        float areaOfWindow, perimeterOfWindow;
        float cost;
        
        Scanner myScanner= new Scanner(System.in);
        System.out.println("enter window height (ft): ");
        height = myScanner.nextFloat();
        System.out.println("enter window width (ft): ");
        width = myScanner.nextFloat();
        
        areaOfWindow= height*width;
        perimeterOfWindow= (2 * height) +( 2*width );
        System.out.println("The perimeter is "+ perimeterOfWindow);
        cost= (areaOfWindow * 3.50f) + (perimeterOfWindow * 2.25f);
        System.out.println("The area is "+ areaOfWindow);
        System.out.println("the total cost is for the window "+cost);
        
        

        
    }
    
}
