import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        System.out.print("Skriv in ett tal: ");
        int tal1 = tb.nextInt();

        System.out.print("Skriv in ett till tal: ");
        int tal2 = tb.nextInt();

        System.out.println("Är tal1 och tal2 lika stora?: "+(tal1==tal2));
        System.out.println("Är tal1 mindre än tal2?: "+(tal1<tal2));
        System.out.println("Är tal1 större än tal2?: "+(tal1>tal2));





        
    }

}
