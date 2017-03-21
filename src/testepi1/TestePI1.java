package testepi1;

import java.util.Scanner;

/*
Receba dois números e mostre o produto deles.
 */
public class TestePI1 {

    public static void main(String[] args) {
        double NUM1, NUM2;
        double resultado;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro número:");
        NUM1 = leitor.nextDouble();
        System.out.println("Escreva o segundo número");
        NUM2 = leitor.nextDouble();
        
        resultado = NUM1*NUM2;
        
        System.out.println("Produto dos números digitados:" + resultado);
        
    }
    
}
