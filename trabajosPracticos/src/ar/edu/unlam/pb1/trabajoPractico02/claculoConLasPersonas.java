package ar.edu.unlam.pb1.trabajoPractico02;

public class claculoConLasPersonas {

	public static void main(String[] args) {
		//Declaración

		Persona  sofia, camila, raquel, jorge, ricardo;

		//Instanciación

		sofia = new Persona();

		sofia.genero = 'F';
		sofia.edad = 25;
		sofia.altura = 170.0;
		sofia.peso = 70.0;

		camila = new Persona();

		camila.genero = 'F';
		camila.edad = 25;
		camila.altura = 170.0;
		camila.peso = 70.0;

		raquel= new Persona();

		raquel.genero = 'F';
		raquel.edad = 25;
		raquel.altura = 170.0;
		raquel.peso = 70.0;

		jorge = new Persona();

		jorge.genero = 'F';
		jorge.edad = 25;
		jorge.altura = 170.0;
		jorge.peso = 70.0;

		ricardo = new Persona();

		ricardo.genero = 'F';
		ricardo.edad = 25;
		ricardo.altura = 170.0;
		ricardo.peso = 70.0;

		camila.cumplirAños();
		camila.comer(2.5);
		
		System.out.println(camila.obtenerEdad());
		System.out.println(camila.pesar());
	}

}
