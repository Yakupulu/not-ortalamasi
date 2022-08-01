import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik= inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya= inp.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        turkce= inp.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih= inp.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        muzik= inp.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc=toplam/6;
        System.out.println("Ortalamaniz:"+sonuc);

       String karar;
       karar=(sonuc>60)?"Gecti":"Kaldi";
        System.out.println(karar);
















    }







}
