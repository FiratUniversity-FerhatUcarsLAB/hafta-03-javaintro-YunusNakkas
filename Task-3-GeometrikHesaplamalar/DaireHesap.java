import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        double yarıcap=scanner.nextDouble();
        double pi=3.14159;

        double alan=pi*yarıcap*yarıcap;
        double çevre=2*pi*yarıcap;
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ çevre);
        System.out.println("Dairenin yarıçapı: "+ yarıcap);

    }
}
