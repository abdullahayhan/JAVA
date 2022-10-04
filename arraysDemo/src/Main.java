public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Mehmet";
        ogrenciler[1] = "Ahmet";
        ogrenciler[2] = "Ayşe";
        for (int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        //DAHA KOLAY KULLANIM : diziyle aynı tipte bir değişkenle dizinin içindeki elemanları gezdirilir.
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
