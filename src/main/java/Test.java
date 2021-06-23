public class Test {
    public static void main(String[] args) {
        Sprzet sprzet = new Sprzet();
        sprzet.dodajSprzet(new Sprzet(1,"ds",3,"d",true));

        sprzet.naszaLista();

        sprzet.dodajSprzet(new Sprzet(32,"32",43,"43",true));

        sprzet.wyswietlSprzet();

    }
}
