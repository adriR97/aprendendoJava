public class While {
    public static void main(String[] args) {

        /* ---------------- WHILE ---------------- */
        /*       
            while (condição) {
                O bloco é executado enquanto a condição for verdadeira
            }
        */

        int condicao = 1;
        while (condicao <= 10) {
            System.out.println("Bloco executado " + condicao + ((condicao < 2) ? " vez" : " vezes"));
            condicao++;
        }

        System.out.println("\nFim da execução do while");

    }
}