import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

class SprzetTest {

    @Test
    void naszaLista() {
        Sprzet sprzet = new Sprzet();
        List<Sprzet> list = sprzet.naszaLista();
        List<Sprzet> testList = new LinkedList<>();
        testList.add(new Sprzet(1, "Salomon", 29.99, "Kask", true));
        testList.add(new Sprzet(2, "Salomon", 50.00, "Narty", true));
        testList.add(new Sprzet(3, "Salomon", 29.99, "Buty Narciarskie", true));
        testList.add(new Sprzet(4, "Salomon", 35.00, "Buty Snowboardowe", true));
        testList.add(new Sprzet(5, "Salomon", 60.00, "Snowboard", true));
        testList.add(new Sprzet(6, "Rossignol", 29.99, "Kask", true));
        testList.add(new Sprzet(7, "Rossignol", 45.00, "Narty", true));
        testList.add(new Sprzet(8, "Rossignol", 24.99, "Buty Narciarskie", true));
        testList.add(new Sprzet(9, "Rossignol", 14.99, "Kijki", true));
        assertEquals(testList , list);
    }

    @Test
    void dodajSprzet() {
        Sprzet sprzet =new Sprzet();
        List<Sprzet>testList = new LinkedList<>();
        sprzet.dodajSprzet(new Sprzet(1,"e",2,"2",true));
        testList.add(new Sprzet(1,"e",2,"2",true));

        assertEquals(sprzet.getListaSprzetow(),testList);
    }

}