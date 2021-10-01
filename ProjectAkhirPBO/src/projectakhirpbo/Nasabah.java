package projectakhirpbo;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Nasabah {

    protected IntegerProperty idNasabah;
    protected StringProperty nama;
    protected StringProperty alamat;
    protected ArrayList<Rekening> rekening;

    public Nasabah(Integer idNasabah, String nama, String alamat, ArrayList<Rekening> rekening) {
        this.idNasabah = new SimpleIntegerProperty(idNasabah);
        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening = rekening;
    }

    public Nasabah(Integer idNasabah, String nama, String alamat, Rekening rek) {
        rekening = new ArrayList<>();
        this.idNasabah = new SimpleIntegerProperty(idNasabah);
        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening.add(rek);
    }

    public Integer getIdNasabah() {
        return idNasabah.get();
    }

    public void setIdNasabah(Integer idNasabah) {
        this.idNasabah.set(idNasabah);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat.set(alamat);
    }

    public ArrayList<Rekening> getRekening() {
        return rekening;
    }

    public void setRekening(ArrayList<Rekening> rekening) {
        this.rekening = rekening;
    }

    public IntegerProperty getIdNasabahProperty() {
        return idNasabah;
    }

    public StringProperty getNamaProperty() {
        return nama;
    }

    public StringProperty getAlamatProperty() {
        return alamat;
    }

    public void tambahRekening(Rekening rek) {
        this.getRekening().add(rek);
    }
}
