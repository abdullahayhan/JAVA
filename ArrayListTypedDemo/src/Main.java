import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("istanbul");
        sehirler.add("ankara");
        sehirler.add("izmir");
        sehirler.add("Aydın");
        //sehirler.remove("istanbul");
        Collections.sort(sehirler);               //sehirleri sırala alfabeye göre
        for (String sehir : sehirler){
            System.out.println(sehir);
        }
    }
}
