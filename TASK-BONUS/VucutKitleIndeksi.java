import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu CM cinsinden giriniz");
        int boy=scanner.nextInt();
        System.out.println("Lütfen kilonuzu KG cinsinden giriniz");
        double kilo=scanner.nextDouble();

        double BMI= (boy*boy)/kilo;

        System.out.println("Vücudunuz vucüt kitle endeksi: "+BMI);

    }
}
