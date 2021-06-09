public class BreakContinue {
    public static void main(String[] args) {

        /* ---------------- BREAK ---------------- */
        /*     
            É utilizado para sair de um loop ou switch.
        */

        int condicao = 1;

        while (condicao <= 10) {
            if (condicao == 5) {
                break;
            }

            System.out.println("Bloco executado " + condicao + ((condicao < 2) ? " vez" : " vezes"));
            condicao++;            
        }

        System.out.println("\nBloco while com break terminou!\n");

        /* ---------------- CONTINUE ---------------- */
        /*     
            É utilizado para interromper a iteração e ir para o loop.
        */

        for (int i=1; i<=10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println("Bloco executado " + i + ((i < 2) ? " vez" : " vezes"));
        }

        System.out.println("\nBloco for com continue terminou!");

    }
}