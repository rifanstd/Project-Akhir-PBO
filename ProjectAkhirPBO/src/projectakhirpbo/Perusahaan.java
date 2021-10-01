
package projectakhirpbo;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Perusahaan extends Nasabah{
    private StringProperty nib;

    public Perusahaan(Integer idNasabah, String nama, String alamat, String nib, ArrayList<Rekening> rekening) {
        super(idNasabah, nama, alamat, rekening);
        this.nib = new SimpleStringProperty(nib);
    }
    
    public Perusahaan(Integer idNasabah, String nama, String alamat, String nib, Rekening rek) {
        super(idNasabah, nama, alamat, rek);
        this.nib = new SimpleStringProperty(nib);
    }
    
    public String getNib() {
        return nib.get();
    }

    public void setNib(String nib) {
        this.nib.set(nib);
    }
    
    public StringProperty getNibProperty() {
        return nib;
    }
    
}
