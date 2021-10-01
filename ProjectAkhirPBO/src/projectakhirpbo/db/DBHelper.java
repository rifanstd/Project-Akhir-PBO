package projectakhirpbo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHelper {

    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DB = "datanasabah";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;
    private static final String SQCONN = "jdbc:sqlite:datanasabah.sqlite";

    public static Connection getConnection(String driver) throws SQLException {
        Connection conn = null;
        switch (driver) {
            case "MYSQL": {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(MYCONN, USER, PASSWORD);
                    createTable(conn, driver);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Library tidak ada");
                    Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            case "SQLITE": {
                try {
                    Class.forName("org.sqlite.JDBC");
                    conn = DriverManager.getConnection(SQCONN);
                    createTable(conn, driver);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Library tidak ada");
                    Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        return conn;
    }

    public static void createTable(Connection conn, String driver) throws SQLException {
        String sqlCreate = "";

        switch (driver) {
            case "MYSQL": {
                sqlCreate = "CREATE TABLE IF NOT EXISTS `nasabah` ("
                        + "  `id_nasabah` int(50) NOT NULL,"
                        + "  `nama` varchar(250) DEFAULT NULL,"
                        + "  `alamat` varchar(250) DEFAULT NULL,"
                        + "  PRIMARY KEY (`id_nasabah`)"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `individu` ("
                        + "  `nik` bigint(16) NOT NULL,"
                        + "  `npwp` bigint(16) DEFAULT NULL,"
                        + "  `id_nasabah` int(50) DEFAULT NULL,"
                        + "  PRIMARY KEY (`nik`),"
                        + "  KEY `id_nasabah` (`id_nasabah`),"
                        + "  FOREIGN KEY (`id_nasabah`) REFERENCES `nasabah` (`id_nasabah`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `perusahaan` ("
                        + "  `nib` varchar(200) NOT NULL,"
                        + "  `id_nasabah` int(50) DEFAULT NULL,"
                        + "  PRIMARY KEY (`nib`),"
                        + "  KEY `id_nasabah` (`id_nasabah`),"
                        + "  FOREIGN KEY (`id_nasabah`) REFERENCES `nasabah` (`id_nasabah`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `rekening` ("
                        + "  `no_rekening` int(50) NOT NULL,"
                        + "  `saldo` double(100,2) DEFAULT NULL,"
                        + "  `id_nasabah` int(50) DEFAULT NULL,"
                        + "  PRIMARY KEY (`no_rekening`),"
                        + "  KEY `id_nasabah` (`id_nasabah`),"
                        + "  FOREIGN KEY (`id_nasabah`) REFERENCES `nasabah` (`id_nasabah`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
                break;
            }
            case "SQLITE": {
                sqlCreate = "CREATE TABLE IF NOT EXISTS nasabah ("
                        + "    id_nasabah INT (50)      PRIMARY KEY,"
                        + "    nama       VARCHAR (250),"
                        + "    alamat     VARCHAR (250) "
                        + ");"
                        + "CREATE TABLE IF NOT EXISTS individu ("
                        + "    nik        BIGINT (16) PRIMARY KEY,"
                        + "    npwp       BIGINT (16),"
                        + "    id_nasabah INT (50)    REFERENCES nasabah (id_nasabah) ON DELETE RESTRICT"
                        + "                                                           ON UPDATE CASCADE"
                        + ");"
                        + "CREATE TABLE IF NOT EXISTS perusahaan ("
                        + "    nib        VARCHAR (200) PRIMARY KEY,"
                        + "    id_nasabah INT (50)      REFERENCES nasabah (id_nasabah) ON DELETE RESTRICT"
                        + "                                                             ON UPDATE CASCADE"
                        + ");"
                        + "CREATE TABLE IF NOT EXISTS rekening ("
                        + "    no_rekening INT (50)        PRIMARY KEY,"
                        + "    saldo       DOUBLE (100, 2),"
                        + "    id_nasabah  INT (50)        REFERENCES nasabah (id_nasabah) ON DELETE RESTRICT"
                        + "                                                                ON UPDATE CASCADE"
                        + ");";
                break;
            }
        }

        String sqls[] = sqlCreate.split(";");
        for (String sql : sqls) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
        }

    }
}
