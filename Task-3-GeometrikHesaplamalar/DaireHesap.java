import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        double s1=scanner.nextDouble();
        double pi=3.14159;

        double alan=pi*s1*s1;
        double çevre=2*pi*s1;
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ çevre);
        System.out.println("Dairenin yarıçapı: "+ s1);

    }
}
