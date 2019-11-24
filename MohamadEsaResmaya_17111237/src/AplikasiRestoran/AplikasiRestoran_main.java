/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiRestoran;

import java.util.Scanner;

/**
 *
 * @author Mohamad Esa Resmaya - 17111237
 * 
 */
public class AplikasiRestoran_main {
    Scanner input = new Scanner(System.in);
    int i= 0,
        pilihan,
        jumlah_pesan;
    String namaPemesan,
           no_meja;
    double totalBeli = 0,
           totalBayar = 0,
           diskon,
           pajak;
    //inisialisasi Array
    String ulangMenu ="Y";
        String[] menu_makan = new String[100],
                 menu_minum = new String[100];
        double[] harga_makan = new double[100],
                 harga_minum = new double[100],
                 sub_makan = new double[100],
                 sub_minum = new double[100];
        int[] berapa_makan = new int[100],
              berapa_minum = new int[100];
    
    public void isiData(){
        
        System.out.println("============================================");
        System.out.println("           RESTORAN MURAH BERKAH            ");
        System.out.println("============================================");
            System.out.println("Nomor Meja");
            System.out.print("-> ");
            no_meja = input.nextLine();

            System.out.println("Nama Pelanggan");
            System.out.print("-> ");
            namaPemesan = input.nextLine();


            System.out.println("Jumlah Pelanggan");
            System.out.print("-> ");
            jumlah_pesan = input.nextInt();
    }
    
