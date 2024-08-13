package com.example;

public class Main {
    public static String[] palabrasComunes(String[] palabras1, String[] palabras2){
        String arResultado = "";
        for (int i=0; i<palabras1.length;i++ ){
            // Si las palabras con el mismo índice coinciden, entonces se suman al string resultado
            if (palabras1[i].equals(palabras2[i])){
                arResultado += palabras1[i] + ","; // Los concateno con una coma para luego usarla como delimitador en el método split.
            }
        }
        String [] listaFinal =  arResultado.split(","); // Convierto el string de resultado en un Array.
        return listaFinal;
    }

    public static void main(String[] args) {
        String [] ar1 = {"Hola", "mundo", "de", "la", "algoritmos"};
        String [] ar2 = {"Hola", "mundo", "de", "la", "informática"};
        String[] resultado = palabrasComunes(ar1,ar2);

        // Para imprimir el array y verificar que esté bien.
        for(int i=0; i<resultado.length;i++){
            System.out.println(resultado[i]);
        }


    }
}

/*
    A) Lo que realizaría el programa es hacer un for, recorriendo todos los elementos de una de
    los arrays uno a uno, y los compara con el otro array con el elemento en el mismo índice.
    Si estos son iguales, a partir de un string se va concatenando con las coincidencias y al
    final este se guarda en un array (con el método split) que devuelve la función.

    Aclaración, yo falté la clase del 18 de Marzo, por lo que no fui participe de todos los
    ejercicios que se hallan realizado de formal grupal en esa instancia.
 */