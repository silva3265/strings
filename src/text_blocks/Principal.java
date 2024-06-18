package text_blocks;

public class Principal {

	public static void main(String[] args) {
		String nome = "João da Silva";

		String html1 = """
				<a href="mailto:joao@gmail.com">
				   %s - joao@gmail.com
				</a>
				<a>
				   abc@algaworks.com
				</a>
				<a>
				    xyz@algaworks.com
				</a>
				<strong>maria@algaworks.com</strong>""".formatted(nome); /* formatted(nome) - vai formatar a String, vai deixar dinamico  */

		System.out.println(html1);
	}

}
