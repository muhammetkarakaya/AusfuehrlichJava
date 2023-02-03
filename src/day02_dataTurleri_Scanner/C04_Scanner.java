package day02_dataTurleri_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lufen isminizi giriniz");
        String kullaniciIsmi = scan.next();
        System.out.println("girilen isim : "+ kullaniciIsmi);

    }
}
