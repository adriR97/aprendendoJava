public class Strings {
    public static void main(String[] args) {
        
        String frase = "Frase de exemplo";

        /* Comprimento */
        System.out.println(frase.length());

        /* Letras em maiúsculo */
        System.out.println(frase.toUpperCase());

        /* Letras em minúsculo */
        System.out.println(frase.toLowerCase());

        /* Encontrar o índice de uma palavra */
        System.out.println(frase.indexOf("de"));

        /* Concatenação de duas strings */
        String continuacaoFrase = " com concatenação";
        System.out.println(frase + continuacaoFrase);
        System.out.println(frase.concat(continuacaoFrase));

        /* Escape de caracteres especiais */
        System.out.println("Aspas simples:\', aspas duplas:\", barra invertida:\\");
    }
}