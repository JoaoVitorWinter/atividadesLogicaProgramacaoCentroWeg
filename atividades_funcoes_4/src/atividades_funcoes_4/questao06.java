package atividades_funcoes_4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String dataRecebida;
		
		System.out.println("Digite uma data no padrão dd/MM/yyyy");
		dataRecebida = sc.next();
		SimpleDateFormat formatoNormal = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		data = formatoNormal.parse(dataRecebida);
		
		System.out.println(formatarData(data));
		
		sc.close();
	}
	
	static String formatarData(Date data) {
		String novaData;
		
		DateFormat formatacaoNova = DateFormat.getDateInstance(DateFormat.LONG);
		novaData = formatacaoNova.format(data);
		
		return novaData;
	}

}
