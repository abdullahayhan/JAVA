public class Main {

    public static void main(String[] args) {
        String mesaj="Bugün hava cok güzel";
        String yeniMesaj=sehirver();
        System.out.println(yeniMesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
        System.out.println(topla2(4,8,7,6,5));

    }
    public static void Ekle(){
        System.out.println("EKLENDİ");
    }
    public static void Sil(){
        System.out.println("SİLİNDİ");
    }
    public static void güncelle(){
        System.out.println("GÜNCELLENDİ");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int total=0;
        for (int sayi:sayilar){
            total=sayi+total;
        }
        return total;
    }
    public static String sehirver(){
        return "Ankara";
    }
}
