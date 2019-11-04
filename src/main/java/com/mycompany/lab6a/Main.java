/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6a;

import java.util.Scanner;

/**
 *
 * @author kjm61
 */
public class Main {
    public static void main(String[] args) {
    double length = 0, width = 0, area1 = 0, length2 = 0, width2 = 0, area2=0;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println ("Enter length of first tract of land: ");
    length = keyboard.nextDouble();
    
    System.out.println ("Enter width of first tract of land: ");
    width = keyboard.nextDouble();
    
    LandTract land1 = new LandTract(length,width);
    
    area1=LandTract.findArea(length,width);
    
    land1.setArea(area1);
    
    System.out.println ("Enter length of second tract of land: ");
    length2 = keyboard.nextDouble();
    
    System.out.println ("Enter width of second tract of land: ");
    width2 = keyboard.nextDouble();    
    
    
    LandTract land2 = new LandTract(length2,width2);
        
    
    area2=LandTract.findArea(length2,width2);
    
    
    land2.setArea(area2);
    
    System.out.println("First land track: " + land1.toString());
    System.out.println("Second land track: " + land2.toString());
    
    if (land1.equals(land2))
          System.out.println("Both areas are the same.");
        else
          System.out.println("The areas are different.");
          
          
          
  }
}
