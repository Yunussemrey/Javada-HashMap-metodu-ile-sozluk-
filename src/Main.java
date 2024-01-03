import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>(); //array list çeşidi..
        sozluk.put("pencıl", "kalem");// değer ekliyoruz. 1.-->anahtar kelime,,2.-->değer kelimesi
        sozluk.put("window", "pencere");
        sozluk.put("phone", "telefon");
        sozluk.put("mause", "fare");
        sozluk.put("book", "kitap");
        sozluk.put("car", "araba");
        sozluk.put("phone battery", "telefon sarjı");

//        sozluk.remove("pencıl"); //siler
//        System.out.println(sozluk.get("window"));//anahtar kelime ile yazdırılır,,

//        sozluk.clear(); //komple siler

        for (String i : sozluk.keySet()) {
            System.out.println("In english: " + i+";");
            System.out.println("Türkçesi: " + sozluk.get(i));
        }


//        ArrayList<String> bölgeler=new ArrayList<String>();
//        bölgeler.add("Karadeniz");
//        bölgeler.add("Akdeniz");
//        bölgeler.add("Ege");
//        bölgeler.add("İç Anadolu");
//        System.out.println(bölgeler.get(0));
//        for (String bölge:bölgeler){
//            System.out.println(bölge);
//       }

    }
}