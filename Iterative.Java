import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in)
		System.out.println("Informe o número da sequencia Fibonacci pretendida: ");
		
		int numero = sc.nextInt();
		
		System.out.println(fibonacciIterative(numero));
	}

