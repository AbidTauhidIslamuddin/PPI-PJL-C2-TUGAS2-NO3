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
public class Ekspresi1 {
    public static void main(String[] args) {
        int x = 1; int y = 2; float fx; float fy;
        System.out.print ("x/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);
        fx=x;
        fy=y;
        System.out.print ("\nx/y (format integer) = "+ fx/fy);
        System.out.print ("\nx/y (format float) = "+ fx/fy);
        System.out.print ("\nfloat(x)/float(y) (format integer) = "+(float)x/(float)y);

        System.out.print ("\nfloat(x)/float(y) (format float) = "+(float)x/(float)y);
        x = 10; y = 3;
        System.out.print ("\nx/y (format integer) = "+ x/y);
        System.out.print ("\nx/y (format float) = "+ x/y);
    }
}
