import java.util.Scanner;
public class Yildiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int taban;
        System.out.println("Üçgeninizin tabanında kaç yıldız olacağını giriniz.");
        taban = s.nextInt();
        for(int i = 0; i<taban;i++) {
            for (int j = 1; j < (taban - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int n = 0; n<taban;n++){
            for(int l=1;l<=n+1;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=2*(taban-2-n)+1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
