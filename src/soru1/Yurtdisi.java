package soru1;

public class Yurtdisi extends Malzeme {

    private String plaka;
    private boolean Cekici;
    private boolean dorse;

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public boolean isCekici() {
        return Cekici;
    }

    public void setCekici(boolean cekici) {
        Cekici = cekici;
    }

    public boolean isDorse() {
        return dorse;
    }

    public void setDorse(boolean dorse) {
        this.dorse = dorse;
    }



    @Override
    public String toString() {
        return "Yurtdisi{" +
                "plaka='" + plaka + '\'' +
                ", Cekici=" + Cekici +
                ", dorse=" + dorse +
                '}';
    }

    public Yurtdisi() {
    }
}