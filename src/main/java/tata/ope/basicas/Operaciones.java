package tata.ope.basicas;

public class Operaciones {

	
	/*****************MÉTODOS*********************/
	public int sumar(int a,int b) {
		if (a==0||b==0) {
			return 0;
		}
		return a + b;
	}
	public int restar(int a, int b) {
		if (b > a) {
			return 0;
		}
		return a - b;
	}
	public int multiplicar(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a*b;
	}
	
	public int division(int a, int b) {
		if (b==0) {
			return 0;
		}
		return a/b;
	}
	
	
	
	
}
