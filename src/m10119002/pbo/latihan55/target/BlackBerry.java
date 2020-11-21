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
 * Deskripsi Program : Class untuk objek BlackBerry
 * Pertemuan 5
 * 
 */
public class BlackBerry extends Handphone {
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getPinBB() {return this.pinBB;}
    public void setPinBB(String pinBB) {this.pinBB = pinBB;}
}
