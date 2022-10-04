public class Main {

    public static void main(String[] args) {
        double [] myList={1.3,4.5,2.7};
        double total=0;
        double max=myList[2];
        for (double numbers:myList){
            if (max<numbers){
                max=numbers;
            }
            total=numbers+total;
            System.out.println(numbers);
        }
        System.out.println("Tüm sayıların toplamı : "+total);
        System.out.println("En büyük sayı : "+max);
    }
}
