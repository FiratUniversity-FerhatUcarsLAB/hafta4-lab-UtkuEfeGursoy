/*
 * Ad Soyad: Utku Efe Gürsoy
 * Ogrenci No: 250542005
 * Tarih: 27.10.2025
 * Aciklama: Geometri Hesap Programı
 * Kullanıcıdan bir dairenin yarıçapını alan ve bu daireye ait çeşitli hesaplamaları yapan bir program 
 * 
 */

import java.util.Scanner; // Scanner sınıfını içe aktarma
import java.lang.Math; // Math sınıfını içe aktarma

public class GeometriHesap {
    public static void main(String[] args){
 
        Scanner input= new Scanner(System.in); // Scanner nesnesi oluşturma
        Double pi= Math.PI; // Pi sayısını Math sınıfından alma
 
        //Kullanıcıdan Yarıçap Bilgisini Alma
        System.out.print("Dairenin Yarıçapını Giriniz: " );
        double yaricap=input.nextDouble();

        //Hesaplamalar  
        double cevre= 2*pi*yaricap; // Dairenin Çevresi
        double alan= pi*yaricap*yaricap; // Dairenin Alanı
        double hacim= (4.0/3.0)*pi*yaricap*yaricap*yaricap; // Dairenin Hacmi (Küre Hacmi)
        double yuzeyAlani= 4.0*pi*yaricap*yaricap; // Dairenin Yüzey Alanı (Küre Yüzey Alanı)
        double capi= 2*yaricap; // Dairenin Çapı

        //Ekran Çıktıları
        System.out.println("\n------------DAİRE HESAPLAMALARI--------------");
        System.out.printf("Dairenin Çevresi:     "+"%.2f",cevre);
        System.out.println("cm");
        System.out.printf("Dairenin Çapı:        "+"%.2f",capi);
        System.out.println("cm");
        System.out.printf("Dairenin Alanı:       "+"%.2f",alan);
        System.out.println("cm2");
        System.out.printf("Dairenin Hacmi:       "+"%.2f",hacim);
        System.out.println("cm3");
        System.out.printf("Dairenin Yüzey Alanı: "+"%.2f",yuzeyAlani);
        System.out.println("cm2");
        input.close(); // Scanner nesnesini kapatma     


    }//main sonu
}//class sonu

