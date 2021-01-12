package e04.classe.envolvida.com.o.s.o;

import java.time.Instant;
import java.util.Date;

public class E04ClasseEnvolvidaComOSO {
    public static void main(String[] args) {
        Date relogio = new Date();
        //Instant agora = new Instant();
        /*
        System.out.println("A hora é \n");
        
        int dia, mes, ano, hora, minuto;
        dia = relogio.getDay();
        mes = relogio.getMonth();
        ano = relogio.getYear();
        hora = relogio.getHours();
        minuto = relogio.getMinutes();
        
        agora = relogio.toInstant();
        
        System.out.println(dia + "/" + mes + "/" + ano + " HORA: " + hora + ":" + minuto);
        */
        
        System.out.println(relogio.getDate() + " / " + (relogio.getMonth() + 1) + " /");
    } 
}
