import java.util.Locale;
import java.util.Scanner;

public class Secao4 {
	
	
	/* 
	Operadores aritméticos
		Operador Significado
		+ adição
		- subtração
		* multiplicação
		/ divisão
		% resto da divisão ("mod")
		Precedência: 1º lugar: * / %
		2º lugar: + -
		C, C++,
		Java, C#
	*/
	
	
	/*
	 * Tipos primitivos em Java
			Descrição Tipo Tamanho Valores Valor padrão
			tipos numéricos inteiros
			byte 8 bits -128 a 127 0
			short 16 bits -32768 a 32767 0
			int 32 bits -2147483648 a 2147483647 0
			long 64 bits -9223372036854770000 a 
			9223372036854770000 0L
			tipos numéricos com
			ponto flutuante
			float 32 bits -1,4024E-37 a 3,4028E+38 0.0f
			double 64 bits -4,94E-307 a 1,79E+308 0.0
			um caractere Unicode char 16 bits '\u0000' a '\uFFFF' '\u0000'
			valor verdade boolean 1 bit {false, true} false
			String - cadeia de caracteres (palavras ou textos)
	 * 
	 * 
	 */
	
		/*
		 * Nomes de variáveis
				• Não pode começar com dígito: use uma letra ou _ 
				• Não pode ter espaço em branco
				• Não usar acentos ou til
				• Sugestão: use o padrão "camel case"
				Errado:
				int 5minutos;
				int salário;
				int salário do funcionario;
				Correto:
				int _5minutos;
				int salario;
				int salarioDoFuncionario;
		 */
		
		/*
		 * Resumo da aula
				• Conceito informal
				• Declaração de variáveis: <tipo> <nome> = valor;
				• Tipos primitivos:
				• Números inteiros: byte, short, int, long
				• Números com ponto flutuante: float, double
				• Valor verdade: boolean
				• Um caractere Unicode: char
				• Tipo String: cadeia de caracteres (palavras, textos)
				• Nomes de variáveis / padrão camel case

		 */
	
	
	/*
	 * EXERCICIO DE FIXAÇÃO
	 * String product1 = "Computer"; String product2 = "Office desk";
	 * 
	 * int age = 30; int code = 5290; char gender = 'F';
	 * 
	 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
	 * 
	 * System.out.printf("Products%n");
	 * System.out.printf("%s, which price is $ %.2f %n",product1,price1);
	 * System.out.printf("%s, which price is $ %.2f %n%n",product2,price2);
	 * 
	 * System.out.printf("Record: %d years old, code %d and gender %c %n%n",age,code
	 * ,gender);
	 * 
	 * System.out.printf("Measue with eight decimal places: $ %.8f %n",measure);
	 * System.out.printf("Rouded (three decimal places): $ %.2f %n", measure);
	 * Locale.setDefault(Locale.US);
	 * System.out.printf("US decimal point: %.3f",measure);
	 */

	

	/*
		 * int a,b; double resultado;
		 * 
		 * a = 5; b = 2;
		 * 
		 * resultado = (double) a/b;
		 * 
		 * System.out.println(resultado);
	 */
	
	/*
		 * double a; int b;
		 * 
		 * a = 5.0; b = (int) a;
		 * 
		 * System.out.println(b);
	 */
	
	
		/*
		 * Scanner sc = new Scanner(System.in); String s1, s2, s3; int x;
		 * 
		 * x = sc.nextInt(); sc.nextLine(); s1 = sc.nextLine(); s2 = sc.nextLine(); s3 =
		 * sc.nextLine();
		 * 
		 * System.out.println("DADOS DIGITADOS:"); System.out.println(x);
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 * 
		 * 
		 * 
		 * sc.close();
		 */
	
	
	
			/*
			 * double x = 3.0; double y = 4.0; double z = -5.0; double A, B, C; A =
			 * Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(25.0);
			 * System.out.println("Raiz quadrada de " + x + " = " + A);
			 * System.out.println("Raiz quadrada de " + y + " = " + B);
			 * System.out.println("Raiz quadrada de 25 = " + C); A = Math.pow(x, y); B =
			 * Math.pow(x, 2.0); C = Math.pow(5.0, 2.0); System.out.println(x +
			 * " elevado a " + y + " = " + A); System.out.println(x +
			 * " elevado ao quadrado = " + B); System.out.println("5 elevado ao quadrado = "
			 * + C); A = Math.abs(y); B = Math.abs(z);
			 * System.out.println("Valor absoluto de " + y + " = " + A);
			 * System.out.println("Valor absoluto de " + z + " = " + B);
			 * 
			 */
	
