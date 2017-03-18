package projetolista;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double a;
        double b;
        double resultado;

        System.out.println("Entre com o primeiro número");
        a = leitor.nextDouble();
        System.out.println("Entre com o segundo número");
        b = leitor.nextDouble();
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        resultado = a + b;

        System.out.println("Resultado:" + resultado);

    }

}
