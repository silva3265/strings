package validando_strings;

public class EqualsIgnoreCase {

    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = new String("JOÃO");

        System.out.println(nome1.equals(nome2)); // false, os conteudos são diferentes 
        System.out.println(nome1.equalsIgnoreCase(nome2)); // true, vai ignorar a caixa alta
    }

}
