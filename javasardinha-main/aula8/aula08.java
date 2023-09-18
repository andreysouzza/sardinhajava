package aula8;

/**Exercício 07
 * Disciplina: Operadores Atribuição e Aritméticos
 * Materia: Entrada de dados
 * @author Andrey
 */
public class aula08 {
   public static void main(String[] args){
       int a = 5;
       int b = 10;
       
       System.out.println(a > b && a < b);
       
       if(a > b){
           System.out.println("maior");   
   }else if(a < b){
       System.out.println("Menor");
   }else{
       System.out.println("Igual");
   }
}
}
