import java.util.Scanner;

public class havaEtkinlik {
    public static void main(String[] args) {
        //Değişkenler
        int temp;

        //Kullanıcıdan Veri Alma
        Scanner veri = new Scanner(System.in);
        System.out.println("Sıcaklık Bilgisi Giriniz : ");
        temp = veri.nextInt();

        if (temp < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (5 < temp && temp < 10) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (10 < temp && temp < 15) {
            System.out.println("Sinemaya Ya da Pikniğe Gidebilirsiniz.");
        } else if (15 < temp && temp < 25) {
            System.out.println("Pikniğe Gidebilirsimiz");
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }
}
