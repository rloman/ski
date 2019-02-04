package nl.example.app.model;

import java.awt.Color;

public class Skies {
   
   private String brand;
   private double length;
   private Color color;
   
   public String getBrand() {
      return brand;
   }
   
   public void setBrand(String brand) {
      
      this.brand = brand;
   }
   
   public double getLength() {
      return length;
   }
   
   public void setLength(double length) {
      
      if(length == 0) {
         throw new IllegalArgumentException();
      }
      
      this.length = length;
   }

   
   public void setColor(Color color) {
      this.color = color;
   }

   
   public Color getColor() {
      return color;
   }

}
