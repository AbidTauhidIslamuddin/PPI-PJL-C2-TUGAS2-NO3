/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer3tugas2;
import java.util.Scanner;
/**
 *
 * @author Night's Watch
 */

public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
