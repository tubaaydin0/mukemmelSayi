import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
        ifadelerini ekrana yazan program*/
        int sayi,carp=1,tempSayi=0;
        Scanner inp= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi=inp.nextInt();
        tempSayi=sayi;
        int i=2; //En küçük pozitif bölen 2 olduğu için.
        while(tempSayi!=1){
            if(tempSayi%i==0){ 
                tempSayi/=i;
                carp*=i;
                i=1;
            }
            i++;
        }

        if(carp==sayi && sayi!=1){
            System.out.println("Mükemmel sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
