
package projetolista;

import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int a;
        int b;
        int resultado;
        
        System.out.println("Entre com o primeiro número");
        a = leitor.nextInt();
        System.out.println("Entre com o segundo número");
        b = leitor.nextInt();
        resultado = (a*b);
        
        System.out.println("Resultado:" + resultado);       
    }
    
}
