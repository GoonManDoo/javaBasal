package com.dev;

public class Singleton {
   private static Singleton instance = new Singleton();
   
   private Singleton() {
   }
   
   public static Singleton getInstace() {
      return instance;
   
   }
}

