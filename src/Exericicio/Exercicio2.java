package Exericicio;

import java.util.Scanner;

public class Exercicio2 {
	
public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	
	System.out.println("informe o salario");

	int salario = s.nextInt();

	System.out.println("informe a porcentagem de 1 a 100");

	int reajuste = s.nextInt();

	if (reajuste <= 100) {

		int somasalario = (salario * reajuste) / 100;

		int soma = somasalario + salario;

		System.out.print("Valor do reajuste é de: " + soma + ", 00");

	}

	else {

		System.out.println("valor de porcentagem nao considerado");

	}
	
} 

}
