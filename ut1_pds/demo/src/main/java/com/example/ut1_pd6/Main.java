package com.example.ut1_pd6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        imprimirTablero(7,7);
    }

    // Ejercicio 1
    public static void imprimirTablero(int largo, int ancho) {
        String filas = "";
        for (int i=1; i<=largo; i++){
            filas = filas + "#";
        }
        for (int i =1; i<=ancho; i++){
            System.out.println(filas);
        }
    }

   public static void leerEntradaArchivo(String direccion){
    try {
      // Inicializo el bufferReader
      File archivo = new File(direccion);
      FileReader fr = new FileReader(archivo);
      BufferedReader br= new BufferedReader(fr);
    
      // Creo las variables de tipo string acorde a los distintos datos del texto.
      String entero = br.readLine();
      String pFlotante = br.readLine();
      String nombre = br.readLine();

      int entero2 = Integer.parseInt(entero);
      float pFlotante2 = Float.parseFloat(pFlotante);
      float suma = entero2 + pFlotante2;
      int divisionEntera = (int) (pFlotante2/entero2);
      // Calculo el resto
      float resto = pFlotante2 % entero2;
      // para mostrar solo 2 lugares despues de la coma
      String restoString = String.format("%.2f",resto);
      

      System.out.println("El entero leído es: " + entero);
      System.out.println("El número de punto flotante es: " + pFlotante);
      System.out.println("La cadena leída es " + nombre);
      System.out.println("¡Hola " + nombre + "! La suma de " + entero + " y " + pFlotante + " es " + suma);
      System.out.println("La división entera de " + entero + " y " + pFlotante + " es " + divisionEntera + " y su resto es " + restoString );

      // termina de leer
      br.close();
    } catch (IOException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }
  }

  public static void leerEntradaStdin(){
    // Uso la clase Scanner para obtener input del usuario y parsear clases primitivas
    Scanner in = new Scanner(System.in);

    // Leeo el valor del radio de circunferencia
    float radio = in.nextFloat();
    // Obtengo el valor de pi para hacer cálculos
    double pi = Math.PI;

    // Calculo el área
    float area = (float) (radio*radio*pi);
    // Calculo el perímetro
    float perimetro = (float) (radio*2*pi);

    // Imprimo valores del area y perimetro
    System.out.println("El area de es: " + area);
    System.err.println("El perímetro es: " + perimetro);
    
    // Cierro escaner
    in.close();

  }

    public static void transformarT9Texto (String rutaArchivo){

    // Creo un string con todos los caracteres del teclado,
    // coincidiendo el digito con el indice del array.
    String[] tecladoT9 = {" ",".","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    int contadorLinea = 0;

    // Guardo en un string todo el texto convertido y delimito las
    // lineas correspondientes a cada oracion con "," (ver mas adelante)
    String textoConvertido = "";

    try {
      // Inicializo el bufferReader
      File archivo = new File(rutaArchivo);
      FileReader fr = new FileReader(archivo);
      BufferedReader br= new BufferedReader(fr);

      String linea;
      while ((linea = br.readLine()) != null){
        contadorLinea += 1;
        // Recorro cada caracter de cada linea
        for (int i=0; i<linea.length(); i++){
          // Guardo cada caracter en una variable
          char caracter = Character.toUpperCase(linea.charAt(i));
          // Recorro indice que corresponde al digito del teclado T9
          for (int j = 0; j<tecladoT9.length; j++){
            // busco si coincide la letra del texto con alguna del digito de T9
            if (tecladoT9[j].indexOf(caracter) != -1) { // Si el caracter está en el grupo del digito
            textoConvertido += j; // Se concatena el digito al texto para escribir en el otro archivo
            break; // Salir del bucle
            }
          }
        }

        // Agrego al final de cada digito un delimitador para luego hacer un array
        // con cada elemento correspondiente a cada linea para imprimir en el nuevo archivo. 
        textoConvertido += ",";
      }
      System.out.println(contadorLinea);
      System.out.println(textoConvertido);

      // Termino de leer
      br.close();
    } catch (IOException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }

    // El path del archivo donde va a escribir
    String salida = "demo/src/salida.txt";

    try{
      FileWriter fileWriter = new FileWriter(salida);
      // Para poder escribir en el archivo
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      String[] textoArr = textoConvertido.split(",");
      for (String linea : textoArr){
        bufferedWriter.write(linea);
        bufferedWriter.newLine();
      }
      // Termino de escribir
      bufferedWriter.close();

    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
      }

  }

    public static void transformarTextoT9(String rutaArchivo) {
        
    }
}

