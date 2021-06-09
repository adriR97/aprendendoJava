public class Operadores {
    public static void main(String[] args) {

        /* ---------------- OPERADORES ARITMÉTICOS ---------------- */

        System.out.println("-------- Operadores Aritméticos --------");

        int operadorAritmetico1 = 4;
        int operadorAritmetico2 = 16;

        // Soma
        System.out.println(operadorAritmetico1 + operadorAritmetico2);

        // Subtração
        System.out.println(operadorAritmetico2 - operadorAritmetico1);

        // Multiplicação
        System.out.println(operadorAritmetico1 * operadorAritmetico2);

        // Divisão
        System.out.println(operadorAritmetico2 / operadorAritmetico1);

        // Módulo (resto da divisão)
        System.out.println(operadorAritmetico2 % operadorAritmetico1);

        // Incremento
        System.out.println(++operadorAritmetico1);

        // Decremento
        System.out.println(--operadorAritmetico2);

        /* ---------------- OPERADORES DE ATRIBUIÇÃO ---------------- */

        System.out.println("\n-------- Operadores de Atribuição --------");

        // Atribuir valor à variável
        int variavel = 20;
        System.out.println("Valor atribuído à variável: " + variavel);

        // variavel = variavel + 2
        System.out.println(variavel += 2);

        // variavel = variavel - 2
        System.out.println(variavel -= 2);

        // variavel = variavel * 2
        System.out.println(variavel *= 2);

        // variavel = variavel / 2
        System.out.println(variavel /= 2);

        // variavel = variavel % 2
        System.out.println(variavel %= 2);

        /* ---------------- OPERADORES DE COMPARAÇÃO ---------------- */

        System.out.println("\n-------- Operadores de Comparação --------");

        int variavelDeComparacao1 = 10;
        int variavelDeComparacao2 = 26;

        // variavelDeComparacao1 é igual a variavelDeComparacao2
        System.out.println(variavelDeComparacao1 == variavelDeComparacao2);

        // variavelDeComparacao1 é diferente de variavelDeComparacao2
        System.out.println(variavelDeComparacao1 != variavelDeComparacao2);

        // variavelDeComparacao1 é maior que variavelDeComparacao2
        System.out.println(variavelDeComparacao1 > variavelDeComparacao2);

        // variavelDeComparacao1 é menor que variavelDeComparacao2
        System.out.println(variavelDeComparacao1 < variavelDeComparacao2);

        // variavelDeComparacao1 é maior ou igual à variavelDeComparacao2
        System.out.println(variavelDeComparacao1 >= variavelDeComparacao2);

        // variavelDeComparacao1 é menor ou igual à variavelDeComparacao2
        System.out.println(variavelDeComparacao1 <= variavelDeComparacao2);

        /* ---------------- OPERADORES LÓGICOS ---------------- */

        System.out.println("\n-------- Operadores Lógicos --------");

        int variavelLogica1 = 3;
        int variavelLogica2 = 15;

        // As duas afirmações devem ser verdadeiras
        System.out.println(variavelLogica1 < variavelLogica2 && variavelLogica1 > 0);

        // Apenas uma das afirmações deve ser verdadeira
        System.out.println(variavelLogica1 < variavelLogica2 || variavelLogica1 == 0);

        // Reverte o resultado, retorna falso se o resultado for verdadeiro
        System.out.println(!(variavelLogica1 > variavelLogica2));

    }
}