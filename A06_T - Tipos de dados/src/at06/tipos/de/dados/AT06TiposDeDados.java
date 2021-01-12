package at06.tipos.de.dados;

import java.util.Scanner;

public class AT06TiposDeDados {
    public static void main(String[] args) {
        boolean continuar = false;
        int opcao = 0;
        
        int idade1 = 30;
        // Declaro uma variável inteira com o nome IDADE1 com o valor 30
        String valor1 = Integer.toString(idade1);
        // Declaro uma variável String chamada VALOR1
        // Uso a Wrapper Class Integer(inteiros) para converter a IDADE1 em String
        // A Wrapper Class passa o valor para a variável VALOR1
        
        String valor2 = "50";
        //Declaro uma variável String chamada VALOR2
        int idade2 = Integer.parseInt(valor2);
        // Declaro uma variável int chamada IDADE2
        // Uso a Wrapper Class Integer(inteiros) para converter o VALOR2 em int
        // A Wrapper Class passa o valor para a variável idade2
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("%.5f", idade3);
        /*
        do{
            System.out.println("Escolha uma das demonstraçõs: ");
            
            
        }while(continuar);
        */
    }
    
    private void tiposDeclaracao(){
        
        // Inteiro
        int idade = 3; //simples
        int idadee = (int) 3; // typecast
        Integer idadeee = new Integer(3); // Wrapper Class (Classe Involocra)
        
        // Real
        float salario = 1825.54f; // simples
        float salarioo = (float) 1825.54; // typecast
        Float salariooo = new Float(1825.54); // Wrapper Class (Classe Involocra)
        
        // Caracter
        char letra = 'G'; // simples 
        char letraa = (char)'G'; // typecast 
        Character letraaa = new Character('G'); // Wrapper Class (Classe Involocra)
        
        // Lógico
        boolean casado = false; // simples
        boolean casadoo = (boolean) false; // typecast
        Boolean casadooo = new Boolean(false); // Wrapper Class (Classe Involocra)
        
        
    }
    
    private void saidaDados(){
        float nota = 8.5f;
        
        System.out.print("Sua nota é " + nota + "    ");
        //Escreve a mensagem, mas não quebra a linha
        
        System.out.println("Sua nota é " + nota);
        //Escreve a mensagem e faz a QUEBRA DE LINHA
        
        System.out.printf("Sua nota é %.2f", nota);
        //Escreve a mensagem, no entanto formata a variavél
        //% -> vai ter uma variável
        //.2 -> duas casas depois da virgula
        //f -> tipo da variável que vai ser formatada, nesse caso Float
        
        System.out.format("Sua nota é %.2f" , nota);
        //Escreve a mesma coisa que o anterior, a unica coisa que muda é
        //que ao invez de .PRINTF é .FORMAT  
    }
    
    public void entradaDados(){
        
        String aluno;
        float nota;
        
        // Objeto para leitura de tela (Console)
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o aluno: ");
        aluno = teclado.nextLine(); // Pega os dados e joga na variável
        
        System.out.println("Informe a nota: ");
        nota = teclado.nextFloat(); // Pega os dados e joga na variável
        
        System.out.println("O aluno " + aluno + " tirou a nota " + nota);
    }
}
