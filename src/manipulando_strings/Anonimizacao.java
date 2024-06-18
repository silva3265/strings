package manipulando_strings;

public class Anonimizacao {

    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">\n   joao@gmail.com  </a>\n" +
                "<a>\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
                "<strong>maria@algaworks.com</strong>";

        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";

        //String novoHtml = html.replaFirstl(regex, "email@anonimizado"); // Vai substituir o primeiro
        String novoHtml = html.replaceAll(regex, "email@anonimizado"); // Vai substituir tudo

        System.out.println(novoHtml);
    }

}
