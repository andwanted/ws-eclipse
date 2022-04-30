package program;

import java.lang.Character.UnicodeScript;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta c = new Conta();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		c.setConta(sc.nextInt());
		System.out.print("Enter account holder: ");
		c.setTitular(sc.next());
		sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		String op = sc.next();
		if (op.equals("y")) {

			System.out.print("Enter initial deposit value: ");
			c.setSaldoInicial(sc.nextDouble());
			System.out.println();
		}

		System.out.printf("Account data: ");
		System.out.println(c.toString());

		System.out.printf("Enter a deposit value: ");
		c.depositar(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(c.toString());

		System.out.printf("Enter a withdraw value: ");
		c.sacar(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(c.toString());

		sc.close();
	}

}
