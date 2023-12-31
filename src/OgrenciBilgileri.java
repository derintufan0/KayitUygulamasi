/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaano
 */
public class OgrenciBilgileri {

    private int ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;
    private String ogrenciBolum;
    private List<DersBilgileri> ogrenciDersler;

    public OgrenciBilgileri(int ogrenciNo, String ogrenciAd, String ogrenciSoyad, String ogrenciBolum) {
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciBolum = ogrenciBolum;
        this.ogrenciDersler = new ArrayList<>();
    }

    public void dersEkle(DersBilgileri ders) {
        ogrenciDersler.add(ders);
    }

    public List<DersBilgileri> getOgrenciDersler() {
        return ogrenciDersler;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public String getOgrenciBolum() {
        return ogrenciBolum;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    @Override
    public String toString() {
        return "Öğrenci No: " + ogrenciNo + ", Adı: " + ogrenciAd + ", Soyadı: " + ogrenciSoyad + ", Bölümü: " + ogrenciBolum;
    }
}




