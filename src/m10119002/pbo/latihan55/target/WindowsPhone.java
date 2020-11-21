/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan55.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Windows Phone
 * Pertemuan 5
 * 
 */
public class WindowsPhone extends Handphone {
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getWpKeyStore() {return this.wpKeyStore;}
    public void setWpKeyStore(String wpKeyStore) {this.wpKeyStore = wpKeyStore;}
}
