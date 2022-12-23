public class Fracciones {
	int numerador1;
	int denominador1;
	
	int numerador2;
	int denominador2;
	
	Fracciones(int num1, int den1, int num2, int den2){
		this.numerador1 = num1;
		this.denominador1 = den1;
		this.numerador2 = num2;
		this.denominador2 = den2;
	}
	
	void sumar() {
		int numeradorResultado = (this.numerador1 * this.denominador2) + 
								 (this.denominador1 * this.numerador2);
		
		int denominadorResultado = this.denominador1 * this.denominador2;
		
		String resultado = numeradorResultado + "/" + denominadorResultado;
		
		System.out.println("El resultado de la suma de fracciones es: " + resultado);
	}
	
	void restar() {
		int numeradorResultado = (this.numerador1 * this.denominador2) - 
								 (this.denominador1 * this.numerador2);
		
		int denominadorResultado = this.denominador1 * this.denominador2;
		
		String resultado = numeradorResultado + "/" + denominadorResultado;
		
		System.out.println("El resultado de la suma de fracciones es: " + resultado);
	}
	
	void multiplicación() {
		int numeradorResultado = this.numerador1 * this.numerador2;
		int denominadorResultado = this.denominador1 * this.denominador2;
		
		String resultado = numeradorResultado + "/" + denominadorResultado;
		
		System.out.println("El resultado de la suma de fracciones es: " + resultado);
	}
	
	void división() {
		int numeradorResultado = this.numerador1 * this.denominador2;
		int denominadorResultado = this.denominador1 * this.numerador2;
		
		String resultado = numeradorResultado + "/" + denominadorResultado;
		
		System.out.println("El resultado de la suma de fracciones es: " + resultado);
	}
}
