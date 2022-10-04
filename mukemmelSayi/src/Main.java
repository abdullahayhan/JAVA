public class Main {

    public static void main(String[] args) {
	   // 6 mükemmel sayi 1 2 3 e bölünür toplamı 6 eder.
        int sayi=28;
        int total=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total=i+total;
            }
        }
        if (total==sayi){
            System.out.println(sayi+" Bir mükemmel sayıdır.");
        }
        else
            System.out.println(sayi+" Bir mükemmel sayı değildir.");
    }
}
