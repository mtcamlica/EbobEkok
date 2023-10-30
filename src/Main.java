import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int buyukSayi = 0;
        int kucukSayi = 0;
        int ebob = 1;
        int ekok = 1;

        if (n1>n2) {
            buyukSayi = n1;
            kucukSayi = n2;
            System.out.println("Büyük Sayı: " + buyukSayi + " Küçük Sayı: " + kucukSayi);
        } else if (n1<n2) {
            buyukSayi = n2;
            kucukSayi = n1;
            System.out.println("Büyük Sayı: " + buyukSayi + " Küçük Sayı: " + kucukSayi);
        }else {
            System.out.println("n1 ve n2 birbirine eşittir.");
            buyukSayi = n1;
            kucukSayi = n2;
            buyukSayi = kucukSayi;
        }
        for(int i =1; i <= (buyukSayi*kucukSayi); i++) {
            if(i%buyukSayi == 0 && i%kucukSayi ==0){
                ekok = i;
                System.out.println("EKOK: " + ekok);
                break;
            }
        }


        for (int i=kucukSayi; i>=1; i-- ){
            if(kucukSayi%i==0 && buyukSayi%i==0) {
                ebob = i;
                System.out.println("EBOB: " + ebob);
                break;
            }
        }
    }

}
