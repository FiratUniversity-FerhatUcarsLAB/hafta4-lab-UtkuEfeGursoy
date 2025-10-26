/*
 * Ad Soyad: Utku Efe Gürsoy
 * Ogrenci No: 250542005
 * Tarih: 27.10.2025
 * Aciklama: Öğrenci Bilgi Programı
 Bu program öğrenciden alığı bilgileri ekrana yazdırır ve içerisinde birde admin paneli vardır Database daha öğrenmediğim için orayı yapamadım.
 */
import java.util.Scanner; // Scanner sınıfını içe aktarma
public class OgrenciBilgi {
public static void main(String[] args){
    Scanner input= new Scanner(System.in); // Scanner nesnesi oluşturma
    
    //Öğrenci Bilgilerini Tutmak İçin Değişkenler Tanımlama
    String ogrenciAdi, ogrenciSoyadi;
    int  ogrenciNo, ogrenciYas;
    double ogrenciNotOrtalamasi=5.0;
    double AdminPanel=0.0;// Admin Paneli İçin Değişken Tanımlama Eğerki not ortalaması 1453 girilirse admin paneli açılacak.

    //Kullanıcıdan Öğrenci Bilgilerini Alma
    System.out.print("Öğrenci Adını Giriniz: " );
    ogrenciAdi=input.nextLine();
    System.out.print("\nÖğrenci Soyadını Giriniz: " );
    ogrenciSoyadi=input.nextLine();
    System.out.print("\nÖğrenci Numarasını Giriniz: " );
    ogrenciNo=input.nextInt();
    System.out.print("\nÖğrenci Yaşını Giriniz: " );
    ogrenciYas=input.nextInt();
   
   
   for(;ogrenciNotOrtalamasi<0.0 || ogrenciNotOrtalamasi>4.0;)  
   { // Not Ortalaması Geçerlilik Kontrolü
        System.out.print("\nÖğrenci Not Ortalamasını Giriniz(0,00-4,00): " );
        ogrenciNotOrtalamasi=input.nextDouble();
        if(ogrenciNotOrtalamasi==1453.00){
            System.out.println("Admin Panleline Hoşgeldiniz!");
            AdminPanel++;
            break;
        }
        if((ogrenciNotOrtalamasi<0.0 || ogrenciNotOrtalamasi>4.0)||(ogrenciNotOrtalamasi!=1453.00)){
            System.out.println("Hatalı Not Ortalaması Girdiniz! Tekrar Deneyiniz.");
        }   
   }// Döngü sonu

   //Ekran Çıktıları
   if(AdminPanel==0.0){//Normal Kullanıcı Ekranı
    //Ogrenci Bilgilerini Yazdırma Ekranı
        System.out.println("\n------------ÖĞRENCİ BİLGİLERİ--------------");
        System.out.println("-------------------");
        System.out.printf("Öğrenci Adı: "+"%.2s",ogrenciAdi);
        System.out.println("*********");
        System.out.printf("Öğrenci Soyadı: "+"%.1s",ogrenciSoyadi);
        System.out.println("*********");
        System.out.println("Öğrenci Numarası: "+ogrenciNo);
        System.out.println("Öğrenci Yaşı: "+ogrenciYas);
        System.out.printf("Öğrenci Not Ortalaması: "+"%.2f\n",ogrenciNotOrtalamasi);
        System.out.println("-------------------");
    
        //Başarı Durumu Kontrolü
        if(ogrenciNotOrtalamasi>=3.0){
            System.out.println("Öğrenci Başarılıdır.");
        }
        else if(ogrenciNotOrtalamasi<3.0 && ogrenciNotOrtalamasi>=2.0){
            System.out.println("Öğrenci Ortalamadır.");
        }
         else{
            System.out.println("Öğrenci Başarısızdır.");
        }//if-else sonu

        input.close(); // Scanner nesnesini kapatma  


   }//For Kullanıcı Ekranı Sonu
   else{//Admin Paneli Ekranı
        System.out.println("\n---------------ADMİN PANELİ---------------");
        System.out.println("-------------");
        System.out.println("Toplam Kayıtlı Öğrenci Sayısı: 1200");
        System.out.println("Bugün Ders İşlenen Öğrenci Sayısı: 350");
        System.out.println("Sistemdeki Aktif Öğrenci Sayısı: 800");
        System.out.println("Sistemdeki Pasif Öğrenci Sayısı: 400");
        System.out.println("Ortalama Not Durumu: 2.75");
        System.out.println("-------------");
        System.out.println("---------ADMİN İŞLEMLERİ---------");// GÜNCELLENECEK DAHA AKTİF DEĞİL ÇÜNKÜ VERİTABANI YOK
        System.out.println("Ne yapmak İstiyorsanız Seçiniz:");
        System.out.println("1- Yeni Öğrenci Kaydı");
        System.out.println("2- Öğrenci Bilgisi Güncelleme");
        System.out.println("3- Öğrenci Silme");
        System.out.println("4- Öğrenci Listeleme");
        System.out.println("5- Çıkış");
        System.out.println("-------------");
        input.close(); // Scanner nesnesini kapatma  
   }//else Admin Paneli Sonu


}//public static void main
    
}//public class OgrenciBilgiSistemi
