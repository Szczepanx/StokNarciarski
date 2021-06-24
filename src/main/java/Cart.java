import java.sql.SQLOutput;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private int id;
    private String description;
    private int ilosc;
    private double price;



    static Scanner scanner = new Scanner(System.in);

    public static String klientMenu(){
        System.out.println("Wybierz produkt :");
        System.out.println("'1' = Karta ");
        System.out.println("'2' = Instruktor ");
        System.out.println("'3' = Sprzet ");
        System.out.println("'4' = Wyswietl Koszyk");
        return scanner.next();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cart> koszyk = new ArrayList<>();
        KartaPkt karta = new KartaPkt();
        Sprzet sprzet = new Sprzet();

        switch (klientMenu()){
            case "1":
                System.out.println("Wpisz ilosc biletow;");
                int iloscKart = scanner.nextInt();
                System.out.println("Wpisz ilosc punktow :");
                int iloscPunktow = scanner.nextInt();
                koszyk.add(new Cart("Karta",iloscKart,karta.cenaZaKarte(iloscPunktow)*iloscKart));
                System.out.println(koszyk.toString());
                System.out.println("Karta dodana do koszyka!");
            case "2":
                System.out.println("Wpisz czas w godzinach ;");
                int iloscGodzin = scanner.nextInt();
                System.out.println("Wybierz poziom zaawansowania :");
                System.out.println("'1' = zaawansowany");
                System.out.println("'2' = podstawowy");
                String poziomZaawansowania = scanner.next();
                if (poziomZaawansowania.equals("1")){
                    koszyk.add(new Cart("Instruktor",iloscGodzin,100*iloscGodzin));
                    System.out.println(koszyk.toString());
                    System.out.println("Instruktor Dodany!");
                }
                if (poziomZaawansowania.equals("2")){
                    koszyk.add(new Cart("Instruktor",iloscGodzin,150*iloscGodzin));
                    System.out.println(koszyk.toString());
                    System.out.println("Instruktor Dodany!");
                }
            case "3":
                sprzet.naszaLista();
                System.out.println("Dostepne Sprzety:");
                sprzet.wyswietlSprzet();
                System.out.println("Wybierz sprzet za pomoca ID: ");
                int idSprzetu = scanner.nextInt();
                for (Sprzet sprzet1: sprzet.getListaSprzetow()) {
                    if (sprzet1.getId()==idSprzetu){
                     koszyk.add(new Cart("Sprzet",1,sprzet1.getCenaSprzetu()));
                    }
                }
            case "4":
                System.out.println("Twoj Koszyk Zawiera :");
                System.out.println(koszyk.toString());
                System.out.println("Cena za wszysko :");
                double sum = 0;
                for (Cart cart: koszyk) {
                    sum+=cart.getPrice();

                }
                System.out.println(sum);
            default:klientMenu();
        }





    }


    public Cart(String description, int ilosc, double price) {
        this.description = description;
        this.ilosc = ilosc;
        this.price = price;
    }

    public Cart() {
    }

    public int getIlosc() {
        return ilosc;
    }

    public Cart setIlosc(int ilosc) {
        this.ilosc = ilosc;
        return this;
    }

    public int getId() {
        return id;
    }

    public Cart setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Cart setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Cart setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Koszyk[" +
                " Opis: " + description +
                " Ilość: " + ilosc +
                " Cena: " + price +
                ']';
    }
}
