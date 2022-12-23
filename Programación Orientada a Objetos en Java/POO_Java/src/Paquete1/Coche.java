package Paquete1;


public abstract class Coche {
	private String motor;
	private int puertas;
	private int ruedas;
	
	void arrancar() {
		System.out.println("El coche arranca.");
	}
	
	void frenar() {
		System.out.println("El coche frena.");
	}
	
	void acelerar() {
		System.out.println("El coche acelera.");
	}
}

class Deportivo extends Coche {
	public void arrancar() {
		System.out.println("El coche deportivo arranca.");
	}
	
}

class Electrico extends Coche {
	public void arrancar() {
		System.out.println("El coche eléctrico arranca.");
	}
}

class Combustion extends Coche {
	public void arrancar() {
		System.out.println("El coche de combustion arranca.");
	}
}