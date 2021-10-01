
package projectakhirpbo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NasabahFormController implements Initializable {

    @FXML
    private TextField tfIDNasabahIndividu;

    @FXML
    private TextField tfNamaIndividu;

    @FXML
    private TextField tfAlamatIndividu;

    @FXML
    private TextField tfNikIndividu;

    @FXML
    private TextField tfNpwpIndividu;

    @FXML
    private TextField tfNoRekeningIndividu;

    @FXML
    private TextField tfSaldoIndividu;

    @FXML
    private Button btnTambahAkunNasabahIndividu;

    @FXML
    private Button btnMuatUlangIndividu;

    @FXML
    private Button btnBersihkanIndividu;

    @FXML
    private Label lbSimpanStatusIndividu;

    @FXML
    private TableView<?> tblNasabahIndividu;

    @FXML
    private TableColumn<?, ?> colIDNasabahIndividu;

    @FXML
    private TableColumn<?, ?> colNamaIndividu;

    @FXML
    private TableColumn<?, ?> colAlamatIndividu;

    @FXML
    private TableColumn<?, ?> colNikIndividu;

    @FXML
    private TableColumn<?, ?> colNpwpIndividu;

    @FXML
    private TableView<?> tblRekeningIndividu;

    @FXML
    private TableColumn<?, ?> colNoRekeningIndividu;

    @FXML
    private TableColumn<?, ?> colSaldoIndividu;

    @FXML
    private TextField tfNewIDNasabahIndividu;

    @FXML
    private TextField tfNewNoRekeningIndividu;

    @FXML
    private TextField tfNewSaldoIndividu;

    @FXML
    private Button btnNewTambahAkunIndividu;

    @FXML
    private TextField tfJumlahTransaksiIndividu;

    @FXML
    private Button btnDepositIndividu;

    @FXML
    private Button btnWithdrawIndividu;

    @FXML
    private Label lbStatusTransaksiIndividu;

    @FXML
    private TextField tfIDNasabahPerusahaan;

    @FXML
    private TextField tfNamaPerusahaan;

    @FXML
    private TextField tfAlamatPerusahaan;

    @FXML
    private TextField tfNibPerusahaan;

    @FXML
    private TextField tfNoRekeningPerusahaan;

    @FXML
    private TextField tfSaldoPerusahaan;

    @FXML
    private Button btnTambahAkunNasabahPerusahaan;

    @FXML
    private Button btnMuatUlangPerusahaan;

    @FXML
    private Button btnBersihkanPerusahaan;

    @FXML
    private Label lbSimpanStatusPerusahaan;

    @FXML
    private TableView<?> tblNasabahPerusahaan;

    @FXML
    private TableColumn<?, ?> colIDNasabahPerusahaan;

    @FXML
    private TableColumn<?, ?> colNamaPerusahaan;

    @FXML
    private TableColumn<?, ?> colAlamatPerusahaan;

    @FXML
    private TableColumn<?, ?> colNibPerusahaan;

    @FXML
    private TableView<?> tblRekeningPerusahaan;

    @FXML
    private TableColumn<?, ?> colNoRekeningPerusahaan;

    @FXML
    private TableColumn<?, ?> colSaldoPerusahaan;

    @FXML
    private TextField tfNewIDNasabahPerusahaan;

    @FXML
    private TextField tfNewNoRekeningPerusahaan;

    @FXML
    private TextField tfNewSaldoPerusahaan;

    @FXML
    private Button btnNewTambahAkunPerusahaan;

    @FXML
    private TextField tfJumlahTransaksiPerusahaan;

    @FXML
    private Button btnDepositPerusahaan;

    @FXML
    private Button btnWithdrawPerusahaan;

    @FXML
    private Label lbStatusTransaksiPerusahaan;

    @FXML
    private Label lbDBStatus;

    @FXML
    void handleBersihkanButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleBersihkanButtonPerusahaan(ActionEvent event) {

    }

    @FXML
    void handleDepositButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleDepositButtonPerusahaan(ActionEvent event) {

    }

    @FXML
    void handleMuatUlangButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleMuatUlangButtonPerusahaan(ActionEvent event) {

    }

    @FXML
    void handleTambahAkunButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleTambahAkunButtonPerusahaan(ActionEvent event) {

    }

    @FXML
    void handleTambahNasabahButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleTambahNasabahButtonPerusahaan(ActionEvent event) {

    }

    @FXML
    void handleWithdrawButtonIndividu(ActionEvent event) {

    }

    @FXML
    void handleWithdrawButtonPerusahaan(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
