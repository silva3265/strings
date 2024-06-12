package extraindo_trechos;

public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João Silva Souza";

//        System.out.println(nome.indexOf(" ")); // 4 /* indexOf - posição que contem o espaço, ai ele vai trazer o indice, que no caso é 4 */
//        System.out.println(nome.substring(5)); /* vai extrair um trecho da String, a  partir da posição passada, que no caso é o 5 */
//
//        System.out.println(nome.substring(5, 10)); /* esse sobrecarga vai retornar de posição ate outra */

//        System.out.println(obterSobrenome(nome));
        System.out.println(obterSegundoNome(nome));
    }

    /* metodo para Obter o o sobrenome */
    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }
    
    /* metodo para Obter o segundo nome */
    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }

}
