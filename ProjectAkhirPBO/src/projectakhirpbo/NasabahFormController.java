
package projectakhirpbo;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<Individu> tblNasabahIndividu;

    @FXML
    private TableColumn<Individu, Integer> colIDNasabahIndividu;

    @FXML
    private TableColumn<Individu, String> colNamaIndividu;

    @FXML
    private TableColumn<Individu, String> colAlamatIndividu;

    @FXML
    private TableColumn<Individu, Long> colNikIndividu;

    @FXML
    private TableColumn<Individu, Long> colNpwpIndividu;

    @FXML
    private TableView<Rekening> tblRekeningIndividu;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekeningIndividu;

    @FXML
    private TableColumn<Rekening, Double> colSaldoIndividu;

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
    private TableView<Perusahaan> tblNasabahPerusahaan;

    @FXML
    private TableColumn<Perusahaan, Integer> colIDNasabahPerusahaan;

    @FXML
    private TableColumn<Perusahaan, String> colNamaPerusahaan;

    @FXML
    private TableColumn<Perusahaan, String> colAlamatPerusahaan;

    @FXML
    private TableColumn<Perusahaan, Long> colNibPerusahaan;

    @FXML
    private TableView<Rekening> tblRekeningPerusahaan;

    @FXML
    private TableColumn<Rekening, Integer> colNoRekeningPerusahaan;

    @FXML
    private TableColumn<Rekening, Double> colSaldoPerusahaan;

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
    
    private NasabahDataModel nsdm;

    @FXML
    void handleBersihkanButtonIndividu(ActionEvent event) {
         try {
             tfIDNasabahIndividu.setText(""+nsdm.nextIDNasabah());
             tfNoRekeningIndividu.setText(tfIDNasabahIndividu.getText()+"01");
             tfNamaIndividu.setText("");
             tfAlamatIndividu.setText("");
             tfNikIndividu.setText("");
             tfNpwpIndividu.setText("");
             tfSaldoIndividu.setText("");
         } catch (SQLException ex) {
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    @FXML
    void handleBersihkanButtonPerusahaan(ActionEvent event) {
        try {
             tfIDNasabahPerusahaan.setText(""+nsdm.nextIDNasabah());
             tfNoRekeningPerusahaan.setText(tfIDNasabahPerusahaan.getText()+"01");
             tfNamaPerusahaan.setText("");
             tfAlamatPerusahaan.setText("");
             tfNibPerusahaan.setText("");
             tfSaldoPerusahaan.setText("");
         } catch (SQLException ex) {
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @FXML
    void handleMuatUlangButtonIndividu(ActionEvent event) {
        ObservableList<Individu> data = nsdm.getIndividu();
        colIDNasabahIndividu.setCellValueFactory(new PropertyValueFactory<>("idNasabah"));
        colNamaIndividu.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colAlamatIndividu.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        colNikIndividu.setCellValueFactory(new PropertyValueFactory<>("nik"));
        colNpwpIndividu.setCellValueFactory(new PropertyValueFactory<>("npwp"));
        tblNasabahIndividu.setItems(null);
        tblNasabahIndividu.setItems(data);
        btnNewTambahAkunIndividu.setDisable(true);
    }

    @FXML
    void handleMuatUlangButtonPerusahaan(ActionEvent event) {
        ObservableList<Perusahaan> data = nsdm.getPerusahaan();
        colIDNasabahPerusahaan.setCellValueFactory(new PropertyValueFactory<>("idNasabah"));
        colNamaPerusahaan.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colAlamatPerusahaan.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        colNibPerusahaan.setCellValueFactory(new PropertyValueFactory<>("nib"));
        tblNasabahPerusahaan.setItems(null);
        tblNasabahPerusahaan.setItems(data);
        btnNewTambahAkunPerusahaan.setDisable(true);
    }

    @FXML
    void handleTambahAkunButtonIndividu(ActionEvent event) {
         try {
             Rekening rek = new Rekening(Integer.parseInt(tfNewNoRekeningIndividu.getText()), Double.parseDouble(tfNewSaldoIndividu.getText()));
             nsdm.addRekening(Integer.parseInt(tfNewIDNasabahIndividu.getText()), rek);
             viewDataRekeningIndividu(Integer.parseInt(tfNewIDNasabahIndividu.getText()));
             tfNewSaldoIndividu.setText("");
             if (tblNasabahIndividu.getSelectionModel().getSelectedItem() != null){
                Individu nasabah = tblNasabahIndividu.getSelectionModel().getSelectedItem();
                viewDataRekeningIndividu(nasabah.getIdNasabah());
                btnNewTambahAkunIndividu.setDisable(false);
                tfNewIDNasabahIndividu.setText("" + nasabah.getIdNasabah());
                try {
                    tfNewNoRekeningIndividu.setText("" + nsdm.nextNoRekening(nasabah.getIdNasabah()));
                } catch (SQLException ex) {
                    Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                     
         } catch (SQLException ex) {
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @FXML
    void handleTambahAkunButtonPerusahaan(ActionEvent event) {
        try {
             Rekening rek = new Rekening(Integer.parseInt(tfNewNoRekeningPerusahaan.getText()), Double.parseDouble(tfNewSaldoPerusahaan.getText()));
             nsdm.addRekening(Integer.parseInt(tfNewIDNasabahPerusahaan.getText()), rek);
             viewDataRekeningPerusahaan(Integer.parseInt(tfNewIDNasabahPerusahaan.getText()));
             tfNewSaldoPerusahaan.setText("");            
             if (tblNasabahPerusahaan.getSelectionModel().getSelectedItem() != null){
                Perusahaan nasabah = tblNasabahPerusahaan.getSelectionModel().getSelectedItem();
                viewDataRekeningPerusahaan(nasabah.getIdNasabah());
                btnNewTambahAkunPerusahaan.setDisable(false);
                tfNewIDNasabahPerusahaan.setText("" + nasabah.getIdNasabah());
                try {
                    tfNewNoRekeningPerusahaan.setText("" + nsdm.nextNoRekening(nasabah.getIdNasabah()));
                } catch (SQLException ex) {
                    Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                     
         } catch (SQLException ex) {
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @FXML
    void handleTambahNasabahButtonIndividu(ActionEvent event) {
        Individu nasabah = new Individu(Integer.parseInt(tfIDNasabahIndividu.getText()), 
                tfNamaIndividu.getText(),
                tfAlamatIndividu.getText(),
                Long.parseLong(tfNikIndividu.getText()),
                Long.parseLong(tfNpwpIndividu.getText()),
                new Rekening(Integer.parseInt(tfNoRekeningIndividu.getText()), Double.parseDouble(tfSaldoIndividu.getText())));
        try {
            nsdm.addNasabah(nasabah);
            lbSimpanStatusIndividu.setText("Akun berhasil dibuat");
            btnMuatUlangIndividu.fire();
            btnBersihkanIndividu.fire();
            btnBersihkanPerusahaan.fire();
        } catch (SQLException ex) {
            lbSimpanStatusIndividu.setText("Akun gagal dibuat");
            Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleTambahNasabahButtonPerusahaan(ActionEvent event) {
        Perusahaan nasabah = new Perusahaan(Integer.parseInt(tfIDNasabahPerusahaan.getText()), 
                tfNamaPerusahaan.getText(),
                tfAlamatPerusahaan.getText(),
                tfNibPerusahaan.getText(),
                new Rekening(Integer.parseInt(tfNoRekeningPerusahaan.getText()), Double.parseDouble(tfSaldoPerusahaan.getText())));
        try {
            nsdm.addNasabah(nasabah);
            lbSimpanStatusPerusahaan.setText("Akun berhasil dibuat");
            btnMuatUlangPerusahaan.fire();
            btnBersihkanPerusahaan.fire();
            btnBersihkanIndividu.fire();
        } catch (SQLException ex) {
            lbSimpanStatusPerusahaan.setText("Akun gagal dibuat");
            Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    @FXML
    void handleDepositButtonIndividu(ActionEvent event) {
        Rekening rek = tblRekeningIndividu.getSelectionModel().getSelectedItem();
         try {
             nsdm.addSaldo(rek, Double.parseDouble(tfJumlahTransaksiIndividu.getText()));
             btnMuatUlangIndividu.fire();
             viewDataRekeningIndividu(Integer.parseInt(tfNewIDNasabahIndividu.getText()));
             tfJumlahTransaksiIndividu.setText("");
             lbStatusTransaksiIndividu.setText("Deposit Berhasil");
         } catch (SQLException ex) {
             lbStatusTransaksiIndividu.setText("Deposit Gagal");
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }

    @FXML
    void handleDepositButtonPerusahaan(ActionEvent event) {
        Rekening rek = tblRekeningPerusahaan.getSelectionModel().getSelectedItem();
         try {
             nsdm.addSaldo(rek, Double.parseDouble(tfJumlahTransaksiPerusahaan.getText()));
             btnMuatUlangPerusahaan.fire();
             viewDataRekeningPerusahaan(Integer.parseInt(tfNewIDNasabahPerusahaan.getText()));
             tfJumlahTransaksiPerusahaan.setText("");
             lbStatusTransaksiPerusahaan.setText("Deposit Berhasil");
         } catch (SQLException ex) {
             lbStatusTransaksiPerusahaan.setText("Deposit Gagal");
             Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    @FXML
    void handleWithdrawButtonIndividu(ActionEvent event) {
        Rekening rek = tblRekeningIndividu.getSelectionModel().getSelectedItem();
        
        if (rek.getSaldo() >= Double.parseDouble(tfJumlahTransaksiIndividu.getText())){
            try {
                nsdm.takeSaldo(rek, Double.parseDouble(tfJumlahTransaksiIndividu.getText()));
                btnMuatUlangIndividu.fire();
                viewDataRekeningIndividu(Integer.parseInt(tfNewIDNasabahIndividu.getText()));
                tfJumlahTransaksiIndividu.setText("");
                lbStatusTransaksiIndividu.setText("Withdraw Berhasil");
            } catch (SQLException ex) {
                lbStatusTransaksiIndividu.setText("Withdraw Gagal");
                Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            lbStatusTransaksiIndividu.setText("Withdraw Gagal");
        }
    }

    @FXML
    void handleWithdrawButtonPerusahaan(ActionEvent event) {
        Rekening rek = tblRekeningPerusahaan.getSelectionModel().getSelectedItem();
        
        if (rek.getSaldo() >= Double.parseDouble(tfJumlahTransaksiPerusahaan.getText())){
            try {
                nsdm.takeSaldo(rek, Double.parseDouble(tfJumlahTransaksiPerusahaan.getText()));
                btnMuatUlangPerusahaan.fire();
                viewDataRekeningPerusahaan(Integer.parseInt(tfNewIDNasabahPerusahaan.getText()));
                tfJumlahTransaksiPerusahaan.setText("");
                lbStatusTransaksiPerusahaan.setText("Withdraw Berhasil");
            } catch (SQLException ex) {
                lbStatusTransaksiPerusahaan.setText("Withdraw Gagal");
                Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            lbStatusTransaksiPerusahaan.setText("Withdraw Gagal");
        }
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            nsdm = new NasabahDataModel("MYSQL");
            lbDBStatus.setText(nsdm.conn == null?"Tidak Terkoneksi":"Terkoneksi");
            btnBersihkanIndividu.fire();
            btnMuatUlangIndividu.fire();
            
            btnBersihkanPerusahaan.fire();
            btnMuatUlangPerusahaan.fire();
        } catch (SQLException ex) {
            Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tblNasabahIndividu.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblNasabahIndividu.getSelectionModel().getSelectedItem() != null){
                Individu nasabah = tblNasabahIndividu.getSelectionModel().getSelectedItem();
                viewDataRekeningIndividu(nasabah.getIdNasabah());
                btnNewTambahAkunIndividu.setDisable(false);
                tfNewIDNasabahIndividu.setText("" + nasabah.getIdNasabah());
                try {
                    tfNewNoRekeningIndividu.setText("" + nsdm.nextNoRekening(nasabah.getIdNasabah()));
                } catch (SQLException ex) {
                    Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        tblNasabahPerusahaan.getSelectionModel().selectedIndexProperty().addListener(listener->{
            if (tblNasabahPerusahaan.getSelectionModel().getSelectedItem() != null){
                Perusahaan nasabah = tblNasabahPerusahaan.getSelectionModel().getSelectedItem();
                viewDataRekeningPerusahaan(nasabah.getIdNasabah());
                btnNewTambahAkunPerusahaan.setDisable(false);
                tfNewIDNasabahPerusahaan.setText("" + nasabah.getIdNasabah());
                try {
                    tfNewNoRekeningPerusahaan.setText("" + nsdm.nextNoRekening(nasabah.getIdNasabah()));
                } catch (SQLException ex) {
                    Logger.getLogger(NasabahFormController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        tblRekeningIndividu.getSelectionModel().selectedIndexProperty().addListener(listener->{
            tfJumlahTransaksiIndividu.setDisable(false);
            btnDepositIndividu.setDisable(false);
            btnWithdrawIndividu.setDisable(false);           
        });
        
        tblRekeningPerusahaan.getSelectionModel().selectedIndexProperty().addListener(listener->{
            tfJumlahTransaksiPerusahaan.setDisable(false);
            btnDepositPerusahaan.setDisable(false);
            btnWithdrawPerusahaan.setDisable(false);
        });
        
        
        
    }    
    
    public void viewDataRekeningIndividu(int IDNasabah){
        ObservableList<Rekening> data = nsdm.getRekening(IDNasabah);
        colNoRekeningIndividu.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoIndividu.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekeningIndividu.setItems(null);
        tblRekeningIndividu.setItems(data);
    }
    
    public void viewDataRekeningPerusahaan(int IDNasabah){
        ObservableList<Rekening> data = nsdm.getRekening(IDNasabah);
        colNoRekeningPerusahaan.setCellValueFactory(new PropertyValueFactory<>("noRekening"));
        colSaldoPerusahaan.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        tblRekeningPerusahaan.setItems(null);
        tblRekeningPerusahaan.setItems(data);
    }
    
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
