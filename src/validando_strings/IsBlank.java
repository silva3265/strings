package validando_strings;

public class IsBlank {

    public static void main(String[] args) {
        String nome1 = "    ";

        System.out.println(nome1.isEmpty()); /* isEmpty() - Esta Vazio? */
        System.out.println(nome1.isBlank()); /* isBlank() - Ele verifica se o que esta la dentro sao só espaços ? */
    }

}
