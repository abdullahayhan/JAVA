public class Main {
    public static void main(String[] args) {
        //FOR
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        //WHİLE DÖNGÜSÜ
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While Döngüsü
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While döngüsü bitti");
    }
}