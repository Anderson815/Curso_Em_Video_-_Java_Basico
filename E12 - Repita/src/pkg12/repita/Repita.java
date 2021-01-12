package pkg12.repita;

import javax.swing.JOptionPane;

public class Repita {

    public static void main(String[] args) {
        // Janela de Informação
        // JOptionPane.showMessageDialog(null, "Olá Mundo","BOAS VINDAS", JOptionPane.INFORMATION_MESSAGE);

        int n, s, qn, qnp, qni, qnac, mn;

        n = s = qn = qnp = qni = qnac = mn = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(O Valor 0 Interrompe)</em></br></html>"));
            
            if(n != 0){
                s += n;
                qn++;

                // verifica se é par ou impar
                if (n % 2 == 0) {
                    qnp++;
                } else {
                    qni++;
                }

                // verifica se o número é maior que 100
                if (n > 100) {
                    qnac++;
                }
            }
        } while (n != 0);

        mn = s / qn;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>" +
                                        "<br>Somatório vale: " + s + "</br>" +
                                        "<br>Total de Valores: " + qn + "</br>" + 
                                        "<br>Total de Valores Pares: " + qnp + "</br>" +
                                        "<br>Total de Valores Impares: " + qni +"</br>" + 
                                        "<br>Total de Valores Acima de 100: " + qnac + "</br>" + 
                                        "<br>Média dos Valores: " + mn + "</br></html>");
  
    }
}
