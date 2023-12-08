/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaano
 */
public class DosyaFonksiyonları {

    public static void dersleriDosyayaYaz(List<DersBilgileri> dersler, String dosyaAdi) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            for (DersBilgileri ders : dersler) {
                String dersBilgisi = ders.getDersAd() + "-" + ders.getDersDonem() + "-" + ders.getDersKodu();
                writer.write(dersBilgisi + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<DersBilgileri> dersleriDosyadanOku(String dosyaAdi) {
        List<DersBilgileri> dersListesi = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("-");
                if (tokens.length == 3) {
                    DersBilgileri ders = new DersBilgileri(tokens[2], tokens[0], tokens[1]);
                    dersListesi.add(ders);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dersListesi;
    }

    public static void ogrenciyiDosyayaYaz(OgrenciBilgileri ogrenci, String dosyaAdi, String dosyaUzantisi) {
        try (FileWriter fileWriter = new FileWriter(dosyaAdi + "Dosyalar/derslistesi")) {
            fileWriter.write(ogrenci.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


