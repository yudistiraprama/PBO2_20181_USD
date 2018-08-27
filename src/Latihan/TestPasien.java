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
public class TestPasien {
    public static void main(String[] args) {
        
        Pasien pas1 = new Pasien("Puspa");
        pas1.setTgl_lahir(1974, 1, 12);
        System.out.println("Umur = "+pas1.getUsia()+" tahun");
        pas1.BuatNomorRekamMedis();
        
    }
}
