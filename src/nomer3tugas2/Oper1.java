/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer3tugas2;

/**
 *
 * @author Night's Watch
 */
public class Oper1 {
    public static void main(String[] args) {
        int n = 10;
        int x = 1;
        int y = 2;
        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println ("n & 8 = "+ (n & 8));
        System.out.println ("x & ~ 8 = "+ (x & ~8));

        System.out.println ("y << 2 = "+ (y << 2));

        System.out.println ("y >> 3 = "+ (y >>3));
    }
}
