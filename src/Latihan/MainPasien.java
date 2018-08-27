/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */
public class MainPasien {

    public static void main(String[] args) {

        Pasien pas[] = new Pasien[3];

        pas[0] = new Pasien("Prama");
        pas[0].setAlamat("Bali");
        pas[0].setTgl_lahir(1999, 4, 22);

        pas[1] = new Pasien("Gita");
        pas[1].setAlamat("Bali");
        pas[1].setTgl_lahir(1996, 4, 14);

        pas[2] = new Pasien("Praba");
        pas[2].setAlamat("Bali");
        pas[2].setTgl_lahir(1995, 2, 11);

        System.out.println("---------- ANTRIAN PASIEN ----------");
        System.out.println("");

//        for (int i = 0; i < pas.length; i++) {
//            System.out.println("No Antrian          : " + i + 1);
//            System.out.println("Nama                : " + pas[i].getNama());
//            System.out.println("Alamat              : " + pas[i].getAlamat());
//            System.out.println("Usia                : " + pas[i].getUsia()+" tahun");
//            pas[i].BuatNomorRekamMedis();
//            System.out.println("");
//        }
        for (int i = 0; i < pas.length; i++) {
            System.out.printf("%-7s", "No");
            System.out.printf("%-10s", "Nama");
            System.out.printf("%-10s", "Alamat");
            System.out.printf("%-10s", "Usia");
            System.out.printf("%-10s", "No Rekam Medis");
            System.out.println("");
            System.out.printf("%-7s", i + 1 + ".");
            System.out.printf("%-10s", pas[i].getNama());
            System.out.printf("%-10s", pas[i].getAlamat());
            System.out.printf("%-10s", pas[i].getUsia() + " tahun");
            System.out.print("");
            pas[i].BuatNomorRekamMedis();
            System.out.println("");
        }
        
        System.out.println("------------------------------------");

    }
}
