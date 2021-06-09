public class DoWhile {
    public static void main(String[] args) {

        /* ---------------- Do WHILE ---------------- */
        /*     
            do {
                O código será executado uma vez sem verificar a condição, em seguida
                repetirá o loop enquanto a condição for verdadeira
            } while (condição);
        */

        int condicao = 1;
        do {
            System.out.println("Bloco executado " + condicao + ((condicao < 2) ? " vez" : " vezes"));
            condicao++;
        } while (condicao <= 10);

        System.out.println("\nFim da execução");

    }
}