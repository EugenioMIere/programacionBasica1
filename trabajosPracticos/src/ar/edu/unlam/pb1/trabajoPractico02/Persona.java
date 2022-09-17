package ar.edu.unlam.pb1.trabajoPractico02;

public class Persona {

	char genero = '\0';
	int edad = 0;
	double peso = 0.0;
	double altura = 0.0;

	// Comportamiento(Java lo resuelve en forma de metodos)

	void cumplirAños() {

		edad++;

	}

	int obtenerEdad() {

		return edad;

	}

	void comer(double kilos) {

		peso += kilos;

	}

	double pesar() {

		return peso;

	}

	
	void crecer(double centimetros) {
		
		altura+= centimetros;
	}
	
	double medir() {

		return altura;

	}
	
	void definirElGenero(char generoDeseado){
		genero = generoDeseado;
	}
	
	char obtenerElGenro() {
		
		return genero;
		
	}
	

}
