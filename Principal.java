package senai.org.br;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
//ele ir� parar de compilar s� quando responder 
//a ultima pergunta corretamente
		
	boolean repetir = true;	
	do {
		try {
		pessoa p1 = new pessoa();
		p1.setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
		
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		p1.setDataNascimento(LocalDate.parse(
		JOptionPane.showInputDialog("Digite sua data de nascimento no formato DD/MM/AAAA: "), formatoData));  
		
		p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: ").replace(",", ".")));
															//replace para substitu��o para o java aceitar
	
		JOptionPane.showMessageDialog(null, p1.dados());
		repetir = false;
// agora caso digitem info erradas:
	} catch (NumberFormatException nfe) {
		JOptionPane.showMessageDialog(null, "Valor numerico inv�lido!");
	}catch (DateTimeParseException dtpe) {
		JOptionPane.showMessageDialog(null, "Data de nascimento inv�lido!");
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Algo deu errado");
	}
	}	while (repetir);
	}}
	
