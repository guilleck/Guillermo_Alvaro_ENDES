package clinicaveterinaria;

import java.util.ArrayList;

public class Perro extends Animal {
	private String chipID;
	private boolean seguro;
	
	public Perro(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacunas> libroVacunacion,
			String chipID, boolean seguro) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.chipID = chipID;
		this.seguro = seguro;
	}

	public Perro(int edad, double peso, String raza, String sexo, String nombre, String chipID, boolean seguro) {
		super(edad, peso, raza, sexo, nombre);
		this.chipID = chipID;
		this.seguro = seguro;
	}
	
	public Perro() {
		super();
		this.chipID="";
		this.seguro=false;
	}

	public String getChipID() {
		return chipID;
	}

	public void setChipID(String chipID) {
		this.chipID = chipID;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Perro [chipID=" + chipID + ", seguro=" + seguro + ", peso=" + peso + ", raza=" + raza + ", nombre="
				+ nombre + ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	public static void main(String[] args) {
		Vacunas v=new Vacunas("Leishmania", " 1 enero", "Phizer", 80);
		Vacunas v2=new Vacunas("Antibárrica","1 de febrero","Astra Zeneca",50);
		
		
		Perro p=new Perro(2, 15, "Border Collie", "Hembra", "Lori", "12232", false);
		System.out.println(p);
		p.getLibroVacunacion().add(v);
		p.getLibroVacunacion().add(v2);
		System.out.println(p);
		double suma=0;
		
		for(Vacunas vac: p.getLibroVacunacion()) {
			suma=suma+vac.getPrecio();
			
		}
		System.out.println("Total vacunas: "+suma);
	}
	
	
}
