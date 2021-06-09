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

        List<Sprzet> listaSprzetow = new ArrayList<>();
        listaSprzetow.add(new Sprzet(1,"Salomon",29.99,"Kask",true));
        listaSprzetow.add(new Sprzet(1,"Salomon",50.00,"Narty",true));
        listaSprzetow.add(new Sprzet(1,"Salomon",29.99,"Buty Narciarskie",true));
        listaSprzetow.add(new Sprzet(1,"Salomon",35.00,"Buty Snowboardowe",true));
        listaSprzetow.add(new Sprzet(1,"Salomon",60.00,"Snowboard",true));
        listaSprzetow.add(new Sprzet(1,"Rossignol",29.99,"Kask",true));
        listaSprzetow.add(new Sprzet(1,"Rossignol",45.00,"Narty",true));
        listaSprzetow.add(new Sprzet(1,"Rossignol",24.99,"Buty Narciarskie",true));
        listaSprzetow.add(new Sprzet(1,"Rossignol",14.99,"Kijki",true));

        System.out.println(listaSprzetow.size());




        System.out.println(listaPracownikow);
    }
}
