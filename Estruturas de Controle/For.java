public class For {
    public static void main(String[] args) {

        /* ---------------- FOR ---------------- */
        /*       
            for (instrução 1; instrução 2; instrução 3) {
                A instrução 1 é executada e o bloco é percorrido várias vezes
                até que a instrução 2 seja verdadeira.
                A instrução 3 é executada todas as vezes que o bloco chegar no fim
            }
        */

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bloco executado " + i + ((i < 2) ? " vez" : " vezes"));
        }

        System.out.println("\nFim da execução do for");

    }
}