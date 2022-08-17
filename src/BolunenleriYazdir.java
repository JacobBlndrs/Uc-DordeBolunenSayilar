import java.util.Scanner;

public class BolunenleriYazdir {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number;
        number=inp.nextInt();

        for (int i= 0; i<=number;i++ ){
            if (i == 0){
                continue;
            }
            if (i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}
