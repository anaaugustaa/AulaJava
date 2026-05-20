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
//float => 32 bits => preciso simples
//double => 64 bits => precis

//Todos menos o string são primitivos
//Char  é usado para apenas um caractere, por isso ele é
//usado com apenas aspas únicas
//Diferente do String, string pode ser usado somente com
//aspas duplas porque see trata de apenas frases, quando se trata
//de apenas um caractere será sempre CHAR
//boolean => verdadeiro ou falso

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



class aula01{
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;
        
        if (bool){
            System.out.println("VERDADEIRO");

        }else{
            System.out.println("FALSO");

        }


    }


}

