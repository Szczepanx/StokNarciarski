public class Instruktor {

    private String PoziomZaawansowania;
    private String TypInstruktora;
    private double CenaInstruktora;

    public Instruktor(String poziomZaawansowania, String typInstruktora, double cena) {
        PoziomZaawansowania = poziomZaawansowania;
        TypInstruktora = typInstruktora;
        CenaInstruktora = cena;
    }

    public Instruktor() {
    }

    public String getPoziomZaawansowania() {
        return PoziomZaawansowania;
    }

    public Instruktor setPoziomZaawansowania(String poziomZaawansowania) {
        PoziomZaawansowania = poziomZaawansowania;
        return this;
    }

    public String getTypInstruktora() {
        return TypInstruktora;
    }

    public Instruktor setTypInstruktora(String typInstruktora) {
        TypInstruktora = typInstruktora;
        return this;
    }

    public double getCena() {
        return CenaInstruktora;
    }

    public Instruktor setCena(double cena) {
        CenaInstruktora = cena;
        return this;
    }

    @Override
    public String toString() {
        return "Instruktor{" +
                "PoziomZaawansowania='" + PoziomZaawansowania + '\'' +
                ", TypInstruktora='" + TypInstruktora + '\'' +
                ", Cena=" + CenaInstruktora +
                '}';
    }
}
