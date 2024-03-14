package clinicaveterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String dni;
	private String direccion;
	private String email;
	private ArrayList<Animal> mascotas;
	
	public Cliente(String nombre, String dni, String direccion, String email, ArrayList<Animal> mascotas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.mascotas = mascotas;
	}

	public Cliente(String nombre, String dni, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.mascotas = new ArrayList<Animal>();
	}
	public Cliente() {
		this.nombre = "";
		this.dni = "";
		this.direccion = "";
		this.email = "";
		this.mascotas = new ArrayList<Animal>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Animal> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animal> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", email=" + email
				+ ", mascotas=" + mascotas + "]";
	}
	
	public static void main(String[] args) {
		
		
		
		Vacunas v=new Vacunas("Leishmania", " 1 enero", "Phizer", 80);
		Vacunas v2=new Vacunas("Antibárrica","1 de febrero","Astra Zeneca",50);
		
		Gato g=new Gato(2, 5, "Rag doll", "Macho", "Leon", true);
		g.getLibroVacunacion().add(v2);
		
		
		Perro p=new Perro(2, 15, "Border Collie", "Hembra", "Lori", "12232", false);
		System.out.println(p);
		p.getLibroVacunacion().add(v);
		p.getLibroVacunacion().add(v2);
		System.out.println(p);
		double suma=0;
		
		for(Vacunas vac: p.getLibroVacunacion()) {
			suma=suma+vac.getPrecio();
			
		}
		System.out.println("Total vacunas de: "+p.getNombre()+" "+suma);
		
		Cliente m=new Cliente("Luis", "12345678D", "calle ribera", "luis@ribera.es");
		m.getMascotas().add(p);
		m.getMascotas().add(g);
		
		suma=0;
		for(Animal a: m.getMascotas()) {
			for(Vacunas va: a.getLibroVacunacion()) {
				suma=suma+va.getPrecio();
			}
		}
		System.out.println("Total vacunas de las mascotas de: "+m.getNombre()+" "+suma);
	}
}
