public class Information {
    private int dniPracujace;
    private double godzinyWdniSwiateczne;
    private int urlop;
    private int zwolnieneLekarskie;
    private int zwolnieneLekarskieWswieta;

    public Information() {
    }

    public Information(int dniPracujace, double godzinyWdniSwiateczne, int urlop, int zwolnieneLekarskie,
                       int zwolnieneLekarskieWswieta) {
        this.dniPracujace = dniPracujace;
        this.godzinyWdniSwiateczne = godzinyWdniSwiateczne;
        this.urlop = urlop;
        this.zwolnieneLekarskie = zwolnieneLekarskie;
        this.zwolnieneLekarskieWswieta = zwolnieneLekarskieWswieta;
    }

    public int getDniPracujace() {
        return dniPracujace;
    }

    public void setDniPracujace(int dniPracujace) {
        this.dniPracujace = dniPracujace;
    }

    public double getGodzinyWdniSwiateczne() {
        return godzinyWdniSwiateczne;
    }

    public void setGodzinyWdniSwiateczne(double godzinyWdniSwiateczne) {
        this.godzinyWdniSwiateczne = godzinyWdniSwiateczne;
    }

    public int getUrlop() {
        return urlop;
    }

    public void setUrlop(int urlop) {
        this.urlop = urlop;
    }

    public int getZwolnieneLekarskie() {
        return zwolnieneLekarskie;
    }

    public void setZwolnieneLekarskie(int zwolnieneLekarskie) {
        this.zwolnieneLekarskie = zwolnieneLekarskie;
    }

    public int getZwolnieneLekarskieWswieta() {
        return zwolnieneLekarskieWswieta;
    }

    public void setZwolnieneLekarskieWswieta(int zwolnieneLekarskieWswieta) {
        this.zwolnieneLekarskieWswieta = zwolnieneLekarskieWswieta;
    }

    @Override
    public String toString() {
        return
                "dni pracujace=" + dniPracujace +
                ", przepracowane godziny w dni swiateczne=" + godzinyWdniSwiateczne +"h"+
                ",ilosc dni urlopu=" + urlop +
                ", zwolniene lekarskie w dni powszednie =" + zwolnieneLekarskie +
                ", zwolniene lekarskie w dni swiateczne=" + zwolnieneLekarskieWswieta ;
    }
}
