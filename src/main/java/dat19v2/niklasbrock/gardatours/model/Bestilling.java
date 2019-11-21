package dat19v2.niklasbrock.gardatours.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;

public class Bestilling {
    private Kunde kunde;
    @Max(1)
    private Rute rute;
    @Max(10)
    private int antal;
    private int pris;
    private int totalpris;

    public Bestilling(Kunde kunde, @Max(1) Rute rute, @Max(10) int antal) {
        this.kunde = kunde;
        this.rute = rute;
        this.antal = antal;
        this.pris = rute.getPris();
        this.totalpris = antal * rute.getPris();
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getTotalpris() {
        return totalpris;
    }

    public void setTotalpris(int totalpris) {
        this.totalpris = totalpris;
    }
}
