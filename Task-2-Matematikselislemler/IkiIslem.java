import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen payı  giriniz");
        double s1=scanner.nextDouble();

        System.out.println("Lütfen paydayı  giriniz");
        double s2=scanner.nextDouble();

        double sonuc=s1/s2;

        System.out.printf("%.4f/n", sonuc);
        
    }
}
