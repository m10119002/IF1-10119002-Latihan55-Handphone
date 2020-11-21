/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan55;

import m10119002.pbo.latihan55.target.Android;
import m10119002.pbo.latihan55.target.BlackBerry;
import m10119002.pbo.latihan55.target.WindowsPhone;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program handphone
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        
        BlackBerry blackberry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");
        
        WindowsPhone windowsphone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsphone.setWpKeyStore("UUUQIJWORJ");
        
        android.displayProduct();
        System.out.println("Android Key Store : ".
                concat(android.getKeyStore()));
        
        System.out.println("");
        blackberry.displayProduct();
        System.out.println("PIN : ".
                concat(blackberry.getPinBB()));
        
        System.out.println("");
        windowsphone.displayProduct();
        System.out.println("Wp Key Store : ".
                concat(windowsphone.getWpKeyStore()));
    }
}
