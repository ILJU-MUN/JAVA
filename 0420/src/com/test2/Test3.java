package com.test2;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
   abstract void draw();
}
class Circle extends Shape{

   @Override
   void draw() {
      System.out.println("drawing Circle");
   }
}
class Rectangle extends Shape{

   @Override
   void draw() {
      System.out.println("drawing Rectangle");
   }
}

public class Test3 {
   static void  drawShapes(List<? extends Shape>  lists) {
      for(Shape s :lists) {
         s.draw();
      }
   }
   public static void main(String[] args) {
      List<Rectangle> list1 = new ArrayList<Rectangle>();
      list1.add(new Rectangle());
      List<Circle> list2 = new ArrayList<>();
      list2.add(new Circle());
      
      drawShapes(list1);
      drawShapes(list2);      
   }
   
}