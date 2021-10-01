package projectakhirpbo;

import java.util.ArrayList;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;

public class Individu extends Nasabah {

    private LongProperty nik;
    private LongProperty npwp;

    public Individu(Integer idNasabah, String nama, String alamat, Long nik, Long npwp, ArrayList<Rekening> rekening) {
        super(idNasabah, nama, alamat, rekening);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }

    public Individu(Integer idNasabah, String nama, String alamat, Long nik, Long npwp, Rekening rek) {
        super(idNasabah, nama, alamat, rek);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }

    public Long getNik() {
        return nik.get();
    }

    public void setNik(Long nik) {
        this.nik.set(nik);
    }

    public Long getNpwp() {
        return npwp.get();
    }

    public void setNpwp(Long npwp) {
        this.npwp.set(npwp);
    }

    public LongProperty getNikProperty() {
        return nik;
    }

    public LongProperty getNpwpProperty() {
        return npwp;
    }

}
