import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
        ifadelerini ekrana yazan program*/
        int sayi,top=0;
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi=inp.nextInt();
        tempSayi=sayi;
        int i=1;
        while(i<sayi){
            if(sayi%i==0){
                top+=i;
            }
            i++;
        }

        if(top==sayi){
            System.out.println("Mükemmel sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
