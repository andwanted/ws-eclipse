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
<p>Para ler um texto ATÉ A QUEBRA DE LINHA</p>
 
 `           import java.util.Scanner;

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
      }`
