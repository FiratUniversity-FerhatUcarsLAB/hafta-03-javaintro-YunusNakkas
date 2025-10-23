import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen payı  giriniz");
        double pay=scanner.nextDouble();

        System.out.println("Lütfen paydayı  giriniz");
        double payda=scanner.nextDouble();

        double sonuc=pay/payda;

        System.out.printf("%.4f/n", sonuc);
        
    }
}

