import java.lang.invoke.SwitchPoint;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static Sprzet findUsingEnhancedForLoop(
            String producent, List<Sprzet> listaSprzetow) {

        for (Sprzet sprzet : listaSprzetow) {
            if (sprzet.getProducent().equals(producent)) {
                return sprzet;
            }
        }
        return null;
    }
    public static String WyborUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "'C' = koszyk, 'K'= kierownik , 'P'=pracownik, 'E'= wyjscie");
        String wybierzUzytkownika= scanner.nextLine();
        return wybierzUzytkownika;
    }
    public static void KierownikMenu() {
        System.out.println("Witaj Kierowniku, co bedziesz robil:");
        System.out.println("Dodac nowy sprzet:'1'");
        System.out.println("Usunac sprzet: '2'");
        System.out.println("Dodac nowego pracownika:'3");
        System.out.println("Usunac pracownika:'4");
    }

    public static void PracownikMenu(){
        System.out.println("DodajNowegoKlienta:1");
        System.out.println("PrzypiszKarteDoKlienta:2");
        System.out.println("PrzeprowadzPlatnosc:3");
        System.out.println("SprawdzDostepneSprzety:4");
        System.out.println("WypozyczSprzet:5");
        System.out.println("PrzyjmijZwrotSprzetu:6");
        System.out.println("ZarezerwujLekcjeUInstruktora:7");
        System.out.println("UsunWpisZTerminarza:8");
        System.out.println("ZobaczZarezerwowaneLekcje:9");
        System.out.println("PodliczKoszty:10");
        System.out.println("WybierzTypKarty:11");
        System.out.println("DodajDoZamowienia:12");
    }

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.now();


        Kierownik kierownik = new Kierownik();
        Pracownik pracownik = new Pracownik();
        Cart cart = new Cart();

        KartaPkt karta = new KartaPkt();
        Sprzet sprzet = new Sprzet();
        List<Instruktor> listaInstruktorow = new LinkedList<>();
        List<Cart> koszyk = new ArrayList<>();

        List<Pracownik> listaPracownikow = new LinkedList<>();
        listaPracownikow.add(new Pracownik(1, "Jan", "Kowalski"));
        listaPracownikow.add(new Pracownik(2, "Andrzej", "Nowak"));
        listaPracownikow.add(new Pracownik(3, "Tadeusz", "Kaleta"));
        listaPracownikow.add(new Pracownik(4, "Stefan", "Drab"));


        List<Klient> listaKlientow = new LinkedList<>();
        listaKlientow.add(new Klient(1, 1, "Jan", "Kowalski"));


        List<Terminarz> listaTerminow = new LinkedList<>();


        List<Kierownik> listaKierowników = new ArrayList<>();
        listaKierowników.add(new Kierownik(5, "Janusz", "Bela"));

        List<Sprzet> listaSprzetow = new LinkedList<>();
        listaSprzetow.add(new Sprzet(1, "Salomon", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(2, "Salomon", 50.00, "Narty", true));
        listaSprzetow.add(new Sprzet(3, "Salomon", 29.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(4, "Salomon", 35.00, "Buty Snowboardowe", true));
        listaSprzetow.add(new Sprzet(5, "Salomon", 60.00, "Snowboard", true));
        listaSprzetow.add(new Sprzet(6, "Rossignol", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(7, "Rossignol", 45.00, "Narty", true));
        listaSprzetow.add(new Sprzet(8, "Rossignol", 24.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(9, "Rossignol", 14.99, "Kijki", true));


boolean inputFlag = true;

        Scanner scanner = new Scanner(System.in);

        while (inputFlag == true) {
            switch (WyborUzytkownika()){
                case "K":
                    KierownikMenu();
                    String choise = scanner.next();
                    switch (choise){
                        case "1":
                            kierownik.DodajNowySprzet(listaSprzetow);
                            System.out.println("Sprzet dodany!");
                            break;
                        case "2":
                            kierownik.UsunSprzet(listaSprzetow);
                            System.out.println("Sprzet usuniety!");
                            break;
                        case "3":
                            kierownik.DodajPracownika(listaPracownikow);
                            System.out.println("Pracownik dodany!");
                            break;
                        case "4":
                            kierownik.UsunPracownika(listaPracownikow);
                            System.out.println("Pracownik usuniety");
                            break;
                        case "5":
                            kierownik.DodajNowegoInstruktora(listaInstruktorow);
                            System.out.println("Instruktor dodany!");
                            break;
                        case "6":
                            kierownik.UsunInstruktora(listaInstruktorow);
                            System.out.println("Instruktor usuniety!");
                            break;
                    }
                    break;
                case "P":
                    PracownikMenu();
                    String choise1 =scanner.next();

                    switch (choise1) {
                        case "1":
                            pracownik.DodajNowegoKlienta(listaKlientow);
                            System.out.println("Dodano Nowego Klienta!");
                            break;
                        case "2":
                            pracownik.PrzeprowadzPlatnosc();
                            System.out.println("Przeprowadzono Platnosc:");
                            break;
                        case "3":
                            pracownik.SprawdzDostepneSprzety(listaSprzetow);
                            System.out.println("Oto Sprzety!");
                        case "4":
                            pracownik.WypozyczSprzet();
                            System.out.println("Wypozyczono  Sprzet");
                            break;
                        case "5":
                            pracownik.PrzyjmijZwrotSprzetu();
                            System.out.println("Przyjmijeto Zwrot sprzetu!");
                            break;
                        case "6":
                            pracownik.UsunWpisZTerminarza();
                            System.out.println("Usunieto wpis z terminarza:");
                            break;
                        case "7":
                            pracownik.ZobaczZarezerwowaneLekcje();
                            System.out.println("Zarezerwowane lekcje!");
                            break;
                    }
                    break;

                case "C":
                    System.out.println("Wpisz ID Klienta :");
                    int idKlienta = scanner.nextInt();
                    switch (cart.klientMenu()) {
                        case "1":
                            System.out.println("Wpisz ilosc biletow;");
                            int iloscKart = scanner.nextInt();
                            System.out.println("Wpisz ilosc punktow na kazdej karcie:");
                            int iloscPunktow = scanner.nextInt();
                            koszyk.add(new Cart(idKlienta,"Karta", iloscKart, karta.cenaZaKarte(iloscPunktow) * iloscKart));
                            System.out.println(koszyk.toString());
                            System.out.println("Karta dodana do koszyka!");
                            break;
                        case "2":
                            System.out.println("Wpisz czas w godzinach ;");
                            int iloscGodzin = scanner.nextInt();
                            System.out.println("Wybierz poziom zaawansowania :");
                            System.out.println("'1' = zaawansowany");
                            System.out.println("'2' = podstawowy");
                            String poziomZaawansowania = scanner.next();
                            if (poziomZaawansowania.equals("1")) {
                                koszyk.add(new Cart(idKlienta,"Instruktor", iloscGodzin, 100 * iloscGodzin));
                                System.out.println(koszyk.toString());
                                System.out.println("Instruktor Dodany!");
                            }
                            if (poziomZaawansowania.equals("2")) {
                                koszyk.add(new Cart(idKlienta,"Instruktor", iloscGodzin, 150 * iloscGodzin));
                                System.out.println(koszyk.toString());
                                System.out.println("Instruktor Dodany!");
                            }
                            break;
                        case "3":
                            sprzet.naszaLista();
                            System.out.println("Dostepne Sprzety:");
                            sprzet.wyswietlSprzet();
                            System.out.println("Wybierz sprzet za pomoca ID: ");
                            int idSprzetu = scanner.nextInt();
                            for (Sprzet sprzet1 : sprzet.getListaSprzetow()) {
                                if (sprzet1.getId() == idSprzetu) {
                                    koszyk.add(new Cart(idKlienta,"Sprzet", 1, sprzet1.getCenaSprzetu()));
                                    sprzet1.setDostepnoscSprzetu(false);
                                }
                            }
                            break;
                        case "4":

                            System.out.println("Twoj Koszyk Zawiera :");
                            System.out.println(koszyk.toString());
                            System.out.println("Cena za wszysko :");
                            double sum = 0;
                            for (Cart cart1 : koszyk) {
                                if (cart1.getId() == idKlienta)
                                sum += cart1.getPrice();
                            }
                            System.out.println(sum);
                            break;
                    }
                    break;
                case "E":
                    System.exit(1);
                default:
                    System.out.println("Zły wybór!");
                    break;
            }
        }
    }
}
