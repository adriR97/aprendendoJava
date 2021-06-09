import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Switch {
    public static void main(String[] args) {

        /* ---------------- SWITCH ---------------- */
        /*     
            switch(expressão) {
                case x: 
                    se expressão for igual ao valor de x o bloco será executado e 
                    continua a verificação, pois este bloco não contém a
                    palavra chave break.
                case y: 
                    se expressão for igual ao valor de y o bloco será executado e 
                    logo a instrução switch será encerrada, pois contém a palavra
                    chave break.
                    break;
                default:
                    o bloco default será executado se não houver nenhuma correspondência
                    nas cases.
            }

            Info: As palavras chaves break e default são opcionais.
        */

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("u");
        String diaDaSemana = df.format(date);

        switch (diaDaSemana) {
            case "1":
                System.out.println("Segunda-feira");
                break;
            case "2":
                System.out.println("Terça-feira");
                break;
            case "3":
                System.out.println("Quarta-feira");
                break; 
            case "4":
                System.out.println("Quinta-feira");
                break; 
            case "5":
                System.out.println("Sexta-feira");
                break; 
            case "6":
                System.out.println("Sábado");
                break; 
            default:
                System.out.println("Domingo");
        }

    }
}