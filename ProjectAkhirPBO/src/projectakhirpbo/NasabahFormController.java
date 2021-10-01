
package projectakhirpbo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class NasabahFormController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
<<<<<<< Updated upstream
        // TODO
=======
        try {
            // TODO
            nsdm = new NasabahDataModel("SQLITE");
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
        
        
        
>>>>>>> Stashed changes
    }    
    
}
