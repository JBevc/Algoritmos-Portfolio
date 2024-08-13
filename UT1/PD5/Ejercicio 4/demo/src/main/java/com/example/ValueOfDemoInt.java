package com.example;

public class ValueOfDemoInt {
  public void metodo(String[] args) {
    if (args.length == 2) { 
      // convert strings to numbers
      // Si los parametros fueran enteros uso Integer.ParseInt()

      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      // Si los parametros no son fueran negativos
      if (a<0 || b<0)  {
        System.out.println("two command-line arguments must be positive numbers");
      
      } else {
        // do some arithmetic
        System.out.println("a + b = " +
      (a + b));
      System.out.println("a - b = " +
      (a - b));
      System.out.println("a * b = " +
      (a * b));
      System.out.println("a / b = " +
      (a / b));
      System.out.println("a % b = " +
      (a % b));
      }
    
    } else {
      System.out.println("This program " +
      "requires two command-line arguments.");
    }
  }
}
