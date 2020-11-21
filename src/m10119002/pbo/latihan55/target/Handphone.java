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
 * Deskripsi Program : Class untuk objek Handphone
 * Pertemuan 5
 * 
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct() {
        System.out.println("Manufaktur : ".concat(this.manufacture));
        System.out.println("OS : ".concat(this.operatingSystem));
        System.out.println("Model : ".concat(this.model));
        System.out.println("Harga : ".concat(Integer.toString(this.harga)));
    }
}
