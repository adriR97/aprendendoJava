public class OperadorTernario {
    public static void main(String[] args) {

        /* ---------------- OPERADOR TERNARIO ---------------- */
        /*       
            É semelhante ao if/else, só que de maneira abreviada     
            variavel = (condição) ? verdadeiro : falso;
        */

        int numero1 = 22;
        int numero2 = 56;
        String resposta = (numero1 > numero2) ? "O primeiro número é maior" : "O segundo número é maior";  

        System.out.println(resposta);

    }
}