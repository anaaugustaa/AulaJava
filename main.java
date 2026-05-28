import java.util.ArrayList;
// POO -> Programação Orientada Objeto.
// É uma linguagem Fortemente tipada.
// Independente de plataforma, multiplataforma.

// JVM -> Java Virtual Machine
// A JVM é responsável por realizar a interpretação 
// do bytecode e pela execução.

// Uma variável é um espaço na memória onde
// podemos armazenar valores.
//Declarar uma variavel -> tipo Variavel = Valor
      //Valor da variavel usando o var ele
      // ira inferir o tipo automaticamente.

//Tipos primitivos
//byte 8bits -> -128 a 127
//short  16bits -> -32.768 a 32.767
//int 32bits -> -2.147.483.648 a 2.147.483.647
//long 64bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
//numeros decimais =1.2, 3.4, 5.6, 7.8, 9.0
//5.50
//float => 32 bits => precisao simples
//double => 64 bits => precisao dupla

//Todos menos o string são primitivos
//Char  é usado para apenas um caractere, por isso ele é
//usado com apenas aspas únicas
//Diferente do String, string pode ser usado somente com
//aspas duplas porque see trata de apenas frases, quando se trata
//de apenas um caractere será sempre CHAR
//boolean => verdadeiro ou falso

//Lista dinamica é uma lista em que podemos acrescentar ou remover informação
//de uma lista da forma que desejamos

//Diferença de Array e Vetor
//Array - puxa quantidade infinita de informação dentro do banco de dados
//



public class main {
    public static void(String[] args) {

         int minhaIdade = 16; 
         String teste = "Hello World";
         var testando = "Ana!";
         var teste2 = 22;
         byte n1 = 127;
         float troco = 2.55f; // float tem que ser declarado com
                              // "f" no final do numero.
        long contaBancaria = 134134134134134L;
                              // long tem que ser declarado com
                              // "l" no final do numero.
        
         //Declarar uma variavel -> tipo variavel = valor
         //Valor da variavel usando o var ele
         //ira inferir o tipo automaticamente

         System.out.println(teste);
         System.out.println(minhaIdade);
    }
      

}
class Condicional {

public static void(String[] args) {
    int num1 = 23;
    int num2 = 56;
    int result;
    result = num1 + num2;
    if (result >= 79) {
        System.out.println("GANHEI NA LOTERIA");
    }else{
        System.out.println("PERDEU TUDO");

    }

}



class aula01 {
    public static void main(String[] args){
        byte b = 100;
        short s = 10000;
        int i []= {1,2,3,4,5};
        // posição 0 1 2 3 4
        long l = 10000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = false;
        String nome[] = {"Ana ","Clara ","Augusta","Machado"};
        // posição         0       1         2        3
        String email = "anaclaraaugusta@yahoo.com";
        int[] contador = new int [10]
        nome [2] = "Elano";
        nome [5] = "Fernanda";
        if (email == "anaclaraaugusta@yahoo.com"){
            System.ouprintln("LOGIN OK");

        }else{
            System.ou.println( nome[0]+" "+nome[1] "")
        }

        if (bool) {
            System.out.println("VERDADEIRO");

        }else {
            System.out.println("Errado o nome é: "+nome[0]+" "+nome[1]"" +nome[2]);

        }
    }
} 




class array{
    public static void main (String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Aninha");
        nomes.add("Banana")
        nomes.add("Sally")

        System.out.println(nomes.get(0));

        nomes.remove(0)

        System.out.println(nomes.get(0));

        
    }

}