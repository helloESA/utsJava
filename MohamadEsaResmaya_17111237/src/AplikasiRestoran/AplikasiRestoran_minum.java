/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiRestoran;

/**
 *
 * @author MohamadEsa
 */
public class AplikasiRestoran_minum extends AplikasiRestoran_makan{
    protected String nama_minum; 
    protected double harga_minum;
    protected int jumlah_minum;

    public String getNama_minum() {
        return nama_minum;
    }

    public void setNama_minum(String nama_minum) {
        this.nama_minum = nama_minum;
    }

    public double getHarga_minum() {
        return harga_minum;
    }

    public void setHarga_minum(double harga_minum) {
        this.harga_minum = harga_minum;
    }

    public int getJumlah_minum() {
        return jumlah_minum;
    }

    public void setJumlah_minum(int jumlah_minum) {
        this.jumlah_minum = jumlah_minum;
    }

    
    public double subTotalMinum(){
        double subtotalMinum = harga_minum*jumlah_minum;
        return subtotalMinum;
    }
    
}
