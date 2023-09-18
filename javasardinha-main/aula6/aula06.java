package aula6;

/**Exercício 06
 * Disciplina: Operadores Atribuição e Aritméticos
 * Materia: Entrada de dados
 * @author Renan Donizete
 *
 */
public class aula06 {
    public static void main(String[]args){
       float nota1 = 10;
       float nota2 = 9;
       float nota3 = 8;
       float nota4 = 3;
       
       float media, soma =0;
       soma = nota1 + nota2 + nota3 + nota4;
       media = soma / 4;
       System.out.println("Soma:"+ soma);
       System.out.println("Media:"+ media);
    }
}
