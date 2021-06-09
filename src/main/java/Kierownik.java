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
    public List<Sprzet> DodajNowySprzet(List<Sprzet> listaSprzetow){
        Scanner scanner = new Scanner(System.in);
        int idSprzetu = scanner.nextInt();
        String producent = scanner.nextLine();
        double cenaSprzetu = UstalNowaCeneWypozyczeniaSprzetu();
        String typSprzetu = scanner.nextLine();
        boolean dostepnoscSprzetu = scanner.nextBoolean();
        listaSprzetow.add(new Sprzet(idSprzetu,producent,cenaSprzetu,typSprzetu,dostepnoscSprzetu));
        return listaSprzetow;
    }
    public List<Sprzet> UsunSprzet(List<Sprzet>listaSprzetow){
        Scanner scanner = new Scanner(System.in);
        int idDoUsuniecia = scanner.nextInt();
        listaSprzetow.remove(idDoUsuniecia+1);
        return listaSprzetow;
    }
    public List<Instruktor> DodajNowegoInstruktora(List<Instruktor> listaInstruktorow){
        Scanner scanner = new Scanner(System.in);
        int idInstruktora = scanner.nextInt();
        String imieInstruktora = scanner.nextLine();
        String nazwiskoInstruktora = scanner.nextLine();
        String poziomZaawansowania = scanner.nextLine();
        String typInstruktora = scanner.nextLine();
        listaInstruktorow.add(new Instruktor(idInstruktora,imieInstruktora,nazwiskoInstruktora,poziomZaawansowania, typInstruktora,UstalCeneLekcjiInstruktora()));
        return listaInstruktorow;
    }
    public List<Instruktor> UsunInstruktora(List<Instruktor> listaInstruktorow){
        Scanner scanner = new Scanner(System.in);
        int idistruktoraDoUsuniecia = scanner.nextInt();
        listaInstruktorow.remove(idistruktoraDoUsuniecia+1);
        return listaInstruktorow;
    }
    public double UstalCeneLekcjiInstruktora(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
    public List<Pracownik> DodajPracownika(List<Pracownik> listaPracownikow){
        Scanner scanner = new Scanner(System.in);
        int idPracownika = scanner.nextInt();
        String imiePracownika = scanner.nextLine();
        String nazwiskoPracownika= scanner.nextLine();

        listaPracownikow.add(new Pracownik(idPracownika,imiePracownika,nazwiskoPracownika));
        return listaPracownikow;


    }
    public List<Pracownik> UsunPracownika(List<Pracownik> listaPracownikow){
        Scanner scanner = new Scanner(System.in);
        int idPracownikaDoUsuniecia = scanner.nextInt();
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
