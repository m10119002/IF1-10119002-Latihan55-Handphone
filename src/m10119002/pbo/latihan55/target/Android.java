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
 * Deskripsi Program : Class untuk objek Android
 * Pertemuan 5
 * 
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getKeyStore() {return this.keyStore;}
    public void setKeyStore(String keyStore) {this.keyStore = keyStore;}
}
