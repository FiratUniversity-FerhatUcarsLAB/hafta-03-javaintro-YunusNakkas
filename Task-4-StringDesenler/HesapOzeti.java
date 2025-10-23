import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz ürünü giriniz");
        String urun=scanner.nextLine();
        System.out.println("Lütfen ürünün fıyatını TL cinsinden giriniz");
        double fıyat=scanner.nextDouble();
        System.out.println("Lütfen ürün miktarını giriniz");
        int mıktar=scanner.nextInt();

        double tutar=fıyat*mıktar;

        System.out.println("Almış olduğunuz ürün:                   "+urun);
        System.out.println("Aldığınız ürünün tekli fiyatı:          "+fıyat);
        System.out.println("Toplam almış bulunduğunuz ürünün sayısı:"+mıktar);
        System.out.println("Bu alışverişiniz toplam: "+ tutar+"tutmuş bulunmaktadır.");



        
        

    }
}
