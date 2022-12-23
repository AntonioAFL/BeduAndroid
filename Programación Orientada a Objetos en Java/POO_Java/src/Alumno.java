public class Alumno {
	String nombre;
	String apellido;
	String matrícula;
	int calificación;
	
	Alumno(String nombre, String apellido, String matrícula, int calificación){
		this.nombre = nombre;
		this.apellido = apellido;
		this.matrícula = matrícula;
		this.calificación = calificación;
	}
	
	void imprimir_resultado() {
		System.out.println("Alumn@: " + this.nombre + ", Apellido: " + this.apellido
				 			+ ", Matrícula: " + this.matrícula);
		if (this.calificación < 70) {
			System.out.println("Tu calificación no es aprobatoria. Te sugerimos"
								+ " estudies nuevamente los temas vistos.\n");
		}
		else if (this.calificación >= 70 && this.calificación < 90) {
			System.out.println("Bien hecho tu calificación es aprobatoria.\n");
		}
		else {
			System.out.println("Felcidades tu calificación es excelente!!\n");
		}
	}
}