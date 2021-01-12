package a14.vetores;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class A14Vetores {
    public static void main(String[] args) {
        int op = 0;
        String s = "n";
        
        Scanner leitor = new Scanner(System.in);
        
        do{
            System.out.println("----- AULA DE VETOR -----");
            System.out.println("1 - Declarações");
            System.out.println("2 - Atributo Length (Comprimento)");
            System.out.println("3 - Foreach");
            System.out.println("4 - Arrays");
            System.out.println("5 - Preenchimento automático");
            System.out.println("0 - Para sair");
            System.out.print("\nEscolha uma opção: ");
            
            op = leitor.nextInt();
            
            System.out.print("\n\n");
            switch(op){
                case 0:
                    do{
                        System.out.print("Deseja Sair (S/N): ");
                        s = leitor.next();
                        if(!s.equals("s") && !s.equals("n")){
                            System.out.println("!!! OPÇÃO INVÁLIDA !!!");
                        }
                        System.out.print("\n\n");
                    }while(!s.equals("s") && !s.equals("n"));
                    break;
                case 1:
                    A14Vetores.tela1();
                    break;
                case 2:
                    A14Vetores.tela2();
                    break;
                case 3:
                    A14Vetores.tela3();
                    break;
                case 4:
                    A14Vetores.tela4();
                    break;
                case 5:
                    A14Vetores.tela5();
                    break;
                default:
                    System.out.println("!!! VALOR INVÁLIDO !!!");
            }
            
        }while(!s.equals("s"));
    } 

    private static void tela1(){
        int n[] = new int[4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;
        
        System.out.print("Jeito 1: ");
        for(int indice = 0; indice <= 3; indice++){
            if(indice < n.length - 1){
                System.out.print(n[indice] + " - ");
            }else{
                System.out.println(n[indice]);
            }
        }
        
        int m[] = {4, 6, 9, 3};
        
        System.out.print("Jeito 2: ");
        for(int indice = 0; indice < 4; indice++){
            if(indice < m.length - 1){
                System.out.print(m[indice] + " - ");
            }else{
                System.out.println(m[indice]);
            }
        }
        
        System.out.println("\n\n");
    }
    
    private static void tela2(){
        
        Date data = new Date();
        int t = data.getYear();
        String fev = (data.getYear()%4 == 0) ? "29" : "28";
            
        
        String m[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        String d[] = {"31", fev, "31", "30", "31", "30",
                        "31", "31", "30", "31", "30", "31"};
        
        for(int indice = 0; indice < m.length; indice++){
            System.out.println("O mês " + m[indice] + " tem " + d[indice] + " dias");
        }
        System.out.println("\n\n");
    }
    
    private static void tela3(){
        int num[] = {3, 5, 1, 8, 4};
        
        for(int valor: num){
            System.out.print(valor + " ");
        }
        System.out.println("\n\n");
    }
    
    private static void tela4(){
        int v[] = {3, 7, 6, 1, 9, 4, 2};
        //Arrays.sort(v);
        int p = Arrays.binarySearch(v, 4);
        
        for(int valor: v){
            System.out.print( valor + " ");
        }
        System.out.println("");
        System.out.println("a posição do 9 é " + p);
        System.out.println("\n\n");
    }
    
    private static void tela5(){
        int vetor[] = new int[8];
        Arrays.fill(vetor, 0);
        for(int valor: vetor){
            System.out.print( valor + " ");
        }
        System.out.println("\n\n");
    }
}


