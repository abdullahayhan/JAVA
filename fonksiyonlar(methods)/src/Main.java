public class Main {

    public static void main(String[] args) {
        sayıBulmaca();
    }
    public static void sayıBulmaca(){
        int [] sayilar= {1,3,5,7,9,0};
        int aranacak= 2;
        boolean varMı=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMı=true;
            }
        }
        String mesaj="";
        if (varMı){
            System.out.println("ARANAN SAYI ("+aranacak+") İLGİLİ DİZİNİN İÇİNDE BULUNDU.");
        }
        else
            System.out.println("İlgili sayı bulunamadı.");

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
