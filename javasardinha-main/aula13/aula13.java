package aula13;

import java.util.Scanner;

/**
 *
 * @author Andrey
 */
public class aula13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero, resto;
        
        System.out.println("Digite um numero inteiro:");
        numero = ler.nextInt();
        
        resto = numero % 2;
        
        if (resto != 0){
            System.out.println("o numero e Impar");
        }else{
            System.out.println("o numero e Par");
        }
    }
    
}
