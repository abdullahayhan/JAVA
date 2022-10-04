public class Main {

    public static void main(String[] args) {
	  //220-284
        int sayi=220,sayi1=284,total=0,total1=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total=i+total;
            }
        }
        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0){
                total1=i+total1;
            }
        }
        if (sayi==total1 && sayi1==total){
            System.out.println(sayi+" ile "+sayi1+" kardeş sayılardır.");
        }
        else
            System.out.println("Kardeş sayılar değildir.");
    }
}
