import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen öğrencinin ismini giriniz");
        String ad=scanner.nextLine();
        System.out.println("Lütfen öğrencinin soyadını giriniz");
        String soyad=scanner.nextLine();
        System.out.println("Lütfen öğrencinin bölümünü yazınız");
        String bolum=scanner.nextLine();
        System.out.println("Lütfen öğrencinin okul numarsını giriniz");
        int okulno=scanner.nextInt();
        


        System.out.println("==================="); 
        System.out.println(" OGRENCI BILGILERI "); 
        System.out.println("===================");
        System.out.println("Öğrencinin adı:           "+ad);
        System.out.println("Öğrencinin soyadı:        "+soyad);
        System.out.println("Öğrencinin okul numarası: "+ okulno);
        System.out.println("Öğrencinin okuduğu bölüm: "+bolum);

    }
}