    public void setMenu(){
        AplikasiRestoran_makan makan = new AplikasiRestoran_makan();
        AplikasiRestoran_minum minum = new AplikasiRestoran_minum();
        AplikasiRestoran_makan makan_menu1 = new AplikasiRestoran_makan();
        AplikasiRestoran_makan makan_menu2 = new AplikasiRestoran_makan();
        AplikasiRestoran_makan makan_menu3 = new AplikasiRestoran_makan();
        AplikasiRestoran_makan makan_menu4 = new AplikasiRestoran_makan();
        AplikasiRestoran_minum minum_menu1 = new AplikasiRestoran_minum();
        AplikasiRestoran_minum minum_menu2 = new AplikasiRestoran_minum();
        AplikasiRestoran_minum minum_menu3 = new AplikasiRestoran_minum();
        AplikasiRestoran_minum minum_menu4 = new AplikasiRestoran_minum();
        
        //mengeset menu
        makan_menu1.setNama_makan("Ayam Goreng + Nasi + Lauk Pauk");
        makan_menu1.setHarga_makan(20000);
        makan_menu2.setNama_makan("Ikan Bakar + Nasi Liwet + Sambal");
        makan_menu2.setHarga_makan(25000);
        makan_menu3.setNama_makan("Soto + Nasi");
        makan_menu3.setHarga_makan(15000);
        makan_menu4.setNama_makan("Kikil + Nasi + Kuah");
        makan_menu4.setHarga_makan(16500);
        
        minum_menu1.setNama_minum("Es Teh Manis");
        minum_menu1.setHarga_minum(12000);
        minum_menu2.setNama_minum("Jus Buah");
        minum_menu2.setHarga_minum(20000);
        minum_menu3.setNama_minum("Soto + Nasi");
        minum_menu3.setHarga_minum(15000);
        minum_menu4.setNama_minum("Kikil + Nasi + Kuah");
        minum_menu4.setHarga_minum(16500);
                
        do{
            System.out.println("Silahkan Pilih Menu Makanan :");
            System.out.println("1. Ayam Goreng + Nasi + Lauk Pauk    : Rp 20000");
            System.out.println("2. Ikan Bakar + Nasi Liwet + Sambal  : Rp 25000");
            System.out.println("3. Soto + Nasi                       : Rp 15000");
            System.out.println("4. Kikil + Nasi + Kuah               : Rp 16500");
            System.out.println("-> ");
            int pilih_menuMakan = input.nextInt();
                switch (pilih_menuMakan) {
                    case 1:
                        menu_makan[i] = makan_menu1.getNama_makan();
                        harga_makan[i] = makan_menu1.getHarga_makan();
                        break;
                    case 2:
                        menu_makan[i] = makan_menu2.getNama_makan();
                        harga_makan[i] = makan_menu2.getHarga_makan();
                        break;
                    case 3:
                        menu_makan[i] = makan_menu3.getNama_makan();
                        harga_makan[i] = makan_menu3.getHarga_makan();
                        break;
                    case 4:
                        menu_makan[i] = makan_menu4.getNama_makan();
                        harga_makan[i] = makan_menu4.getHarga_makan();
                        break;
                    default:
                        System.err.println("Menu Belum Tersedia");
                        menu_makan[i] = "Tidak Pesan Ya?";
                        harga_makan[i] = 0;
                        break;
                }
                
                System.out.println("Mau Pesan Berapa?");
                System.out.print("-> ");
                berapa_makan[i] = input.nextInt();
                sub_makan[i] = berapa_makan[i]*harga_makan[i];
                
                System.out.println("Menu Makanan   : " + menu_makan[i]);
                System.out.println("Harga/menu     : " + harga_makan[i]);
                System.out.println("Jumlah Pesan   : " + berapa_makan[i]);
                System.out.println("Harga Makanan  : " + sub_makan[i]);
                System.out.println("\n");

            System.out.println("Silahkan Pilih Menu Minuman :");
            System.out.println("1. Es Teh Manis      : Rp 12000");
            System.out.println("2. Jus Buah          : Rp 20000");
            System.out.println("3. Es Kelapa Muda    : Rp 12500");
            System.out.println("4. Es Teh Lemon      : Rp 25000");
            System.out.println("-> ");
            int pilih_menuMinum = input.nextInt();
            switch (pilih_menuMinum) {
                case 1:
                    menu_minum[i] = minum_menu1.getNama_minum();
                    harga_minum[i] = minum_menu1.getHarga_minum();
                    break;
                case 2:
                    menu_minum[i] = minum_menu2.getNama_minum();
                    harga_minum[i] = minum_menu2.getHarga_minum();
                    break;
                case 3:
                    menu_minum[i] = minum_menu3.getNama_minum();
                    harga_minum[i] = minum_menu3.getHarga_minum();
                    break;
                case 4:
                    menu_minum[i] = minum_menu4.getNama_minum();
                    harga_minum[i] = minum_menu4.getHarga_minum();
                    break;
                default:
                    System.err.println("Menu Belum Tersedia");
                    menu_minum[i] = "Tidak Pesan Ya?";
                    harga_minum[i] = 0;      
                    break;
            }    
                System.out.println("Mau Pesan Berapa?");
                System.out.print("-> ");
                berapa_minum[i] = input.nextInt();
                sub_minum[i] = berapa_minum[i]*harga_minum[i];
                
                
                System.out.println("Minuman yang dipesan : " + menu_minum[i]);
                System.out.println("Harga per menu       : " + harga_minum[i]);
                System.out.println("Jumlah Pesan         : " + berapa_minum[i]);
                System.out.println("Harga Minuman        : " + sub_minum[i]);
            
                System.out.println("Ingin Pesan Lagi?(Y/N)");
                ulangMenu = input.next();
                i++;
        } while(ulangMenu.equals("Y")||ulangMenu.equals("y"));
        eksekusiAkhir();
    }
    
    
    public void eksekusiAkhir(){
        System.out.println("-------------------- STRUK HARGA --------------------");
        System.out.println("No Meja         : "+no_meja+
                         "\nNama Pemesan    : "+namaPemesan+
                         "\nJumlah Pemesan  : "+jumlah_pesan+
                         "\nBanyak Pesanan  : "+i+" porsi"+
                         "\nDetail          : "+
                         "\n------------------------------------------------------"+
                         "\nMakanan : ");
        for (int j=0; j<i ; j++){
            System.out.println(menu_makan[j] + " x " + berapa_makan[j] + " = Rp "+ sub_makan[j]);   
        }
        System.out.println("Minuman : ");
        for (int h=0; h<i ; h++){
             System.out.println(menu_minum[h] + " x " + berapa_minum[h] + " = Rp "+ sub_minum[h]);
        }
                         
    }
    
    public void start(){
        isiData();
        setMenu();
        eksekusiAkhir();
    }
    
    public static void main(String[] args) {
        AplikasiRestoran_main tampil = new AplikasiRestoran_main();
        tampil.start();
    }
}

