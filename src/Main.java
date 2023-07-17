import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner alici = new Scanner(System.in);
        System.out.print("A sayısını giriniz");
        a=alici.nextInt();
        System.out.print("B sayısını giriniz");
        b=alici.nextInt();
        System.out.print("C sayısını giriniz");
        c=alici.nextInt();
        if (a<b&&a<c){
            if (b<c){
                System.out.println("En küçük değer :" +a );
                System.out.println(" Ortanca değer :" +b );
                System.out.println("En büyük değer :" +c );

            } else if (c<b) {
                System.out.println("En küçük değer :" +a );
                System.out.println(" Ortanca değer :" +c );
                System.out.println("En büyük değer :" +b );

            }
        } else if (b<a&&b<c) {
            if (a<c){
                System.out.println("En küçük değer :" +b );
                System.out.println(" Ortanca değer :" +a );
                System.out.println("En büyük değer :" +c );

            } else if (c<a) {
                System.out.println("En küçük değer :" +b );
                System.out.println(" Ortanca değer :" +c );
                System.out.println("En büyük değer :" +a );

            }

        } else if (c<a&&c<b) {
            if (a<b){
                System.out.println("En küçük değer :" +c );
                System.out.println(" Ortanca değer :" +a );
                System.out.println("En büyük değer :" +b );

            } else if (b<a) {
                System.out.println("En küçük değer :" +c );
                System.out.println(" Ortanca değer :" +b);
                System.out.println("En büyük değer :" + a);

            }

        }


    }
}