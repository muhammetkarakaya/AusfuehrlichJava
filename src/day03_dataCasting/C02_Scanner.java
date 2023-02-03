package day03_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER a basiniz");
        char isimIlkHarf= scan.nextLine().charAt(0);
        /* Scanner methodlarinda nextChar yok.
        bu yuzden gitrise gore next() yada nextline() yazip
        sonra .charAt(0) yazariz.(= index)
         */
        String soyisim=scan.nextLine();
        double yas=scan.nextDouble();
        //girilen bilgiler : J Doe, 44
        System.out.println("girilen bilgiler : "+ isimIlkHarf+" "+soyisim+" "+yas);
        }
    }

