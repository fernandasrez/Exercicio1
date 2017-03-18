
package projetolista;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
    
     double num;
     double exp;
     double resultado;
     
     System.out.println("Entre com o número:");
     num = leitor.nextInt();
     System.out.println("Entre com o expoente:");
     exp = leitor.nextInt(); 
     resultado = Math.pow(num,exp);
     
     System.out.println("Resultado:" + resultado);
        
    }
    
     
     
     
     

}
