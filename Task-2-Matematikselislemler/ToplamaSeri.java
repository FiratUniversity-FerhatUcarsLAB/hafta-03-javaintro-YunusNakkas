import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  sayıyı giriniz");
        int s1=scanner.nextInt();
        int s2=s1 +1;
        int sonuc=0;

        sonuc=s1*s2/2;

        System.out.println(sonuc);

        
    }
}
