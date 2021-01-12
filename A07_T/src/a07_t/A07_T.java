package a07_t;

import java.util.Scanner;

public class A07_T {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op;
        boolean incorreto;
    
        do{
            System.out.println("\n\n----- MENU -----");
            System.out.println("1 - Operadores unários");
            System.out.println("2 - Operadores de atribuição");
            System.out.println("0 - Sair");
            do{
                incorreto = false;
                System.out.println("\nEscolha uma das opções: ");
                op = leitor.nextInt();
                if(op < 0 || op > 2){
                    incorreto = true;
                }
            }while(incorreto);
            
            switch(op){
                case 1:
                    A07_T.operadoresUnarios();
                    break;
                case 2:
                    A07_T.operadoresAtribuicao();
                    break;
            }
        }while(op != 0);
    
    }
    
    private static void operadoresAtribuicao(){
        System.out.println("----- OPERADORES DE ATRIBUIÇÃO -----");
        
        System.out.println("\nVariavel NUMERO com o valor inicial é 10");
        System.out.println("Constante auxiliar é 2");
        
        int numero = 10;
        numero += 2; // O mesmo que numero = numero + 2;
        System.out.println("\nO numero (+=) é " + numero);
        
        numero = 10;
        numero -= 2; // O mesmo que numero = numero - 2;
        System.out.println("O numero (-=) é " + numero);
        
        numero = 10;
        numero *= 2; // O mesmo que numero = numero * 2;
        System.out.println("O numero (*=) é " + numero);
        
        numero = 10;
        numero /= 2; // O mesmo que numero = numero / 2;
        System.out.println("O numero (/=) é " + numero);
        
        numero = 10;
        numero %= 2; // O mesmo que numero = numero % 2;
        System.out.println("O numero (%=) é " + numero);
    }
    
    private static void operadoresUnarios(){
        System.out.println("----- OPERADORES UNÁRIOS (++ e --) -----");
        // ++ - Incremento - Soma mai um a variável
        // -- - Decremento - Subtrai um da variável
        
        int numero = 5;
        // PÓS-INCREMENTO: o número só somara mais 1 DEPOIS da expressão
        int valor = 10 + numero++;
        System.out.println("O valor com PÓS INCREMENTO é " + valor + " e o numero é " + numero);
        
        
        numero = 5;
        // PRÉ-INCREMENTO: o número somara mais 1 ANTES da expressão
        valor = 10 + ++numero;
        System.out.println("O valor com PRÉ INCREMENTO é " + valor + " e o numero é " + numero);
        
        
        numero = 5;
        // PÓS-DECREMENTO: o número só vao subtrair 1 DEPOIS da expressão
        valor = 10 - numero--;
        System.out.println("O valor com PÓS DECREMENTO é " + valor + " e o numero é " + numero);
   
        
        numero = 5;
        // PÓS-DECREMENTO: o número só vao subtrair 1 ANTES da expressão
        valor = 10 - --numero;
        System.out.println("O valor com PRÉ DECREMENTO é " + valor + " e o numero é " + numero);
    }   
}
