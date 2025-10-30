
/*
 * Ad Soyad: Utku Efe Gürsoy
 * Ogrenci No: 250542005
 * Tarih: 30.10.2025
 * Aciklama: Maas Hesap Programı
 * 
 * Çalışan bilgilerini alıp detaylı maaş bordrosu oluşturan program.

 */
import java.util.Scanner; // Scanner sınıfını içe aktarma

public class MaasHesap {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); // Scanner nesnesi oluşturma
        
        //sabitleeri tanımlama
        final double SGK_ORANI=0.14 ; // SGK kesinti oranı
        final double GELIR_VERGISI_ORANI=0.15;// gelir vergisi oranı
        final double DAMGA_VERGISI_ORANI=0.00759; // damga vergisi oranı

        //Degiskenleri Tanımlama 
        String adSoyad;
        double brutMaas,mesaiUcreti,toplamGelir,netMaas,sgkKesinti,gelirVergisi,damgaVergisi,toplamKesinti,kesintiOrani,saatlikNetMaas,gunlukNetKazanc;
        int haftalikCalismaSaati,mesaiSaati;
        
        //Kullanıcıdan Bilgi Alma
        System.out.print("Çalışanın Adı Soyadı: ");
        adSoyad=scan.nextLine();
        System.out.print("Brüt Maaşı (TL): ");
        brutMaas=scan.nextDouble();
        System.out.print("Haftalık Çalışma Saati: ");
        haftalikCalismaSaati=scan.nextInt();
        System.out.print("Mesai Saati: ");
        mesaiSaati=scan.nextInt();

        //Hesaplamalar-Gelirler
        mesaiUcreti=(brutMaas/160)*mesaiSaati*1.5; // Mesai Ücreti Hesaplama
        toplamGelir=brutMaas+mesaiUcreti; // Toplam Gelir Hesaplama
        
        //Hesaplamalar-Kesintiler
        sgkKesinti=toplamGelir*SGK_ORANI; // SGK Kesintisi Hesaplama
        gelirVergisi=toplamGelir*GELIR_VERGISI_ORANI; // Gelir Vergisi Hesaplama
        damgaVergisi=toplamGelir*DAMGA_VERGISI_ORANI; // Damga Vergisi Hesaplama
        toplamKesinti=sgkKesinti+gelirVergisi+damgaVergisi; // Toplam Kesinti Hesaplama

        //Net Maaş Hesaplama
        netMaas=toplamGelir-toplamKesinti;

        //Ek Hesaplamalar
        kesintiOrani=(toplamKesinti/toplamGelir)*100; // Kesinti Oranı Hesaplama
        saatlikNetMaas=netMaas/(haftalikCalismaSaati*4); // Saatlik Net Maaş Hesaplama
        gunlukNetKazanc=netMaas/22; // Günlük Net Kazanç Hesaplama

        //Ekran Çıktıları
        System.out.println("\n------------MAAŞ BORDROSU--------------");
        System.out.println("Çalışan Adı Soyadı: " + adSoyad);
        System.out.printf("Brüt Maaş:               "+"%.2f",brutMaas);
        System.out.println(" TL");
        System.out.printf("Mesai Ücreti("+mesaiSaati+" saat):     "+"%.2f",mesaiUcreti);
        System.out.println(" TL");
        System.out.println("---------------------------------------");
        System.out.printf("Toplam Gelir:            "+"%.2f",toplamGelir);
        System.out.println(" TL");
        System.out.println("\n\n Kesintiler:");
        System.out.printf("SGK Kesintisi:          "+"%.2f",sgkKesinti);
        System.out.println(" TL");
        System.out.printf("Gelir Vergisi:          "+"%.2f",gelirVergisi);
        System.out.println(" TL");
        System.out.printf("Damga Vergisi:          "+"%.2f",damgaVergisi);
        System.out.println(" TL");
        System.out.println("---------------------------------------");
        System.out.printf("Toplam Kesinti:         "+"%.2f",toplamKesinti);
        System.out.println(" TL");
        System.out.printf("Net Maaş:                "+"%.2f",netMaas);
        System.out.println(" TL");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

    }//main sonu
    
}//class sonu
