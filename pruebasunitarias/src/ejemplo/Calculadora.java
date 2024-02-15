package ejemplo;

public class Calculadora {
	
	public static int suma(int a,int b) {
		
		return a + b;
	}
	
	public static int resta(int a,int b) {
		
		return a - b;
		
	}
	
	public static int factorial(int num) {
		
			
			
			return num * factorial(num-1);
	
		
	}
	

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int num1=3, num2=2;
		
		int resul=suma(num1,num2);
		
		int numerofactorial=factorial(3);
		
		System.out.println("El resultado de sumar 3 + 2= " + resul);
		System.out.println("factorial de 3: " + numerofactorial);
	}

}

