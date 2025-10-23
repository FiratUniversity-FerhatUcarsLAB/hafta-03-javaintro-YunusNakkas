import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
        double s1=scanner.nextDouble();
        System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");
        double s2=scanner.nextDouble();

        double alan=s1*s2;
        double çevre=(s1+s2)*2;

        System.out.println("Dikdörtgenin çevresi: "+ çevre);
        System.out.println("Dikdörtgenin alanı: "+ alan);

    }
}