	public void Secao4exer() {
	
			// TODO Auto-generated method stub
			
			Locale.setDefault(Locale.US);
			
			
			Scanner sc = new Scanner (System.in); 
			
			double largura = sc.nextDouble();
			double comprimento = sc.nextDouble();
			double metroQuadrado = sc.nextDouble();
			
			double area = largura * comprimento;
			double preco = area * metroQuadrado;
			
			System.out.printf("AREA = %.2f%n", area);
			System.out.printf("PRECO = %.2f%n", preco);
			
			sc.close();
	}
	
	
	public void Secao4exer2() {

		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 * Exemplos: Entrada: Saída: 10 30 SOMA = 40 Entrada: Saída: -30 10 SOMA = -20
		 * Entrada: Saída: 0 0 SOMA = 0
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int entrada1 = sc.nextInt(); int entrada2 = sc.nextInt();
		 * 
		 * int resultado = entrada1 + entrada2;
		 * 
		 * System.out.println("SOMA = "+ resultado);
		 */

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = r. raio2 Considere o valor de r = 3.14159
		 */

		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * // TODO Auto-generated method stub Scanner sc = new Scanner(System.in);
		 * 
		 * double raio = sc.nextDouble();
		 * 
		 * double circulo = 3.14159;
		 * 
		 * double formulaDaArea = circulo * Math.pow(raio, 2.0);
		 * 
		 * System.out.printf("A = %.4f", formulaDaArea);
		 * 
		 * sc.close();
		 */

		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */

		/*
		 * int A,B,C,D; Scanner sc = new Scanner(System.in); A = sc.nextInt(); B =
		 * sc.nextInt(); C = sc.nextInt(); D = sc.nextInt();
		 * 
		 * int dif = (A*B-C*D);
		 * 
		 * System.out.println("DIFERENCA = " + dif);
		 * 
		 * sc.close();
		 */

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int numeroFuncionario,horasTrabalhadas;
		 * double valorPorHora,salario;
		 * 
		 * numeroFuncionario = sc.nextInt(); horasTrabalhadas = sc.nextInt();
		 * valorPorHora = sc.nextDouble();
		 * 
		 * salario = horasTrabalhadas * valorPorHora;
		 * 
		 * System.out.println("NUMBER = "+ numeroFuncionario);
		 * System.out.printf("SALARY = U$ %.2f%n",salario);
		 * 
		 * sc.close();
		 * 
		 */
		
		
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 * 
		 * 
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int cod1, cod2, qt1, qt2; double valorPc1, valorPc2,total;
		 * 
		 * cod1 = sc.nextInt(); qt1 = sc.nextInt(); valorPc1 = sc.nextDouble();
		 * 
		 * cod2 = sc.nextInt(); qt2 = sc.nextInt(); valorPc2 = sc.nextDouble();
		 * 
		 * total = (valorPc1 * qt1) + (valorPc2 * qt2);
		 * 
		 * System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		 */

	
			double A, B, C;
			double raio,  pi=3.14159;
			
			Scanner sc2 = new Scanner(System.in);
			A = sc2.nextDouble();
			B = sc2.nextDouble();
			C = sc2.nextDouble();
			
			
			double triangulo = A*C/2.0;
			double circulo = pi * C * C;
			double trapezio = (A+B)* C/2;
			double quadrado = B*B;
			double retangulo = A*B;
			
			System.out.printf("TRIANGULO: %.3f%n",triangulo);
			System.out.printf("CIRCULO: %.3f%n",circulo);
			System.out.printf("TRAPEZIO: %.3f%n",trapezio);
			System.out.printf("QUADRADO: %.3f%n",quadrado);
			System.out.printf("RETANGULO: %.3f%n",retangulo);
			
		}
	
	public static void main(String[] args) {
		
			Secao4	s = new Secao4();
			s.Secao4exer2();
		

		
		
		}
	}


	

	
