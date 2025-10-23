import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini almak istediğiniz sayıyı giriniz");
        int s1=scanner.nextInt();
        int denemesayısı=1;

        for(int i=2;i<=s1;i++)
        {
            denemesayısı=denemesayısı*i;
        }
        System.out.println(denemesayısı);

        
        
    }
}
