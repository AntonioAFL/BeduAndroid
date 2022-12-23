
public class EjerciciosMain {

	public static void main(String[] args) {
	
		System.out.println("EJERCICIO 1:");
		Fracciones fracciones = new Fracciones(4,2,5,3);
		fracciones.sumar();
		fracciones.restar();
		fracciones.multiplicación();
		fracciones.división();
		System.out.println('\n');
		
		System.out.println("EJERCICIO 2:");
		Alumno a1 = new Alumno("Clara", "Ramos", "F34A024", 90);
		Alumno a2 = new Alumno("Jorge", "Rodriguez", "F27A031", 46);
		Alumno a3 = new Alumno("Ivan", "Hernandez", "F24A123", 71);
		Alumno a4 = new Alumno("Jazmin", "Peralta", "F30A078", 58);
		
		a1.imprimir_resultado();
		a2.imprimir_resultado();
		a3.imprimir_resultado();
		a4.imprimir_resultado();
		System.out.println('\n');
	}

}
