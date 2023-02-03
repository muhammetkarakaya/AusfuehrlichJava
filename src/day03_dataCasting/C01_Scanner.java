package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lutfen soyadinizi yaziniz");
        String soyisim=scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scanner.nextDouble();

        System.out.println("Isminiz  : " + isim);
        System.out.println("Soyisminiz  : " + soyisim);
        System.out.println("Yasiniz  :" + yas );
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        //  "/n alt satira gecer"

        System.out.println("Isminiz : " + isim+
                "\nSoyisminiz  : " + soyisim+
                "\nYasiniz  :" + yas+
                "\nKaydiniz basariyla tamamlanmistir.");
        }


    }

