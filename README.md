# Derin Tufan - 20220108065

# KayitUygulamasi
Bu proje, öğrencinin kendi bilgilerini ve kayıt olmak istediği ders bilgilerini girerek ders kaydını yapmasını sağlayan bir Java uygulamasıdır. Projenin içerisinde bulunan ana sınıflar şunlardır:

# ProjeMenuFormu:

-Bu sınıf, sisteme giren kişiye öğrenci kayıt ve ders kayıt formlarına gitme seçeneği sunar.

-OgrenciKayit butonuna tıklandığında yeni bir OgrenciKayıtFormu oluşturularak kullanıcı forma yönlendirilir.

-DersKayit butonuna tıklandığında yeni bir DersKayıtFormu oluşturularak kullanıcı forma yönlendirilir.


# OgrenciKayitFormu:

-Bu sınıf, öğrenciyi sisteme kayıt etmek için gerekli olan bilgileri alıp DosyaFonksiyonlari sınıfını kullanarak "öğrencilistesi" doysyasına girilen bilgileri yazdırır.

-Sisteme kayıt için gerekli bilgiler: OgrenciNo,OgrenciAdi,OgrenciSoyadi,OgrenciBolumu ve dersSecimi.

-Bilgiler girildikten sonra Kaydet butonuna basarak kaydet fonksiyonu ile bilgiler dosyaya yazdırılır.

# DersKayitFormu:

-Bu sınıf, dersi sisteme kayıt etmek için gerekli olan bilgileri alıp DosyaFonksiyonlari sınıfını kullanarak "dersler" doysyasına girilen bilgileri yazdırır.

-Sisteme kayıt için gerekli bilgiler: DersKodu,DersAdi ve DersDonemi.

-Bilgiler girildikten sonra Kaydet butonuna basarak kaydet fonksiyonu ile bilgiler dosyaya yazdırılır.

# DosyaFonksiyonlari:

-Bu sınıf, dosyaya yazdırma ve okuma işlemleri için gerekli fonksiyonları içeriyor.

-dersleriDosyayaYaz metodu, ders listesini alır ve dosyaya yazmak için kullanılır.

-dersleriDosyadanOku metodu, ders listesini dosyadan okur ve liste olarak döndürür.

-ogrenciyiDosyayaYaz metodu, öğrenci bilgilerini dosyaya yazmak için kullanılır.

