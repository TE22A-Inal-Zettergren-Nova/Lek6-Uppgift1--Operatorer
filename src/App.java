import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        /*Uppgift a */

        System.out.print("Skriv in ett tal: ");
        int tal1 = tb.nextInt();

        System.out.print("Skriv in ett till tal: ");
        int tal2 = tb.nextInt();

        System.out.println("Är tal1 och tal2 lika stora?: "+(tal1==tal2));
        System.out.println("Är tal1 mindre än tal2?: "+(tal1<tal2));
        System.out.println("Är tal1 större än tal2?: "+(tal1>tal2));

        /*Uppgift b */

        int[] talen ={4,5,2};
        System.out.println(" ");
        System.out.println("Är "+talen[0]+" större än "+talen[1]+" eller "+talen[2]+"?: "+(talen[0]>talen[1] || talen[0]>talen[2]));
        System.out.println("Är "+talen[0]+" mindre än "+talen[1]+" eller "+talen[2]+"?: "+(talen[0]<talen[1] || talen[0]<talen[2]));
        System.out.println("Är "+talen[0]+" lika med "+talen[1]+" eller "+talen[2]+"?: "+(talen[0]>talen[1] || talen[0]>talen[2]));


        


        
    }

}
