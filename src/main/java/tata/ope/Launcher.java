package tata.ope;

import tata.ope.basicas.Operaciones;

public class Launcher {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		System.out.println("la suma de 10 + 5 es = "+op.sumar(10, 5));
		System.out.println("la suma de 10 + 0 es = "+op.sumar(10, 0));
	}

}
