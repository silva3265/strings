package transformando_strings;

public class Strip {

    public static void main(String[] args) {
        String nome = "\n    Pedro     "; /* \n - quebra de linha */

        System.out.println(">" + nome + "<");
//        System.out.println(nome.stripLeading()); /* vai remover os espaços a esquerda, porem nao remove da direita */
//        System.out.println(nome.stripTrailing()); /* vai remover os espaços a direita, porem nao remove da esquerda */
        System.out.println(nome.strip()); /* esse metodo Strip vai remover todo o conteudo dos lados */
//        System.out.println(nome.trim()); /* ele faz a mesma coisa que o strip, só que o trim é mais antigo */
    }

}
