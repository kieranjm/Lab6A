/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6a;

/**
 *
 * @author kjm61
 */
public class LandTract {
    private double length;
  private double width;
  private double area;
  
  
  public LandTract(){
    length = 0.0;
    width = 0.0;
    area= 0.0;
  }
  
  
  public LandTract(double length, double width){
    this.length = length;
    this.width = width;
  }
  
  
  public void setArea (double area){
    this.area = area;
  }
  
  
  public static double findArea (double length,double width){
    return length * width;
  }
  
  
  public boolean equals(LandTract land2){
    boolean status;
    if (area == (land2.area))
      status = true;
    else
      status = false;
    return status;
  }
  
   public String toString(){
     String str = ("Length: " + length + ".\nWidth: " + width +".\nArea: " + area);
     return str;
   }
}
