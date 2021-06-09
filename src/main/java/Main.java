import java.util.*;

public class Main {
    public static void main(String[] args) {


        Kierownik kierownik = new Kierownik();
        List<Instruktor> listaInstruktorow = new LinkedList<>();

        List<Pracownik> listaPracownikow = new LinkedList<>();
        listaPracownikow.add(new Pracownik(1,"Jan","Kowalski"));
        listaPracownikow.add(new Pracownik(2,"Andrzej","Nowak"));
        listaPracownikow.add(new Pracownik(3,"Tadeusz","Kaleta"));
        listaPracownikow.add(new Pracownik(4,"Stefan","Drab"));

        List<Sprzet> listaSprzetow = new LinkedList<>();
        listaSprzetow.add(new Sprzet(1,"Salomon",29.99,"Kask",true));
        listaSprzetow.add(new Sprzet(2,"Salomon",50.00,"Narty",true));
        listaSprzetow.add(new Sprzet(3,"Salomon",29.99,"Buty Narciarskie",true));
        listaSprzetow.add(new Sprzet(4,"Salomon",35.00,"Buty Snowboardowe",true));
        listaSprzetow.add(new Sprzet(5,"Salomon",60.00,"Snowboard",true));
        listaSprzetow.add(new Sprzet(6,"Rossignol",29.99,"Kask",true));
        listaSprzetow.add(new Sprzet(7,"Rossignol",45.00,"Narty",true));
        listaSprzetow.add(new Sprzet(8,"Rossignol",24.99,"Buty Narciarskie",true));
        listaSprzetow.add(new Sprzet(9,"Rossignol",14.99,"Kijki",true));

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello! Press 'Enter' to continue..");
//        while (scanner.hasNext()){
//            System.out.println("'U'=uzytkownik , 'K'= kierownik , 'P'=pracownik");
//            String wybierzUzytkownika= scanner.nextLine();
//            if (wybierzUzytkownika.equals(wybierzUzytkownika)) {
//                System.out.println("Witaj Kierowniku, co bedziesz robil:");
//                System.out.println("Dodac nowy sprzet:'1'");
//                System.out.println("Usunac sprzet: '2'");
//                System.out.println("Dodac nowego pracownika:'3");
//                System.out.println("Usunac pracownika:'4");
//                String wybirzOpcje = scanner.next();
//                switch (wybirzOpcje){
//                    case "1":
//                        kierownik.DodajNowySprzet(listaSprzetow);
//                        System.out.println("Sprzet dodany!");
//                        break;
//                    case "2":
//                        kierownik.UsunSprzet(listaSprzetow);
//                        System.out.println("Sprzet usuniety!");
//                        break;
//                    case "3":
//                        kierownik.DodajPracownika(listaPracownikow);
//                        System.out.println("Pracownik dodany!");
//                        break;
//                    case "4":
//                        kierownik.UsunPracownika(listaPracownikow);
//                        System.out.println("Pracownik usuniety");
//                    case "5":
//                        kierownik.DodajNowegoInstruktora(listaInstruktorow);
//                        System.out.println("Instruktor dodany!");
//                        break;
//                    case "6":
//                        kierownik.UsunInstruktora(listaInstruktorow);
//                        System.out.println("Instruktor usuniety" +
//                                "!");
//                        break;
//                }
//            }
//
//        }


    }
}
