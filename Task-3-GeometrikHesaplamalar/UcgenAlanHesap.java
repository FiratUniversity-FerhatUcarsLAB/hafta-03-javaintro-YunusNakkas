import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin tabanını giriniz");
        double s1=scanner.nextDouble();
        System.out.println("Lütfen üçgenin yüksekliğini giriniz");
        double s2=scanner.nextDouble();

        double alan=(s1*s2)/2;

        System.out.println("Üçgenin alanı: "+ alan);

    }
}
