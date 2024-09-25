package com.example.ut1_pd5.ejercicio_4;

public class ValueOfDemo {
  public static void metodoValueOfDemo(String[] args) {
    // this program requires two
    // arguments on the command line
    if (args.length == 2) {
    // convert strings to numbers
          
    // ESTO ESTA MAL
    //float a = (Float.value (args[0])).floatValue();
    //float b = (Float.valueOf(args[1])).float ();
          
    // Para convertir de string a numero necesito usar parse
    // Si los parametros fueran enteros uso Integer.ParseInt()
    float a = Float.parseFloat(args[0]);
    float b = Float.parseFloat(args[1]);
          
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
    } else {
      System.out.println("This program " +
      "requires two command-line arguments.");
    }

  }
}
