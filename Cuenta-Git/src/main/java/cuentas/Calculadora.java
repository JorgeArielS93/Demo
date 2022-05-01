package cuentas;
import java.util.Iterator;

public class Calculadora {
	private int n;

	public Calculadora() {
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calculoFactorial(int num) {
		int cum=1;
		for (int j = 1; j <=num; j++) {
			cum=cum*j;
		}
		return cum;
	}
}

