public class Main {

    public static void main(String[] args) {
        int sayi=3;
        boolean isPrime=true;
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
    }

}

