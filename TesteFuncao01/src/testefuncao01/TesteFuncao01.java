/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author User
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){  //função "int"; procedimento "void"
        int s = a + b;
        //System.out.println("A soma é " + s);   Void
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int sm = soma (5,2); //na função precisa atribuir uma variável, no procedimento não
        System.out.println("A soma vale " + sm); // a apresentação ficou por conta da função no main
    }
    
}
