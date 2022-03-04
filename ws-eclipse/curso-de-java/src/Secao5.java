import java.util.Locale;
import java.util.Scanner;

public class Secao5 {

	
	public void Secao5exercicio1() {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um número inteiro"); int entrada = sc.nextInt();
		 * 
		 * if(entrada<0) { System.out.println("NEGATIVO"); }else {
		 * System.out.println("POSITIVO"); }
		 * 
		 * sc.close();
		 */
		
		
			/*
			 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
			 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
			 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
			 * crescente ou decrescente.
			 * 
			 * 
			 * Scanner sc = new Scanner(System.in);
			 * 
			 * int a,b;
			 * 
			 * a = sc.nextInt(); b = sc.nextInt();
			 * 
			 * 
			 * if(a % b == 0 && b % a == 0 ) { System.out.println("São multiplos");
			 * System.out.println(a%b); System.out.println(b%a); }else {
			 * System.out.println("Não são multiplos"); System.out.println(a%b);
			 * System.out.println(b%a); }
			 * 
			 * sc.close();
			 */
		
			/*
			 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
			 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
			 * uma duração mínima de 1 hora e máxima de 24 horas.
			 * 
			 * Scanner sc = new Scanner(System.in);
			 * 
			 * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt();
			 * 
			 * int duracao; if (horaInicial < horaFinal) { duracao = horaFinal -
			 * horaInicial; } else { duracao = 24 - horaInicial + horaFinal; }
			 * 
			 * System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			 * 
			 * sc.close();
			 */	
		
		
			/*
			 * Locale.setDefault(Locale.US);
			 * 
			 * int cod,qtd; double resultado,valorProd =0;
			 * 
			 * 
			 * Scanner sc = new Scanner(System.in); System.out.println("Digite o Cod: ");
			 * cod = sc.nextInt(); System.out.println("Digite a quantidade: "); qtd =
			 * sc.nextInt();
			 * 
			 * if(cod == 1) { valorProd = 4.00; }else if(cod == 2) { valorProd = 4.50; }else
			 * if(cod == 3) { valorProd = 5.00; }else if(cod == 4) { valorProd = 2.00; }else
			 * if(cod == 5) { valorProd = 1.50; }else {
			 * System.out.println("Cod não encontrado");
			 * 
			 * }
			 * 
			 * resultado = (qtd*valorProd);
			 * 
			 * System.out.printf("Total: %.2f%n",resultado);
			 * 
			 * sc.close();
			 */
			/*
			 * Você deve fazer um programa que leia um valor qualquer e apresente uma
			 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
			 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
			 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
			 */
		
			/*
			 * Locale.setDefault(Locale.US);
			 * 
			 * Scanner sc = new Scanner(System.in); double entrada = sc.nextDouble();
			 * 
			 * if(entrada >= 0 && entrada <= 25) { System.out.println("Intervalo [0,25]");
			 * }else if(entrada >= 25.01 && entrada <= 50.00) {
			 * System.out.println("Intervalo [25,50]"); }else if(entrada >= 50.01 && entrada
			 * <= 75.00) { System.out.println("Intervalo [50,75]"); }else if(entrada >=
			 * 75.01 && entrada <= 100) { System.out.println("Intervalo [75,100]"); }else {
			 * System.out.println("Fora de intervalo"); }
			 * 
			 * 
			 * 
			 * sc.close();
			 * 
			 */
		
		
			/*
			 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
			 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
			 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
			 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
			 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
			 * situação.
			 * 
			 * Locale.setDefault(Locale.US);
			 * 
			 * double x,y;
			 * 
			 * Scanner sc = new Scanner(System.in); x = sc.nextDouble(); y =
			 * sc.nextDouble();
			 * 
			 * if (x == 0.0 && y == 0.0) { System.out.println("Origem"); } else if (x ==
			 * 0.0) { System.out.println("Eixo Y"); } else if (y == 0.0) {
			 * System.out.println("Eixo X"); } else if (x > 0.0 && y > 0.0) {
			 * System.out.println("Q1"); } else if (x < 0.0 && y > 0.0) {
			 * System.out.println("Q2"); } else if (x < 0.0 && y < 0.0) {
			 * System.out.println("Q3"); } else { System.out.println("Q4"); }
			 * 
			 * 
			 * sc.close();
			 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		
		if(salario <= 2000.0) {
			imposto = 0.0;
		}
		else if(salario <3000.0) {
			imposto = (salario - 2000.0) * 0.08;
			salario -= 2000.0;
			System.out.printf("%.2f%n",salario);
					}
		else if(salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0  * 0.08;
			salario -= 2000.0;
			System.out.printf("%.2f%n",salario);
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0  * 0.08;
			salario -= 2000.0;
			System.out.printf("%.2f%n",salario);
		}
		
		
		if(imposto == 0.0) {
			System.out.println("Insento");	
		}
		else {
			System.out.printf("R$ %.2f,%n",imposto);
		}
		
		
		
		
		
		
		sc.close();
		
	}
	
	public void Secao5exercicio2() {
	/*Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas horas?");
		int hora = sc.nextInt();
		
		if(hora >=6 & hora <12) {
			System.out.println("Bom dia!");
		}else if(hora >= 12 & hora <19 ){
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
		
		sc.close();*/		


		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas horas?");
		int hora = sc.nextInt();
		
		if(hora >=6 & hora <12) {
			System.out.println("Bom dia!");
		}else if(hora >= 12 & hora <19 ){
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
		
	}
	
	
	public void Secao5exercicio3() {
		String dia;
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Dia invalido";
			break;
			
		}
		System.out.println("Dia da semana:" + dia);
			
		sc.close();
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0 ? preco * 0.1 : preco * 0.05);
		
		System.out.println(desconto);
		
		sc.close();
		
	}
	
}
