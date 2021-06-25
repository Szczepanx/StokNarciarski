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

    public  String klientMenu(){
        System.out.println("Wybierz :");
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
        }

    public Cart(int id, String description, int ilosc, double price) {
        this.id = id;
        this.description = description;
        this.ilosc = ilosc;
        this.price = price;
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
        return "Koszyk["+
                " ID: "+ id+
                " Opis: " + description +
                " Ilość: " + ilosc +
                " Cena: " + price +
                ']';
    }
}
