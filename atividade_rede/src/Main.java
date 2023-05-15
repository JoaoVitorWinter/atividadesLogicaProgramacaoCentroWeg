import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String ip, mascara;
		int[] ipRede = {0, 0, 0, 0};
		int[] ipBroadcast = {0, 0, 0, 0};
		
		ip = JOptionPane.showInputDialog("Digite o IP separado por pontos!");
		mascara = JOptionPane.showInputDialog("Digite também a máscara do IP separada por pontos!");
		
		String[] ipSeparado = ip.split("\\.");
		String[] mascaraSeparada = mascara.split("\\.");
		
		for (int indice = 0; indice < 4; indice++) {
		    if (mascaraSeparada[indice] == "255") {
		        ipRede[indice] = Integer.parseInt(mascaraSeparada[indice]);
		        ipBroadcast[indice] = Integer.parseInt(ipSeparado[indice]);
		    } else if (mascaraSeparada[indice] == "0") {
		        ipRede[indice] = 0;
		        ipBroadcast[indice] = 255;
		    } else {
		        String octetoBinarioIp = "";
		        String octetoBinarioMascara = "";

		        for (int contador = 7; contador >= 0; contador--) {
		            if (Math.pow(2, contador) <= Double.parseDouble(ipSeparado[indice])) {
		                octetoBinarioIp += "1";
		                ipSeparado[indice] = "" + (Double.parseDouble(ipSeparado[indice]) - Math.pow(2, contador));
		            } else {
		                octetoBinarioIp += "0";
		            }
		        }

		        for (int contador = 7; contador >= 0; contador--) {
		            if (Math.pow(2, contador) <= Double.parseDouble(mascaraSeparada[indice])) {
		                octetoBinarioMascara += "1";
		                mascaraSeparada[indice] = "" + (Double.parseDouble(mascaraSeparada[indice]) - Math.pow(2, contador));
		            } else {
		                octetoBinarioMascara += "0";
		            }
		        }

		        for (int contador = 0; contador < 8; contador++) {
		            if (octetoBinarioIp.charAt(contador) == octetoBinarioMascara.charAt(contador) && octetoBinarioMascara.charAt(contador) == '1') {
		                ipRede[indice] += Math.pow(2, 7 - contador);
		                ipBroadcast[indice] += Math.pow(2, 7 - contador);
		            }

		            if (octetoBinarioMascara.charAt(contador) == '0') {
		                ipBroadcast[indice] += Math.pow(2, 7 - contador);
		            }
		        }
		    }
		}
		
		JOptionPane.showMessageDialog(null, "IP de rede: " + ipRede[0] + "." + ipRede[1] + "." + ipRede[2] + "." + ipRede[3]);
		
		JOptionPane.showMessageDialog(null, "IP de broadcast: " + ipBroadcast[0] + "." + ipBroadcast[1] + "." + ipBroadcast[2] + "." + ipBroadcast[3]);

	}

}
