package manipulando_strings;
public class teste {

	public static void main(String[] args) {
		
		String novo = "<prod>\r\n" + 
	    		"<cProd>000000000000070542</cProd>\r\n" + 
	    		"<cEAN>7908134200484</cEAN>\r\n" + 
	    		"<xProd>KLIMAVIT GEL BG C/10G + 3 APLIC AG APLIC OR Lote:0000526550 Fab:31/01/2022 Val:31/01/2024</xProd>\r\n" + 
	    		"<NCM>30067000</NCM>";

	    String regex = "<cProd>(.*)</cProd>";

	    String novo1 = novo.replaceAll(regex, "ABC");

	    System.out.println(novo1);
	    }

	}


