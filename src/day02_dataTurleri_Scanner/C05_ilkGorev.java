package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ilkGorev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("sayinin karesi :" + sayi*sayi); //yada;
        sayi= sayi*sayi;
        System.out.println("sayinin karesi :"+ sayi);
    }
}
