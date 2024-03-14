package clinicaveterinaria;

import java.util.ArrayList;

public class Gato extends Animal{
	private boolean obesisdad;
	
	public Gato() {
		super();
		this.obesisdad=false;	
	}

	public Gato(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunacion,
			boolean obesisdad) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.obesisdad = obesisdad;
	}

	public Gato(int edad, double peso, String raza, String sexo, String nombre, boolean obesisdad) {
		super(edad, peso, raza, sexo, nombre);
		this.obesisdad = obesisdad;
	}

	public boolean isObesisdad() {
		return obesisdad;
	}

	public void setObesisdad(boolean obesisdad) {
		this.obesisdad = obesisdad;
	}

	@Override
	public String toString() {
		return "Gato [obesisdad=" + obesisdad + ", peso=" + peso + ", raza=" + raza + ", nombre=" + nombre
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	
}
