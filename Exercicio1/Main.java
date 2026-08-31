package Exercicio1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Digite sua idade: ");
        a = input.nextInt();

        input.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Sua idade é: " + a);
      System.out.println("Seu nome é: " + nome);

      input.close();
     }
}