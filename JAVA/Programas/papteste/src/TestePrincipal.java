/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 253535
 */
public class TestePrincipal {

    public static void main(String[] args) {
        Contas c = new Contas();
        double[] w1 = {50,25};
        double[] w2 = {0, 50};
        double res1 = 500;
        double res2 = 30;
        double[] rx1 = c.conta(w1, res1);
        double[] rx2 = c.conta(w2, res2);
        c.printArray(w1);
        c.printArray(w2);
        c.printArray(rx1);
        c.printArray(rx2);
    }
}
