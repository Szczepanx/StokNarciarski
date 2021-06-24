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
                System.out.println(sprzet);
                return sprzet;
            }
        }
        return null;
    }
    public static String WyborUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("'U'=uzytkownik , 'K'= kierownik , 'P'=pracownik");
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

        System.out.println(localDateTime.plus(30, ChronoUnit.MINUTES));
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();


        Kierownik kierownik = new Kierownik();
        Pracownik pracownik = new Pracownik();
        List<Instruktor> listaInstruktorow = new LinkedList<>();

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

        System.out.println(findUsingEnhancedForLoop("Rossignol" ,listaSprzetow));



        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("dupa")) {

            if (WyborUzytkownika().equals("K")) {
                KierownikMenu();
                while (!scanner.hasNext("exit")) {
                    String wybirzOpcje = scanner.next();
                    if (wybirzOpcje.equals("1")) {
                        kierownik.DodajNowySprzet(listaSprzetow);
                        System.out.println("Sprzet dodany!");
                    } else if (wybirzOpcje.equals("2")) {
                        kierownik.UsunSprzet(listaSprzetow);
                        System.out.println("Sprzet usuniety!");
                    } else if (wybirzOpcje.equals("3")) {
                        kierownik.DodajPracownika(listaPracownikow);
                        System.out.println("Pracownik dodany!");
                    } else if (wybirzOpcje.equals("4")) {
                        kierownik.UsunPracownika(listaPracownikow);
                        System.out.println("Pracownik usuniety");
                    } else if (wybirzOpcje.equals("5")) {
                        kierownik.DodajNowegoInstruktora(listaInstruktorow);
                        System.out.println("Instruktor dodany!");
                    } else if (wybirzOpcje.equals("6")) {
                        kierownik.UsunInstruktora(listaInstruktorow);
                        System.out.println("Instruktor usuniety" +
                                "!");
                    }
                }


            } else if (WyborUzytkownika().equals("P")) {
                PracownikMenu();
                String wybierzOpcje = scanner.next();
                switch (wybierzOpcje) {
                    case "1":
                        pracownik.DodajNowegoKlienta(listaKlientow);
                        System.out.println("Dodano Nowego Klienta!");
                        break;
                    case "2":
                        pracownik.PrzypiszKarteDoKlienta();
                        System.out.println("Przypisano Karte Do Klienta!");
                        break;
                    case "3":
                        pracownik.PrzeprowadzPlatnosc();
                        System.out.println("Przeprowadzono Platnosc:");
                        break;
                    case "4":
                        pracownik.SprawdzDostepneSprzety(listaSprzetow);
                        System.out.println("Oto Sprzety!");
                    case "5":
                        pracownik.WypozyczSprzet();
                        System.out.println("Wypozyczono  Sprzet");
                        break;
                    case "6":
                        pracownik.PrzyjmijZwrotSprzetu();
                        System.out.println("Przyjmijeto Zwrot sprzetu!");
                        break;

                    case "8":
                        pracownik.UsunWpisZTerminarza();
                        System.out.println("Usunieto wpis z terminarza:");
                        break;
                    case "9":
                        pracownik.ZobaczZarezerwowaneLekcje();
                        System.out.println("Zarezerwowane lekcje!");
                        break;
                    case "10":
                        pracownik.PodliczKoszty();
                        System.out.println("Tyle wyszlo!");
                        break;
                    default:WyborUzytkownika();
                }
            } else if (WyborUzytkownika().equals("U")) {
            }

        }
    }
}
