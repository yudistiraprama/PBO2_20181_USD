/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {

    private String nama;
    private Date tgl_lahir;
    private String alamat;
    private String NomorRekamMedis;

    public Pasien() {

    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public void setTgl_lahir(int tahun, int bulan, int tanggal) {
        this.tgl_lahir = new Date(tahun - 1900, bulan - 1, tanggal);
    }

    public Date getDate(Date date) {
        return null;
    }

    public String getNomorRekamMedis() {
        return NomorRekamMedis;
    }

    public void setNomorRekamMedis(String NomorRekamMedis) {
        this.NomorRekamMedis = NomorRekamMedis;
    }

    public int getUsia() {
        Date today = new Date();
        return today.getYear() - tgl_lahir.getYear();
    }

    public void BuatNomorRekamMedis(){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        System.out.println(ft.format(date)+nama.substring(0,3));
    }
}
