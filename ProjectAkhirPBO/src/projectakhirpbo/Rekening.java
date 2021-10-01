
package projectakhirpbo;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Rekening {
     private IntegerProperty noRekening;
    private DoubleProperty saldo;

    public Rekening(int noRekening, double saldo) {
        this.noRekening = new SimpleIntegerProperty(noRekening);
        this.saldo = new SimpleDoubleProperty(saldo);
    }

    public Integer getNoRekening() {
        return noRekening.get();
    }

    public void setNoRekening(Integer noRekening) {
        this.noRekening.set(noRekening);
    }

    public Double getSaldo() {
        return saldo.get();
    }

    public void setSaldo(Double saldo) {
        this.saldo.set(saldo);
    }
    
    public IntegerProperty getNoRekeningProperty() {
        return noRekening;
    }
    
    public DoubleProperty getSaldoProperty() {
        return saldo;
    }
    
    public void tambahSaldo(double jumlah){
        if (jumlah >= 0){
            this.setSaldo(this.getSaldo()+jumlah);
        }
    }
    
    public void tarikTunai(double jumlah){
        if (this.saldo.get() >= jumlah){
            this.saldo.set(this.saldo.get()-jumlah);
        }
    }
}
