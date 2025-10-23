import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin tabanını giriniz");
        double taban=scanner.nextDouble();
        System.out.println("Lütfen üçgenin yüksekliğini giriniz");
        double yukseklık=scanner.nextDouble();

        double alan=(taban*yukseklık)/2;

        System.out.println("Üçgenin alanı: "+ alan);

    }
}
