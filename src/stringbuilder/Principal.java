package stringbuilder;

public class Principal {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis(); /* currentTimeMillis - pega a quantidade de milisegundos, onde a instrução foi rodada */

//        String texto = "";
        StringBuilder sb = new StringBuilder(210_000); /* StringBuilder - serve para ter mais performace, vai percorrer mais rapido  */

        for (int i = 0; i < 200_000; i++) {
//            texto = texto + "#";
            sb.append("#"); // append - vai adicionar
        }

//        System.out.println(texto);
        System.out.println(sb.toString());

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }

}