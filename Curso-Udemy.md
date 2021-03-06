# ws-eclipse
<h1 align="center">Curso De Java Udemy :)</h1>

### 🛠 Referencias 

As seguintes ferramentas foram usadas na construção do projeto:

- [Exemplo rocketseat](https://blog.rocketseat.com.br/como-fazer-um-bom-readme/#-t-tulo-e-descri-o)
- [Exemplo GitHub](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)



```
Code here :D
```



<h2><b>Seção 1</b></h2>
  - Introdução ao curso.

:performing_arts:	:performing_arts:	:performing_arts:	 :rainbow:	:rainbow:	:rainbow:	:dizzy:	:dizzy:	:dizzy:	

  <br>  
  
<h2><b>Seção 2</b></h2>
    - Algoritmo, Automação, Programa  de Computador
    
    Algoritmo: sequência finita de instruções para se resolver um problema
        Automação: quando uma máquina realiza o algoritmo
    
    Computador:
        hardware / software
        Máquina que automatiza algoritmos (de cálculo)
        Programa de computador: algoritmo executado pelo computador

    Linguagem: conjunto de regras léxicas e sintáticas para se escrever um programa
        Léxica = ortografia. Palavras isoladas.
        Sintática = gramática. Sentença como um todo.

    Exemplos de linguagens: C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.
        Exemplo de códigos feitos em linguagem C, C++, C# e Java

:performing_arts:	:performing_arts:	:performing_arts:	 :rainbow:	:rainbow:	:rainbow:	:dizzy:	:dizzy:	:dizzy:	

  <br>  
  
<h2><b>Seção 3</b></h2>
   -Entendendo as versões do Java

    ```
    http://www.oracle.com/technetwork/java/javase
    ```
    LTS - Long Term Support - é o termo para a versão que terá maior duração de suporte pela oracle.
    

      O que é Java?
      • Linguagem de programação (regras sintáticas) • Plataforma de desenvolvimento e execução
      • Bibliotecas (API) • Ambientes de execução
      
      Histórico
      
      • Problemas resolvidos e motivo de seu sucesso: • Ponteiros / gerenciamento de memória
      • Portabilidade falha: reescrever parte do código ao mudar
      de SO
      • Utilização em dispositivos diversos
      • Custo
      • Criada pela Sun Microsystems no meio da década de
      1990
      • Adquirida pela Oracle Corporation em 2010
      Aspectos notáveis
      • Código compilado para bytecode e
      executado em máquina virtual (JVM) • Portável, segura, robusta
      • Roda em vários tipos de dispositivos
      • Domina o mercado corporativo desde
      o fim do século 20
      • Padrão Android por muitos anos
      
      Edições
      
      • Java ME - Java Micro Edition - dispositivos embarcados e móveis - IoT
      • http://www.oracle.com/technetwork/java/javame
      • Java SE - Java Standard Edition - core - desktop e servidores
      • http://www.oracle.com/technetwork/java/javase
      • Java EE - Java Enterprise Edition - aplicações corporativas
      • http://www.oracle.com/technetwork/java/javaee
      Plataforma Java SE
      • Documentação
      • https://docs.oracle.com/en/java/javase/11/
      Plataforma Java SE
      • JVM - Java Virtual Machine
      • Máquina virtual do Java - necessário para executar sistemas Java

<h2><b>Seção 4</b></h2>
   -Expressões aritméticas
   
    Operadores aritméticos
        Operador Significado
          + adição
          - subtração
          * multiplicação
          / divisão
          % resto da divisão ("mod")
        Precedência:
          1º lugar: * / %
          2º lugar: + -
          
      • Conceito informal
      • Declaração de variáveis: <tipo> <nome> = valor;
      • Tipos primitivos:
      • Números inteiros: byte, short, int, long
      • Números com ponto flutuante: float, double
      • Valor verdade: boolean
      • Um caractere Unicode: char
      • Tipo String: cadeia de caracteres (palavras, textos)
      • Nomes de variáveis / padrão camel case
      
      
      
 
 
 
<br>
<h2> Exemplo do curso </h2>
<p>Para ler um texto ATÉ A QUEBRA DE LINHA</p>
 
 
 ```java
            import java.util.Scanner;

      public class Teste {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s1, s2, s3;
          s1 = sc.nextLine();
          s2 = sc.nextLine();
          s3 = sc.nextLine();
          System.out.println("DADOS DIGITADOS:");
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);
          sc.close();
        }
      }
  ```
      
      
      
   


```java
  import java.util.Locale;

      public class Main {
            public static void main(String[] args) {
              String product1 = "Computer";
              String product2 = "Office desk";
              byte age = 30;
              int code = 5290;
              char gender = 'F';
              double price1 = 2100.0;
              double price2 = 650.50;
              double measure = 53.234567;
              System.out.println("Products:");
              System.out.printf("%s, which price is $ %.2f%n", product1, price1);
              System.out.printf("%s, which price is $ %.2f%n", product2, price2);
              System.out.println();
              System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
              System.out.println();
              System.out.printf("Measue with eight decimal places: %.8f%n", measure);
              System.out.printf("Rouded (three decimal places): %.3f%n", measure);
              Locale.setDefault(Locale.US);
              System.out.printf("US decimal point: %.3f%n", measure);
            }
          }
```

<h2>Meu Exemplo</h2>

```
Casting
É a conversão explícita de um tipo para outro.
É necessário quando o compilador não é capaz de “adivinhar” que o
resultado de uma expressão deve ser de outro tipo.
```

    
```java
//exemplo de casting
		int a = 10;
		int b = 5;
		int r = a * b;
		
		System.out.println(r);
``` 
   

```
    import java.util.Locale;
    import java.util.Scanner;

    public class Teste {

      public static void main(String[] args) {

        // Para considerar o separador de decimais como ponto, ANTES da declaração do
        // Scanner, faça:
        Locale.setDefault(Locale.US);

        // exemplo entrada de saidas
        System.out.println("Exemplo de saída");

        // exemplo de testo formado tipo double
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        // para concatenar elementos
        String nome = "Anderson";
        String sobrenome = " Leandro";
        System.out.println(nome + sobrenome);

        // para concatenar com printf
        double variavel1 = 10.1;
        double variavel2 = 20.1;
        String variavel3 = "Texto 3";

        System.out.printf("TEXTO1 %f TEXTO2 %f %s %n", variavel1, variavel2,variavel3);

        String nome1 = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome1, idade, renda);




        //imprimindo sem quebra de texto
        System.out.print("Texto1 ");
        System.out.print(" Texto2 \n");


        //exemplo de casting
        int a = 10;
        int b = 5;
        int r = a * b;

        System.out.println(r);

        //exemplo entrada de dados

        Scanner sc = new Scanner(System.in);
        //recebe um tipo String
        System.out.println("Digite um texto tipo String");
        String t1 = sc.next();
        System.out.println("Texto digitado: " + t1);

        //recebe um tipo inteiro
        System.out.println("Digite um valor tipo Inteiro");
        int t2 = sc.nextInt();
        System.out.println("Numero digitado: " + t2);

        //recebe um tipo double
        System.out.println("Digite um tipo dobule");
        double t3 = sc.nextDouble();
        System.out.println("Numero digitado:" + t3);

        //recebe um tipo char
        System.out.println("Digite um valor tipo char");
        char t4 = sc.next().charAt(0);
        System.out.println("Valor tipo Char digitado " + t4);



      }
    }


```

<h3>FIM :) </h3>
