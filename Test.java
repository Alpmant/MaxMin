import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz:");
        int adet = input.nextInt();
        int sayi;
        int max=0,min=0;


        for(int i=1;i<=adet;i++){
            System.out.print("Sayı Gir:");
            sayi=input.nextInt();
            System.out.println(i+".Sayı:"+sayi);

            if(i==1)
            {
                min=sayi;
                max=sayi;
            }
            else
            {
                if(sayi>max)
                    max=sayi;
                if(sayi<min)
                    min=sayi;
            }

            }
        System.out.println("En büyük Sayı:"+max);
        System.out.print("En küçük Sayı:"+min);

        }
    }















