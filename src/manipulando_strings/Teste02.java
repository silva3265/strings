package manipulando_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste02 {
	
public static void main(String[] args) {
		
		String novo = "<cProd>000000000000070542</cProd>\r\n" + 
				"					<cEAN>7908134200484</cEAN>\r\n" + 
				"					<xProd>KLIMAVIT GEL BG C/10G + 3 APLIC AG APLIC OR Lote:0000526550 Fab:31/01/2022 Val:31/01/2024</xProd>\r\n" + 
				"					<NCM>30067000</NCM>\r\n" + 
				"					<CEST>2000500</CEST>\r\n" + 
				"					<cBenef/>\r\n" + 
				"					<CFOP>6102</CFOP>\r\n" + 
				"					<uCom>PEC</uCom>\r\n" + 
				"					<qCom>16858.0000</qCom>\r\n" + 
				"					<vUnCom>17.1200000000</vUnCom>\r\n" + 
				"					<vProd>288608.96</vProd>\r\n" + 
				"					<cEANTrib>7908134200477</cEANTrib>\r\n" + 
				"					<uTrib>PEC</uTrib>\r\n" + 
				"					<qTrib>16858.0000</qTrib>\r\n" + 
				"					<vUnTrib>17.1200000000</vUnTrib>\r\n" + 
				"					<indTot>1</indTot>\r\n" + 
				"					<xPed>531/2022</xPed>\r\n" + 
				"					<nItemPed>0</nItemPed>\r\n" + 
				"					<rastro>\r\n" + 
				"						<nLote>0000526550</nLote>\r\n" + 
				"						<qLote>16858.000</qLote>\r\n" + 
				"						<dFab>2022-01-31</dFab>\r\n" + 
				"						<dVal>2024-01-31</dVal>\r\n" + 
				"					</rastro>\r\n" + 
				"					<med>\r\n" + 
				"						<cProdANVISA>ISENTO</cProdANVISA>\r\n" + 
				"						<xMotivoIsencao>Notificacao Simplificada</xMotivoIsencao>\r\n" + 
				"						<vPMC>0.00</vPMC>\r\n" + 
				"					</med>\r\n" + 
				"				</prod>\r\n" + 
				"				<imposto>\r\n" + 
				"					<ICMS>\r\n" + 
				"						<ICMS00>\r\n" + 
				"							<orig>0</orig>\r\n" + 
				"							<CST>00</CST>\r\n" + 
				"							<modBC>3</modBC>\r\n" + 
				"							<vBC>288608.96</vBC>\r\n" + 
				"							<pICMS>7.0000</pICMS>\r\n" + 
				"							<vICMS>20202.63</vICMS>\r\n" + 
				"						</ICMS00>\r\n" + 
				"					</ICMS>\r\n" + 
				"					<IPI>\r\n" + 
				"						<qSelo>000000000000</qSelo>\r\n" + 
				"						<cEnq>999</cEnq>\r\n" + 
				"						<IPINT>\r\n" + 
				"							<CST>51</CST>\r\n" + 
				"						</IPINT>\r\n" + 
				"					</IPI>\r\n" + 
				"					<PIS>\r\n" + 
				"						<PISAliq>\r\n" + 
				"							<CST>01</CST>\r\n" + 
				"							<vBC>268406.33</vBC>\r\n" + 
				"							<pPIS>1.6500</pPIS>\r\n" + 
				"							<vPIS>4428.70</vPIS>\r\n" + 
				"						</PISAliq>\r\n" + 
				"					</PIS>\r\n" + 
				"					<COFINS>\r\n" + 
				"						<COFINSAliq>\r\n" + 
				"							<CST>01</CST>\r\n" + 
				"							<vBC>268406.33</vBC>\r\n" + 
				"							<pCOFINS>7.6000</pCOFINS>\r\n" + 
				"							<vCOFINS>20398.88</vCOFINS>\r\n" + 
				"						</COFINSAliq>\r\n" + 
				"					</COFINS>\r\n" + 
				"				</imposto>\r\n" + 
				"			</det>\r\n" + 
				"			<det nItem=\"1\">\r\n" + 
				"				<prod>\r\n" + 
				"					<cProd>38384348</cProd>\r\n" + 
				"					<cEAN>7908134200484</cEAN>\r\n" + 
				"					<xProd>KLIMAVIT GEL BG C/10G + 3 APLIC AG APLIC OR Lote:0000526550 Fab:31/01/2022 Val:31/01/2024</xProd>\r\n" + 
				"					<NCM>30067000</NCM>\r\n" + 
				"					<CEST>2000500</CEST>\r\n" + 
				"					<cBenef/>\r\n" + 
				"					<CFOP>6102</CFOP>\r\n" + 
				"					<uCom>PEC</uCom>\r\n" + 
				"					<qCom>16858.0000</qCom>\r\n" + 
				"					<vUnCom>17.1200000000</vUnCom>\r\n" + 
				"					<vProd>288608.96</vProd>\r\n" + 
				"					<cEANTrib>7908134200477</cEANTrib>\r\n" + 
				"					<uTrib>PEC</uTrib>\r\n" + 
				"					<qTrib>16858.0000</qTrib>\r\n" + 
				"					<vUnTrib>17.1200000000</vUnTrib>\r\n" + 
				"					<indTot>1</indTot>\r\n" + 
				"					<xPed>531/2022</xPed>\r\n" + 
				"					<nItemPed>0</nItemPed>\r\n" + 
				"					<rastro>";
	    		
	    String regex = "<cProd>([a-zA-Z]|[0-9]|[-])*</cProd>";
	    
	    Pattern pattern = Pattern.compile(regex); /* Representa��o compilada do regex */
	    Matcher matcher = pattern.matcher(novo);
	    
	    String novo01 = null;
	    String novo02 = "ABC";
	    
	    while (matcher.find()) { /* Localizar o proximo */ 
//	    	novo01 = novo.replaceAll(regex, novo02);
//			System.out.println(matcher.group(1).replaceAll(regex, novo));
//			System.out.println("Esse foi o valor substituido:" + novo01.toString());
//			
//			/* extra��o e um unico grupo */
//				 //novo01 = novo.replaceAll(regex, "ABC");
//			
	    	
	    	System.out.println(matcher.group());
		}
	    
	    
	    
	  
}

}
