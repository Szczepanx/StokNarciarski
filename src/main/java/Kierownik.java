import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kierownik extends Pracownik{

    public Kierownik(int idPracownika, String imiePracownika, String nazwiskoPracownika) {
        super(idPracownika, imiePracownika, nazwiskoPracownika);
    }

    public double UstalNowaCeneWypozyczeniaSprzetu(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public List<Sprzet> DodajNowySprzet(){
        Scanner scanner = new Scanner(System.in);
        int idSprzetu = scanner.nextInt();
        String producent = scanner.nextLine();
        double cenaSprzetu = UstalNowaCeneWypozyczeniaSprzetu();
        String typSprzetu = scanner.nextLine();
        boolean dostepnoscSprzetu = scanner.nextBoolean();
        List<Sprzet> listaSprzetow = new ArrayList<>();
        listaSprzetow.add(new Sprzet(idSprzetu,producent,cenaSprzetu,typSprzetu,dostepnoscSprzetu));
        return listaSprzetow;
    }
    public List<Sprzet> UsunSprzet(){
        Scanner scanner = new Scanner(System.in);
        int idDoUsuniecia = scanner.nextInt();
        List <Sprzet> listaSprzetow = DodajNowySprzet();
        listaSprzetow.remove(idDoUsuniecia);
        return listaSprzetow;
    }
    public List<Instruktor> DodajNowegoInstruktora(){
        Scanner scanner = new Scanner(System.in);
        String imieInstruktora = scanner.nextLine();
        String nazwiskoInstruktora = scanner.nextLine();
        String poziomZaawansowania = scanner.nextLine();
        String typInstruktora = scanner.nextLine();
        List<Instruktor> listaInstruktorow = new ArrayList<>();
        listaInstruktorow.add(new Instruktor(imieInstruktora,nazwiskoInstruktora,poziomZaawansowania, typInstruktora,UstalCeneLekcjiInstruktora()));
        return listaInstruktorow;
    }
    public List<Instruktor> UsunInstruktora(){
        Scanner scanner = new Scanner(System.in);
        String nazwiskoInstruktoraDoUsuniecia = scanner.nextLine();
        List<Instruktor> listaInstruktorow = DodajNowegoInstruktora();
        listaInstruktorow.remove(nazwiskoInstruktoraDoUsuniecia);
        return listaInstruktorow;
    }
    public double UstalCeneLekcjiInstruktora(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
    public List<Pracownik> DodajPracownika(){
        Scanner scanner = new Scanner(System.in);
        int idPracownika = scanner.nextInt();
        String imiePracownika = scanner.nextLine();
        String nazwiskoPracownika= scanner.nextLine();
        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik(idPracownika,imiePracownika,nazwiskoPracownika));
        return listaPracownikow;


    }
    public List<Pracownik> UsunPracownika(){
        Scanner scanner = new Scanner(System.in);
        int idPracownikaDoUsuniecia = scanner.nextInt();
        List<Pracownik> listaPracownikow = DodajPracownika();
        listaPracownikow.remove(idPracownikaDoUsuniecia+1);
        return listaPracownikow;

    }
    public double UstalCeneZaNaliczanyCzas(){
        Scanner scanner = new Scanner(System.in);
        double cenaZaCzas = scanner.nextDouble();
        return cenaZaCzas;

    }
    public double UstalCeneZaNaliczonePunkty(){
        Scanner scanner = new Scanner(System.in);
        double cenaZaPunkty = scanner.nextDouble();
        return cenaZaPunkty;
    }
}
