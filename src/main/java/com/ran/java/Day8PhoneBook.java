package com.ran.java;//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Day8PhoneBook {
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String , Integer> map = new HashMap<>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         map.put(name,phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         System.out.println(map.get(s));
      }
   }
}