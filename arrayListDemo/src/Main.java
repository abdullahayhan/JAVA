import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList();
        sayilar.add(10);                            // atama
        sayilar.add(1);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());       //koleksiyonun kaç elemanlı oldugunu gosterir.
        //System.out.println(sayilar.get(2));       //eleman okuma
        //sayilar.set(0,100);                       //eleman değiştirme.
        //sayilar.remove(0);                        // eleman silme
        // sayilar.clear();                         //tüm listeyi siler
        for  (Object i : sayilar){
            System.out.println(i);
        }
    }
}
