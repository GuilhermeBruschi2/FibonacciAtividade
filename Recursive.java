package Recursivo;


import java.util.Scanner;

public class Recursive {

public static void main(String args[]) {

System.out.println("Informe o número da sequencia Fibonacci pretendida: ");
int numero = new Scanner(System.in).nextInt();

System.out.println("Sequencia Fibonacci através do método de Recursão com número fornecido: " + numero);

for (int i = 1; i <= numero; i++) {
System.out.println(fibonacciRecursivo(i) + " ");

}

System.out.println("\nO número Fibonacci correspondente a posição " + numero
+ " é = " + (fibonacciLoop(numero) + ""));

}


public static int fibonacciRecursivo(int numero) {
if (numero == 1 || numero == 2) {
return 1;
}

return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
}

public static int fibonacciLoop(int numero) {
if (numero == 1 || numero == 2) {
return 1;
}
int fib1 = 1, fib2 = 1, fibonacci = 1;
for (int i = 3; i <= numero; i++) {
fibonacci = fib1 + fib2;
fib1 = fib2;
fib2 = fibonacci;

}

return fibonacci;
}

private static void log(String numero) {
System.out.println(numero);

}
}