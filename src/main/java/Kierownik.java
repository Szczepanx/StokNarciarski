import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kierownik extends Pracownik{

    public Kierownik(int idPracownika, String imiePracownika, String nazwiskoPracownika) {
        super(idPracownika, imiePracownika, nazwiskoPracownika);
    }

    public Kierownik() {
    }

    public double UstalNowaCeneWypozyczeniaSprzetu(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public List<Sprzet> DodajNowySprzet(List<Sprzet> listaSprzetow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID sprzetu:");
        int idSprzetu = scanner.nextInt();
        System.out.println("Producent sprzetu:");
        String producent = scanner.next();
        System.out.println("Cena sprzetu:");
        double cenaSprzetu = UstalNowaCeneWypozyczeniaSprzetu();
        System.out.println("Typ sprzetu:");
        String typSprzetu = scanner.next();
        System.out.println("Dostepnosc sprzetu (true,false):");
        boolean dostepnoscSprzetu = scanner.nextBoolean();
        listaSprzetow.add(new Sprzet(idSprzetu,producent,cenaSprzetu,typSprzetu,dostepnoscSprzetu));
        System.out.println(listaSprzetow);
        return listaSprzetow;
    }
    public List<Sprzet> UsunSprzet(List<Sprzet>listaSprzetow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr z listy :");
        int idDoUsuniecia = scanner.nextInt();
        listaSprzetow.remove(idDoUsuniecia-1);
        System.out.println(listaSprzetow);
        return listaSprzetow;
    }
    public List<Instruktor> DodajNowegoInstruktora(List<Instruktor> listaInstruktorow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id instruktora:");
        int idInstruktora = scanner.nextInt();
        System.out.println("Imie:");
        String imieInstruktora = scanner.next();
        System.out.println("Nazwsko:");
        String nazwiskoInstruktora = scanner.next();
        System.out.println("Poziom zaawansowania:");
        String poziomZaawansowania = scanner.next();
        System.out.println("Typ instruktora :");
        String typInstruktora = scanner.next();
        listaInstruktorow.add(new Instruktor(idInstruktora,imieInstruktora,nazwiskoInstruktora,poziomZaawansowania, typInstruktora,UstalCeneLekcjiInstruktora()));
        System.out.println(listaInstruktorow);
        return listaInstruktorow;
    }
    public List<Instruktor> UsunInstruktora(List<Instruktor> listaInstruktorow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr instruktora do usuniecia :");
        int idistruktoraDoUsuniecia = scanner.nextInt();
        listaInstruktorow.remove(idistruktoraDoUsuniecia-1);
        System.out.println(listaInstruktorow);
        return listaInstruktorow;
    }
    public double UstalCeneLekcjiInstruktora(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
    public List<Pracownik> DodajPracownika(List<Pracownik> listaPracownikow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id pracownika :");
        int idPracownika = scanner.nextInt();
        System.out.println("Imie:");
        String imiePracownika = scanner.next();
        System.out.println("Nazwisko:");
        String nazwiskoPracownika= scanner.next();

        listaPracownikow.add(new Pracownik(idPracownika,imiePracownika,nazwiskoPracownika));
        System.out.println(listaPracownikow);
        return listaPracownikow;


    }
    public List<Pracownik> UsunPracownika(List<Pracownik> listaPracownikow){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr pracownika do usuniecia:");
        int idPracownikaDoUsuniecia = scanner.nextInt();
        listaPracownikow.remove(idPracownikaDoUsuniecia-1);
        System.out.println(listaPracownikow);
        return listaPracownikow;

    }
    public double UstalCeneZaNaliczanyCzas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cene :");
        double cenaZaCzas = scanner.nextDouble();
        return cenaZaCzas;

    }
    public double UstalCeneZaNaliczonePunkty(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cene :");
        double cenaZaPunkty = scanner.nextDouble();
        return cenaZaPunkty;
    }
}
