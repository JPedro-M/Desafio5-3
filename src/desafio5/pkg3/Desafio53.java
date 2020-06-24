package desafio5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class Desafio53 {
    public static void main(String[] args) {
        int numero;
        double debito, credito, valor, total;
        
        numero = 1;
        debito = 0;
        credito = 0;
        total = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para débitar, 2 para créditar e 0 para terminar o programa."));
            if (numero == 1) {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
                debito += valor;
                total += valor;
            }else if (numero == 2) {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
                credito += valor;
                total -= valor;
            }
            else if (numero != 0) {
                JOptionPane.showMessageDialog(null, "Esse é um código invalido.");
            }    
        }
        JOptionPane.showMessageDialog(null, "Débitos: R$"+debito+"\nCréditos: R$"+credito+"\nSaldo final: R$"+total);
    }
}
