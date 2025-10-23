import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
        double ukenar=scanner.nextDouble();
        System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");
        double kkenar=scanner.nextDouble();

        double alan=ukenar*kkenar;
        double çevre=(ukenar+kkenar)*2;

        System.out.println("Dikdörtgenin çevresi: "+ çevre);
        System.out.println("Dikdörtgenin alanı: "+ alan);

    }
}
