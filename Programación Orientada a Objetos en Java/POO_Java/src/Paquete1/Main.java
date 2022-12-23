package Paquete1;

public class Main {

	public static void main(String[] args) {
	
		Coche coche = new Electrico();
		coche.arrancar();
		
		coche = new Combustion();
		coche.arrancar();
		
		coche = new Deportivo();
		coche.arrancar();
		
	}	

}
