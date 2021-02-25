/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, totn = 0, s = 0, totp = 0, toti = 0, a = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            totn++;
            if (n % 2 == 0) {
                totp++;
            } else {
                toti++;
            }
            if (n > 100) {
                a++;
            }
        } while (n != 0);
        double totm = (double)s / (totn - 1);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + "<br>Somatório Vale " + s + "<br>Total de "
                + "Números Digitados " + (totn - 1) + "<br>Total de Pares " + (totp - 1) + "<br>Total de Ímpares "
                + toti + "<br>Acima de 100 " + a + "<br>Média dos Valores " + String.format("%.2f", totm) + "</html>");
    }

}
