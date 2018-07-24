/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 253535
 */
public class Contas {

    public double[] conta(double[] x, double res) {
        double[] rx = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            rx[i] = res / x[i];

        }
        return rx;

    }

    public void printArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " \t");

        }
        System.out.println();
    }
}
