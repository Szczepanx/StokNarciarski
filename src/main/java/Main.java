import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik(1,"Jan","Kowalski"));
        listaPracownikow.add(new Pracownik(2,"Andrzej","Nowak"));
        listaPracownikow.add(new Pracownik(3,"Tadeusz","Kaleta"));
        listaPracownikow.add(new Pracownik(4,"Stefan","Drab"));


        System.out.println(listaPracownikow);
    }
}
