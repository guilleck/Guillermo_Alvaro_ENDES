package clinicaveterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVet {
	
	private ArrayList<Cliente>clientes;
	
	public AppVet() {
		this.clientes=new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public static void main(String[] args) {
		AppVet app=new AppVet();//reservo memoria para el AL
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		/////////////////////////////////////////////////
		
		Vacunas v=new Vacunas("Leishmania", " 1 enero", "Phizer", 100);
		Vacunas v2=new Vacunas("Antibárrica","1 de febrero","Astra Zeneca",96);
		
		Gato g1=new Gato(2, 5, "Rag doll", "Macho", "Leon", true);
		Gato g2=new Gato(12, 6, "Egipcio", "Hembra", "Perico", false);
		Perro p1=new Perro(2, 15, "Border Collie", "Hembra", "Lori", "12232", false);
		Perro p2=new Perro(6, 19, "Bulldog", "Hembra", "Caqui", "26487", true);
		
		g1.getLibroVacunacion().add(v);
		g2.getLibroVacunacion().add(v2);
		g2.getLibroVacunacion().add(v);
		p1.getLibroVacunacion().add(v2);
		p1.getLibroVacunacion().add(v);
		p2.getLibroVacunacion().add(v);
		
		Cliente c1=new Cliente("Pedro", "12345678F", "Calle palo", "pedro@ribera.es");
		Cliente c2=new Cliente("Pablo", "87654321K", "calle tronco", "pablo@ribera.es");
		app.getClientes().add(c2);
		app.getClientes().add(c1);
		
		c1.getMascotas().add(p1);
		c1.getMascotas().add(g2);
		
		c2.getMascotas().add(g1);
		c2.getMascotas().add(p2);
		
		/////////////////////////////////////////////////
		do {
			app.menu();
			opcion=sc.nextInt();
			switch(opcion) {
				
			case 1:
				
				break;
			case 2:
				System.out.println("DNI");
				String dni=sc.next();
				app.atenderCliente(dni);
				break;
			case 3:
				for(Cliente c: app.getClientes()) {
				System.out.println("Dime si es gato, perro o conejo");
				String animal=sc.next();
				String gato="";
				if(animal.equals("gato")) {
					System.out.println("Edad:");
					int edad=sc.nextInt();
					System.out.println("Peso:");
					double peso=sc.nextDouble();
					System.out.println("Raza:");
					String raza=sc.next();
					System.out.println("Sexo: ");
					String sexo=sc.next();
					System.out.println("Nombre: ");
					String nombre=sc.next();
					System.out.println("Obesidad: ");
					boolean obesidad=sc.nextBoolean();
					
				}
				if(animal.equals("perro")) {
					System.out.println("Edad:");
					int edad=sc.nextInt();
					System.out.println("Peso:");
					double peso=sc.nextDouble();
					System.out.println("Raza:");
					String raza=sc.next();
					System.out.println("Sexo: ");
					String sexo=sc.next();
					System.out.println("Nombre: ");
					String nombre=sc.next();
					System.out.println("Seguro: ");
					boolean seguro=sc.nextBoolean();
					
				}
				if(animal.equals("conejo")) {
					System.out.println("Edad:");
					int edad=sc.nextInt();
					System.out.println("Peso:");
					double peso=sc.nextDouble();
					System.out.println("Raza:");
					String raza=sc.next();
					System.out.println("Sexo: ");
					String sexo=sc.next();
					System.out.println("Nombre: ");
					String nombre=sc.next();
					System.out.println("Longitud de las orejas: ");
					double longOrejas=sc.nextDouble();
					
				}
				
			}
				break;
			case 4:
				app.contarAnimales();
				
				break;
			case 5:
				app.mostrarPerros();
				break;
			case 6: 
				app.gatosObesos();
				break;
			case 7:
				String raza="";
				System.out.println("Dame la raza del animal");
				sc.nextLine();
				raza=sc.nextLine();
				app.razaAnimal(raza);
				break;
			case 8:
				System.out.println("FIN");
				break;
			}
		}while(opcion!=8);
	}

	
	private void contarAnimales() {
		int contPerro=0, contGato=0, contConejo=0;
		for(Cliente c: this.getClientes()) {
			for(Animal a:c.getMascotas()) {
			System.out.println(c.getNombre());
				for(int i=0;i<c.getMascotas().size();i++) {	
					if(a instanceof Perro) {
						contPerro++;
					}
					if(a instanceof Gato) {
						contGato++;
					}
					if(a instanceof Conejo) {
						contConejo++;
					}
				}		
	}
		System.out.println("Perros: "+contPerro);
		System.out.println("Gatos: "+contGato);
		System.out.println("Conejos: "+contConejo);
		
	}
}
	private void razaAnimal(String raza) {
		for(Cliente c:this.getClientes()) {
			for(Animal a:c.getMascotas()) {
				if(raza.equals(a.getRaza())) {
					System.out.println(a.getNombre());
				}
			}
		}
		
	}

	private void gatosObesos() {
		for(Cliente c:this.getClientes()) {
			for(Animal a: c.getMascotas()) {
				if(a instanceof Gato) {
				if(((Gato)a).isObesisdad()==true) {
					System.out.println(a.getNombre());
				}
			}
		}
	}
		
}

	private void mostrarPerros() {
		for(Cliente c: this.getClientes() ) {
			for(Animal a: c.getMascotas()) {
				if(a instanceof Perro) {
				System.out.println(a.getNombre()+" "+((Perro)a).isSeguro()+" seguro");
				
				}	
				
			}
		}
		
	}

	private void atenderCliente(String dni) {
		double suma=0;
		for(Cliente c: this.getClientes()) {
			if(c.getDni().equals(dni)) {
				System.out.println(c.getNombre());
				//Mascotas de los clientes
				for(Animal a: c.getMascotas()) {
					System.out.println(a.getNombre()+" "+a.getRaza());
					
					
				}
			}
		}
		
	}

	private void menu() {
		System.out.println("1.Dar de alta un cliente");
		System.out.println("2.Atender un cliente");
		System.out.println("3.Dar de alta una mascota");
		System.out.println("4.Numero de animales");
		System.out.println("5. Mostrar nombre de los perros y seguro");
		System.out.println("6.Mostrar los gatos obesos");
		System.out.println("7.Mostrar animales por raza");
		System.out.println("8.Salir");
		System.out.println("Elige una opcion:");
		
	}
}
