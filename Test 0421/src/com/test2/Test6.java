package com.test2;

interface Animal2 {
//   void breath();
   String eat(String food);}

//class Dog implements Animal{
//
//   @Override
//   public void breath() {
//      System.out.println("DOG");
//   }
//   
//}
//class Cat implements Animal{
//
//   @Override
//   public void breath() {
//      System.out.println("CAT");
//   }
//   
//}

public class Test6 {

   public static void main(String[] args) {
//      
//      Dog dog = new Dog();
//      dog.breath();
//      Cat cat = new Cat();
//      cat.breath();
//      
//      Animal a =new Animal() {//1회용
//         
//         public void breath() {
//            System.out.println("DOG");
//         }
//      };
//      a.breath();
//      Animal a1 =new Animal() {//1회용
//         
//         public void breath() {
//            System.out.println("CAT");
//         }
//      };
//      a1.breath();
      
      Animal2 a2 = (s)->{System.out.println("DOG"); return"";};
      //보이드에           ↑ 매개변수가 없기때문에 안줘도댐
//      a2.breath();
      a2.eat("저녁");
   }

}