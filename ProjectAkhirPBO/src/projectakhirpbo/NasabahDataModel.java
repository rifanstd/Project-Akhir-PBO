package projectakhirpbo;

import projectakhirpbo.db.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class NasabahDataModel {
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    public final Connection conn;

    public NasabahDataModel(String driver) throws SQLException {
        this.conn = DBHelper.getConnection(driver);
    }
<<<<<<< Updated upstream

    public void addNasabah(Individu nasabah) throws SQLException {
=======
    
    public void addNasabah(Individu nasabah) throws SQLException{
>>>>>>> Stashed changes
        String insertNasabah = "INSERT INTO nasabah (id_nasabah, nama, alamat)"
                + " VALUES (?,?,?)";
        String insertIndividu = "INSERT INTO individu (nik, npwp, id_nasabah)"
                + " VALUES (?,?,?)";
        String insertRekening = "INSERT INTO rekening (no_rekening, saldo, id_nasabah)"
                + " VALUES (?,?,?)";
<<<<<<< Updated upstream

=======
        
>>>>>>> Stashed changes
        PreparedStatement stmtNasabah = conn.prepareStatement(insertNasabah);
        stmtNasabah.setInt(1, nasabah.getIdNasabah());
        stmtNasabah.setString(2, nasabah.getNama());
        stmtNasabah.setString(3, nasabah.getAlamat());
        stmtNasabah.execute();
<<<<<<< Updated upstream

=======
        
>>>>>>> Stashed changes
        PreparedStatement stmtIndividu = conn.prepareStatement(insertIndividu);
        stmtIndividu.setLong(1, nasabah.getNik());
        stmtIndividu.setLong(2, nasabah.getNpwp());
        stmtIndividu.setInt(3, nasabah.getIdNasabah());
        stmtIndividu.execute();
<<<<<<< Updated upstream

=======
        
>>>>>>> Stashed changes
        PreparedStatement stmtRekening = conn.prepareStatement(insertRekening);
        stmtRekening.setInt(1, nasabah.getRekening().get(0).getNoRekening());
        stmtRekening.setDouble(2, nasabah.getRekening().get(0).getSaldo());
        stmtRekening.setInt(3, nasabah.getIdNasabah());
        stmtRekening.execute();
    }
<<<<<<< Updated upstream

    public void addNasabah(Perusahaan nasabah) throws SQLException {
=======
    
    public void addNasabah(Perusahaan nasabah) throws SQLException{
>>>>>>> Stashed changes
        String insertNasabah = "INSERT INTO nasabah (id_nasabah, nama, alamat)"
                + " VALUES (?,?,?)";
        String insertPerusahaan = "INSERT INTO perusahaan (nib, id_nasabah)"
                + " VALUES (?,?)";
        String insertRekening = "INSERT INTO rekening (no_rekening, saldo, id_nasabah)"
                + " VALUES (?,?,?)";
<<<<<<< Updated upstream

=======
        
>>>>>>> Stashed changes
        PreparedStatement stmtNasabah = conn.prepareStatement(insertNasabah);
        stmtNasabah.setInt(1, nasabah.getIdNasabah());
        stmtNasabah.setString(2, nasabah.getNama());
        stmtNasabah.setString(3, nasabah.getAlamat());
        stmtNasabah.execute();
<<<<<<< Updated upstream

        PreparedStatement stmtPerusahaan = conn.prepareStatement(insertPerusahaan);
        stmtPerusahaan.setString(1, nasabah.getNib());
        stmtPerusahaan.setInt(2, nasabah.getIdNasabah());
        stmtPerusahaan.execute();

=======
        
        PreparedStatement stmtPerusahaan = conn.prepareStatement(insertPerusahaan);
        stmtPerusahaan.setString(1, nasabah.getNib());        
        stmtPerusahaan.setInt(2, nasabah.getIdNasabah());
        stmtPerusahaan.execute();
        
>>>>>>> Stashed changes
        PreparedStatement stmtRekening = conn.prepareStatement(insertRekening);
        stmtRekening.setInt(1, nasabah.getRekening().get(0).getNoRekening());
        stmtRekening.setDouble(2, nasabah.getRekening().get(0).getSaldo());
        stmtRekening.setInt(3, nasabah.getIdNasabah());
        stmtRekening.execute();
    }
<<<<<<< Updated upstream

    public ObservableList<Individu> getIndividu() {
=======
    
    public ObservableList<Individu> getIndividu(){
>>>>>>> Stashed changes
        ObservableList<Individu> data = FXCollections.observableArrayList();
        String sql = "SELECT `id_nasabah`, `nama`, `alamat`, `nik`, `npwp` "
                + "FROM `nasabah` NATURAL JOIN `individu` "
                + "ORDER BY nama";
<<<<<<< Updated upstream

        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String sqlRekening = "SELECT no_rekening, saldo "
                        + "FROM rekening WHERE id_nasabah=" + rs.getInt(1);
                ResultSet rsRekening = conn.createStatement().executeQuery(sqlRekening);
                ArrayList<Rekening> dataRekening = new ArrayList<>();
                while (rsRekening.next()) {
=======
        
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                String sqlRekening = "SELECT no_rekening, saldo "
                    + "FROM rekening WHERE id_nasabah="+rs.getInt(1);
                ResultSet rsRekening = conn.createStatement().executeQuery(sqlRekening);
                ArrayList<Rekening> dataRekening = new ArrayList<>();
                while (rsRekening.next()){
>>>>>>> Stashed changes
                    dataRekening.add(new Rekening(rsRekening.getInt(1), rsRekening.getDouble(2)));
                }
                data.add(new Individu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getLong(5), dataRekening));
            }
<<<<<<< Updated upstream
=======
            
>>>>>>> Stashed changes

        } catch (SQLException ex) {
            Logger.getLogger(NasabahDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< Updated upstream

        return data;
    }

    public ObservableList<Perusahaan> getPerusahaan() {
=======
        
        return data;
    }
    
    public ObservableList<Perusahaan> getPerusahaan(){
>>>>>>> Stashed changes
        ObservableList<Perusahaan> data = FXCollections.observableArrayList();
        String sql = "SELECT `id_nasabah`, `nama`, `alamat`, `nib` "
                + "FROM `nasabah` NATURAL JOIN `perusahaan` "
                + "ORDER BY nama";
<<<<<<< Updated upstream

        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String sqlRekening = "SELECT no_rekening, saldo "
                        + "FROM rekening WHERE id_nasabah=" + rs.getInt(1);
                ResultSet rsRekening = conn.createStatement().executeQuery(sqlRekening);
                ArrayList<Rekening> dataRekening = new ArrayList<>();
                while (rsRekening.next()) {
=======
        
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
                String sqlRekening = "SELECT no_rekening, saldo "
                    + "FROM rekening WHERE id_nasabah="+rs.getInt(1);
                ResultSet rsRekening = conn.createStatement().executeQuery(sqlRekening);
                ArrayList<Rekening> dataRekening = new ArrayList<>();
                while (rsRekening.next()){
>>>>>>> Stashed changes
                    dataRekening.add(new Rekening(rsRekening.getInt(1), rsRekening.getDouble(2)));
                }
                data.add(new Perusahaan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), dataRekening));
            }
<<<<<<< Updated upstream
=======
            
>>>>>>> Stashed changes

        } catch (SQLException ex) {
            Logger.getLogger(NasabahDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< Updated upstream

        return data;
    }

    public ObservableList<Rekening> getRekening(int idNasabah) {
        ObservableList<Rekening> data = FXCollections.observableArrayList();
        String sql = "SELECT `no_rekening`, `saldo` "
                + "FROM `rekening` "
                + "WHERE id_nasabah=" + idNasabah;

        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
=======
        
        return data;
    }
    
    public ObservableList<Rekening> getRekening(int idNasabah){
        ObservableList<Rekening> data = FXCollections.observableArrayList();
        String sql = "SELECT `no_rekening`, `saldo` "
                + "FROM `rekening` "
                + "WHERE id_nasabah="+idNasabah;
        
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while(rs.next()){
>>>>>>> Stashed changes
                data.add(new Rekening(rs.getInt(1), rs.getDouble(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NasabahDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< Updated upstream

        return data;
    }

    public int nextIDNasabah() throws SQLException {
        String sql = "SELECT MAX(id_nasabah) from nasabah";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1) == 0 ? 10000001 : rs.getInt(1) + 1;
        }
        return 1000001;
    }

    public int nextNoRekening(int idNasabah) throws SQLException {
        String sql = "SELECT MAX(no_rekening) from rekening WHERE id_nasabah=" + idNasabah;
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while (rs.next()) {
            return rs.getInt(1) + 1;
        }
        return 0;
    }

    public void addRekening(int IDNasabah, Rekening rek) throws SQLException {
        String insertNasabah = "INSERT INTO rekening (id_nasabah, no_rekening, saldo)"
                + " VALUES (?,?,?)";

=======
        
        return data;
    }
    
    public int nextIDNasabah() throws SQLException{
        String sql = "SELECT MAX(id_nasabah) from nasabah";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while(rs.next()){
            return rs.getInt(1) == 0? 10000001 : rs.getInt(1)+1;
        }
        return 1000001;
    }
    
    public int nextNoRekening(int idNasabah) throws SQLException{
        String sql = "SELECT MAX(no_rekening) from rekening WHERE id_nasabah="+idNasabah;
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while(rs.next()){
            return rs.getInt(1)+1;
        }
        return 0;
    }
    
    public void addRekening(int IDNasabah, Rekening rek) throws SQLException{
        String insertNasabah = "INSERT INTO rekening (id_nasabah, no_rekening, saldo)"
                + " VALUES (?,?,?)";        
        
>>>>>>> Stashed changes
        PreparedStatement stmtNasabah = conn.prepareStatement(insertNasabah);
        stmtNasabah.setInt(1, IDNasabah);
        stmtNasabah.setInt(2, rek.getNoRekening());
        stmtNasabah.setDouble(3, rek.getSaldo());
        stmtNasabah.execute();
<<<<<<< Updated upstream

    }

    public void addSaldo(Rekening rek, double jumlah) throws SQLException {
        String insertNasabah = "UPDATE rekening "
                + "SET saldo = ? "
                + "WHERE no_rekening = ?";

=======
               
    }
    
    public void addSaldo(Rekening rek, double jumlah) throws SQLException{
        String insertNasabah = "UPDATE rekening "
                + "SET saldo = ? "
                + "WHERE no_rekening = ?";
        
>>>>>>> Stashed changes
        PreparedStatement stmtNasabah = conn.prepareStatement(insertNasabah);
        stmtNasabah.setDouble(1, (rek.getSaldo() + jumlah));
        stmtNasabah.setInt(2, rek.getNoRekening());
        stmtNasabah.execute();
<<<<<<< Updated upstream

    }

    public void takeSaldo(Rekening rek, double jumlah) throws SQLException {
        String insertNasabah = "UPDATE rekening "
                + "SET saldo = ? "
                + "WHERE no_rekening = ?";

=======
        
    }
    
    public void takeSaldo(Rekening rek, double jumlah) throws SQLException{
        String insertNasabah = "UPDATE rekening "
                + "SET saldo = ? "
                + "WHERE no_rekening = ?";
        
>>>>>>> Stashed changes
        PreparedStatement stmtNasabah = conn.prepareStatement(insertNasabah);
        stmtNasabah.setDouble(1, (rek.getSaldo() - jumlah));
        stmtNasabah.setInt(2, rek.getNoRekening());
        stmtNasabah.execute();
    }
<<<<<<< Updated upstream

=======
    
    
>>>>>>> Stashed changes
}
