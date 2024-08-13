package com.example;

//parte a
public class Marcapasos{

	public  short presionSanguinea;
	public short frecuenciaCardiaca;
	public short nivelDeAzucarEnSangre;
	public long maxFuerzaExpuesto;
	public byte minTimeBeetweenHeartbeat;
	public float bateriaRestante;
	public char codigoDelFabricante;
	
	// constructor
	public Marcapasos (short presionSanguinea, short frecuenciaCardiaca, short nivelDeAzucarEnSangre,
						long maxFuerzaExpuesto, byte minTimeBeetweenHeartbeat, float bateriaRestante,
						char codigoDelFabricante) {

		this.presionSanguinea = presionSanguinea;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.nivelDeAzucarEnSangre = nivelDeAzucarEnSangre;
		this.maxFuerzaExpuesto = maxFuerzaExpuesto;
		this.minTimeBeetweenHeartbeat = minTimeBeetweenHeartbeat;
		this.bateriaRestante = bateriaRestante;
		this.codigoDelFabricante = codigoDelFabricante;
		}
		
		// Para calcular cuanta memoria consume cada objeto
    public static int calcularMemoriaMarcapasos() {
			// .BYTES debuelve el tamaño de bytes que ocupa el valor
			// del tipo de la variable correspondiente.
			// De esta forma obtengo los valores de cada variable de Marcapasos.
        int sizePresionSanguinea = Short.BYTES; // 2 bytes
        int sizeFrecuenciaCardiaca = Short.BYTES; // 2 bytes
        int sizeNivelDeAzucarEnSangre = Short.BYTES; // 2 bytes
        int sizeMaxFuerzaExpuesto = Long.BYTES; // 8 bytes
        int sizeMinTimeBeetweenHeartbeat = Byte.BYTES; // 1 byte
        int sizeBateriaRestante = Float.BYTES; // 4 bytes
        int sizeCodigoDelFabricante = Character.BYTES; // 2 bytes
        // (Al colocar el cursor sobre el metodo .BYTES, ya vscode señala cuanto ocupa cada variable)


		// Sumo los valores de cada variable
        int totalSize = sizePresionSanguinea + sizeFrecuenciaCardiaca + sizeNivelDeAzucarEnSangre +
												sizeMaxFuerzaExpuesto + sizeMinTimeBeetweenHeartbeat + sizeBateriaRestante +
												sizeCodigoDelFabricante;
				
        return totalSize; // Ocupa 21 bytes
        // la suma sería 2+2+2+8+1+4+2 = ocupa 21 efectivamente

        // Si creo un objeto de la Clase marcapasos, al tener que si o si
        // pasarle un valor las variables de la clase, ya no ocuparia 21 bytes
        // Ocuparía más (depende de los valores que asigne a cada una).
    }

		public static void main(String[] args) {
			// Imprime suma
			System.out.println("La memoria utilizada por un objeto de la clase Marcapasos es de " + calcularMemoriaMarcapasos() + " bytes");
		}
}

