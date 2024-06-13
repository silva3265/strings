package classe_string;

public class FormatacaoNome {

	public static void main(String[] args) {
		String nome = "   Pedro da Silva da Costa de Oliveira   ";

		System.out.println(formatarNome(nome, "da", "de", "do"));
	}

	public static String formatarNome(String nome, String... preposicoesParaExclusao) {
		String nomeFormatado = nome.toUpperCase().strip(); /* estamos passando pra maiusculo, e ja vai tirar os espaços */

		for (String preposicao : preposicoesParaExclusao) {
			nomeFormatado = nomeFormatado.replace(" " + preposicao.toUpperCase() + " ", " ");
		}

		return nomeFormatado;
	}

}
