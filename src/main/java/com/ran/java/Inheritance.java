package com.ran.java;

class Animal{
   Animal(){
        System.out.println("Animal Constructor called");
   }
   void walk()
   {
      System.out.println("I am walking");
      System.out.println(this.getClass().getName());
       overriderMe();
   }
   void overriderMe(){
      System.out.println("My name : animal");
   }
}
class Bird extends Animal
{
    Bird(){
        System.out.println("Bird Constructor called");
    }
   void fly()
   {
      System.out.println("I am flying");
   }
   void sing() { System.out.println("I am singing"); }
   void overriderMe(){
        //super.overriderMe();
        System.out.println("My name : bird");
   }
}
public class Inheritance
{

   public static void main(String args[])
   {

     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
   }
}