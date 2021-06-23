import java.util.*;

public class MainController {

    private static Kierownik kierownik;
    private static Sprzet sprzet;
    static Pracownik pracownik = new Pracownik();
    static List<Kierownik> listaKierowników = new ArrayList<Kierownik>();      //Kierownik
    static List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();      //Pracownik
    List<Instruktor> listaInstruktorow = new ArrayList<Instruktor>();          //Instruktor
    static List<Klient> listaKlientow = new ArrayList<Klient>();               //Klient
    static List<Sprzet> listaSprzetow = new ArrayList<Sprzet>();          //Sprzet
    static List<Karta> listaKart = new ArrayList<Karta>();                 //Karta



    public static void clearScreen() {
        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
    }

    public static String WyborUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        //clearScreen();
        System.out.println("Wybierz użytkownika: ");
        //System.out.println("  'U' = uzytkownik");
        System.out.println("  'K' = kierownik");
        System.out.println("  'P' = pracownik");
        String wybierzUzytkownika = scanner.next();
        return wybierzUzytkownika;
    }

    public static int showMenuKierownik() {
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("Witaj Kierowniku, co bedziesz robil:");
        System.out.println("Dodac nowy sprzet:'1'");
        System.out.println("Dodac nowego pracownika:'2");
        System.out.println("Wroc do poprzedniego menu:'0");
        int wyborMenu = scanner.nextInt();
        System.out.println(wyborMenu);
        return wyborMenu;
    }

    public static void MenuKierownik(int i){
        switch(i) {
            case 1:
                break;
            case 2:
                // code block
                break;
            default:
                Start();
        }
    }

    public static int showMenuPracownik(){
        Scanner scanner = new Scanner(System.in);

        //clearScreen();
        System.out.println("DodajNowegoKlienta:1");
        System.out.println("PrzypiszKarteDoKlienta:2");
        System.out.println("PrzeprowadzPlatnosc:3");
        System.out.println("SprawdzDostepneSprzety:4");
        System.out.println("WypozyczSprzet:5");
        System.out.println("PrzyjmijZwrotSprzetu:6");
        System.out.println("ZarezerwujLekcjeUInstruktora:7");
        System.out.println("ZobaczZarezerwowaneLekcje:8");
        System.out.println("Wroc do poprzedniego menu:'0");
        int wyborMenu = scanner.nextInt();
        return wyborMenu;
    }

    public static void MenuPracownik(int wyborMenu){
        switch(wyborMenu) {
            case 1:
                pracownik.DodajNowegoKlienta(listaKlientow);
                break;
            case 2:
                pracownik.PrzypiszKarteDoKlienta(listaKart, listaKlientow);
                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
                break;
            case 5:
                // code block
                break;
            case 6:
                // code block
                break;
            case 7:
                // code block
                break;
            case 8:
                // code block
                break;
            default:
                Start();
        }
    }

    public static void Start() {
        System.out.println("Siemka dawaj");
        String Uzytkownik = WyborUzytkownika();

        if(Uzytkownik.equals("P")){
            System.out.println("If po wybraniu Pracownika");
            MenuPracownik(showMenuPracownik());
            System.out.println("PO metodzie wybor pracownika");
        }
        else if(Uzytkownik.equals("K")) {
            MenuKierownik(showMenuKierownik());
        }
    }

    public static void main(String[] args) {
        listaPracownikow.add(new Pracownik(1, "Jan", "Kowalski"));
        listaPracownikow.add(new Pracownik(2, "Andrzej", "Nowak"));
        listaPracownikow.add(new Pracownik(3, "Tadeusz", "Kaleta"));
        listaPracownikow.add(new Pracownik(4, "Stefan", "Drab"));
        listaKlientow.add(new Klient(1,1,"Jan","Kowalski"));
        listaKierowników.add(new Kierownik(5,"Janusz","Bela"));
        listaSprzetow.add(new Sprzet(1, "Salomon", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(2, "Salomon", 50.00, "Narty", true));
        listaSprzetow.add(new Sprzet(3, "Salomon", 29.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(4, "Salomon", 35.00, "Buty Snowboardowe", true));
        listaSprzetow.add(new Sprzet(5, "Salomon", 60.00, "Snowboard", true));
        listaSprzetow.add(new Sprzet(6, "Rossignol", 29.99, "Kask", true));
        listaSprzetow.add(new Sprzet(7, "Rossignol", 45.00, "Narty", true));
        listaSprzetow.add(new Sprzet(8, "Rossignol", 24.99, "Buty Narciarskie", true));
        listaSprzetow.add(new Sprzet(9, "Rossignol", 14.99, "Kijki", true));
        Start();
    }
}
