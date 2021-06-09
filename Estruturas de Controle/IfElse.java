public class IfElse {
    public static void main(String[] args) {

        /* ---------------- IF ---------------- */
        /*
            if (condição) {
                o bloco é executado se a condição for verdadeira
            }
        */

        if (5 > 3) {
            System.out.println("5 é maior que 3");
        }

        /* ---------------- ELSE ---------------- */
        /*
            if (condição) {
                o bloco é executado se a condição for verdadeira
            } else {
                o bloco é executado se a condição do if for falsa
            }
        */

        if (15 > 30) {
            System.out.println("15 é maior que 30");
        } else {
            System.out.println("Condição errada, 15 é menor que 30");
        }

        /* ---------------- ELSE IF ---------------- */
        /*
            if (condição) {
                o bloco é executado se a condição for verdadeira
            } else if (condição) {
                o bloco é executado se a condição do if for falsa e a condição do else if for verdadeira
            } else {
                o bloco é executado se as duas condições forem falsas
            }
        */

        if (25 > 30) {
            System.out.println("15 é maior que 30");
        } else if (30 > 10) {
            System.out.println("30 é maior que 10");
        } else {
            System.out.println("Nenhuma das condições são verdadeiras");
        }

    }
}