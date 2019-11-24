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
public class AplikasiRestoran_makan {

    protected String nama_makan; 
    protected double harga_makan,
                     sub_makan;
    protected int jumlah_makan;

    public String getNama_makan() {
        return nama_makan;
    }

    public void setNama_makan(String nama_makan) {
        this.nama_makan = nama_makan;
    }

    public double getHarga_makan() {
        return harga_makan;
    }

    public void setHarga_makan(double harga_makan) {
        this.harga_makan = harga_makan;
    }

    public int getJumlah_makan() {
        return jumlah_makan;
    }

    public void setJumlah_makan(int jumlah_makan) {
        this.jumlah_makan = jumlah_makan;
    }
    
    public double getSub_makan() {
        return sub_makan;
    }

    public void setSub_makan(double sub_makan) {
        this.sub_makan = sub_makan;
    }
}
