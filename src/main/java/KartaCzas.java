public class KartaCzas extends Karta {
    private int DataRoz;
    private int CzasRoz;
    private int CenaZaMinute = 1;

    public KartaCzas() {
    }

    public KartaCzas(int dataRoz, int czasRoz) {
        DataRoz = dataRoz;
        CzasRoz = czasRoz;
    }

    public int getCenaZaMinute() {
        return CenaZaMinute;
    }

    public void setCenaZaMinute(int cenaZaMinute) {
        CenaZaMinute = cenaZaMinute;
    }

    public int getDataRoz() {
        return DataRoz;
    }

    public Karta setDataRoz(int DataRoz) {
        this.DataRoz = DataRoz;
        return this;
    }

    public int getCzasRoz() {
        return CzasRoz;
    }

    public Karta setCzasRoz(int CzasRoz) {
        this.CzasRoz = CzasRoz;
        return this;
    }

    @Override
    public String toString() {
        return "KartaPkt{" +
                "ID Karty='" + IDKarty + '\'' +
                "Data Roz='" + DataRoz + '\'' +
                "Czas Roz='" + CzasRoz + '\'' +
                '}';
    }
}
