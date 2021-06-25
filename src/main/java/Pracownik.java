import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Pracownik {

    private int IdPracownika;
    private String ImiePracownika;
    private String NazwiskoPracownika;


    Sprzet sprzet = new Sprzet();

    public void DodajNowegoKlienta(List<Klient> listaKlientow){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ID Klienta:");
            int IntIDKlienta = scan.nextInt();
        System.out.println("Podaj ID Karty:");
            int IntIDKarty = scan.nextInt();
        System.out.println("Podaj imie klienta:");
            String imieKlienta = scan.next();
        System.out.println("Podaj nazwisko klienta:");
            String nazwiskoKlienta = scan.next();
        scan.close();
 main

        listaKlientow.add(new Klient(IntIDKlienta, IntIDKarty,imieKlienta,nazwiskoKlienta));
    }

    public void PrzypiszKarteDoKlienta(List<Karta> listaKart, List<Klient> listaKlientow){
        LocalTime now = LocalTime.now();
        Scanner scan = new Scanner(System.in);

            System.out.println("Wybierz typ Karty");
            System.out.println("Karta Czasowa:1");
            System.out.println("Karta Punktowa:2");
            int wyborKarty = scan.nextInt();
            if (wyborKarty == 1){
                System.out.println("Podaj ilość minut");
                int iloscMinut = scan.nextInt();
                int numerKarty = listaKart.size() -1;

                listaKart.add(new KartaCzas());

            }

            for (Klient Klient : listaKlientow){
                String imieKlienta = Klient.getImieKlienta();
                String nazwiskoKlienta = Klient.getNazwiskoKlienta();
                int IDKarty = Klient.getIDKarty();
                int IDKlienta = Klient.getIDKlienta();
                System.out.println("imie: " + imieKlienta+" nazwisko: "+nazwiskoKlienta+" IDKarty: "+IDKarty+" IDKlienta: "+IDKlienta+"%n");

            }


        scan.close();
    }

    public void PrzeprowadzPlatnosc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy klient zaplacil?('T' lub 'N'");
        while(!scanner.hasNext("T")){
            System.out.println("Pzepowadz Platnosc");
            scanner.next();
        }
        System.out.println("Platnosc `zatwierdzona");
    }

    public void SprawdzDostepneSprzety(List<Sprzet> listaSprzetow){

    }

    public void WypozyczSprzet(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz ID sprzetu : ");

        int idSprzetu = scanner.nextInt();

        for (Sprzet sprzet : sprzet.naszaLista()){
            if (sprzet.getId()==idSprzetu){
                sprzet.setDostepnoscSprzetu(false);
            }
        }
    }
    public void PrzyjmijZwrotSprzetu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz ID sprzetu do zwrocenia : ");

        int idSprzetu = scanner.nextInt();

        for (Sprzet sprzet : sprzet.naszaLista()){
            if (sprzet.getId()==idSprzetu){
                sprzet.setDostepnoscSprzetu(true);
            }
        }

    }
    public void UsunWpisZTerminarza(){

    }
    public void ZobaczZarezerwowaneLekcje(){

    }

    public void DodajDoZamowienia(){

 
    }


    public Pracownik(int idPracownika, String imiePracownika, String nazwiskoPracownika) {
        IdPracownika = idPracownika;
        ImiePracownika = imiePracownika;
        NazwiskoPracownika = nazwiskoPracownika;
    }

    public Pracownik() {
    }

    public int getIdPracownika() {
        return IdPracownika;
    }

    public Pracownik setIdPracownika(int idPracownika) {
        IdPracownika = idPracownika;
        return this;
    }

    public String getImiePracownika() {
        return ImiePracownika;
    }

    public Pracownik setImiePracownika(String imiePracownika) {
        ImiePracownika = imiePracownika;
        return this;
    }

    public String getNazwiskoPracownika() {
        return NazwiskoPracownika;
    }

    public Pracownik setNazwiskoPracownika(String nazwiskoPracownika) {
        NazwiskoPracownika = nazwiskoPracownika;
        return this;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "IdPracownika=" + IdPracownika +
                ", ImiePracownika='" + ImiePracownika + '\'' +
                ", NazwiskoPracownika='" + NazwiskoPracownika + '\'' +
                '}';
    }
}
