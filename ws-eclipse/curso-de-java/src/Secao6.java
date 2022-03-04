import java.util.Locale;
import java.util.Scanner;

public class Secao6 {
	
	public void Secao6ExercicioDebug() {
		// TODO Auto-generated method stub

				Locale.setDefault(Locale.US);

				Scanner sc = new Scanner(System.in);

				double largura = sc.nextDouble();
				double comprimento = sc.nextDouble();
				double metroQuadrado = sc.nextDouble();

				double area = largura * comprimento;
				double preco = area * metroQuadrado;
				
				
				System.out.printf("AREA = %.2f%n", area);
				System.out.printf("PRECO = %.2f%n", preco);
				sc.close();
	}
	
	public void Secao6ExercicioDoWhile() {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				
				int x;
				
				do{
					System.out.println("Digite a senha para entrar: ");
					x = sc.nextInt();
				}while(x != 0);
				System.out.println("ENTROU!");
				
				sc.close();
				
	}
	
	public void Secao6ExercicioFor() {
		//* * // TODO Auto-generated method stub
		  
		  Scanner sc = new Scanner(System.in);
		  
		  int N = sc.nextInt();
		  
		  int soma = 0;
		  
		  for(int i=0; i<N; i++) { int x = sc.nextInt(); soma = soma + x;
		  
		  }
		  
		  System.out.println(soma);
		  
		  sc.close();
		 
		
		
		/*
		 * for(int i=0; i<5; i++) { System.out.println("O valor de I é: " + i);
		 * 
		 * 
		 * }
		 */
			
			for(int i=4; i>=0; i--) {
				System.out.println("O valor de I é: " + i);
			}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
