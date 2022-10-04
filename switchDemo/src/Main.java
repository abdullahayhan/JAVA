public class Main {

    public static void main(String[] args) {
	// öğrencinin sınavdan aldığı nota göre aldığı puan
     char grade='J';
     switch (grade){
         case 'A':
             System.out.println("Mükemmel : Geçtiniz");
             break;
         case 'B':
             System.out.println("Güzel : Geçtiniz");
             break;
         case 'C':
             System.out.println("İYİ : Geçtiniz");
             break;
         case 'D':
             System.out.println("Maalesef kaldınız.");
             break;
         default:
             System.out.println("Geçersiz not girdiniz");
             //control+shift+alt+l kodu düzene sokar.
     }
    }
}
