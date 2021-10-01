# Project Akhir PBO
# Sistem Data Nasabah

## Anggota Kelompok
- M. Mufid Sadzili (2017051011)
- Rifan Setiadi (2017051019)
- Putu Putra Eka Persada (2057051016)

## Pembagian Tugas
- M. Mufid Sadzili : Mengimplementasikan Class Diagram Nasabah, Individu dan DBHelper (Mengkoneksikan Program dengan Database)
- Rifan Setiadi : Mengembangkan Desain ERD dan Class Diagram, Mengimplementasikan Class Diagram NasabahDataModel, NasabahFormController dan NasabahForm (Membuat GUI)
- Putu Putra Eka Persada : Mengimplementasikan Class Diagram Perusahaan dan Rekening 

## Deskripsi Program
- Sistem dapat digunakan untuk merekam data nasabah di Bank berdasarkan kategori dari nasabah tersebut yaitu Individu atau Perusahaan
- Setiap nasabah dapat meiliki 1 atau lebih rekening
- Sistem dapat digunakan untuk melakukan deposit dan tarik tunai pada rekening setiap nasabah

## Design
Untuk melihat Diagram dibawah ini silahkan install mermaid-diagram plugin pada https://github.com/Redisrupt/mermaid-diagrams 

### ER DIAGRAM
```mermaid
erDiagram
        NASABAH ||..|| INDIVIDU : is
        NASABAH ||--|| PERUSAHAAN : is
        NASABAH ||--|| REKENING : has
        NASABAH {
              string idNasabah
              string nama
              string alamat
        }

        INDIVIDU {
            long nik
            long npwp
        }

        PERUSAHAAN {
            string nib
        }

        REKENING {
            int noRekening
            double saldo
        }
```

### Class Diagram for JavaFX and Database
```mermaid
classDiagram
    Nasabah <|-- Individu
    Nasabah <|-- Perusahaan
    Nasabah "1"o-->"1..*" Rekening
    Nasabah o-- NasabahDataModel : Data Modeling
    NasabahDataModel <-- NasabahFormController : Data Control
    NasabahDataModel --> DBHelper : DB Connection
    NasabahFormController <.. NasabahForm : Form Control
    

    class Nasabah{
        <<abstract>>
        #IntegerProperty idNasabah
        #StringProperty nama
        #StringProperty alamat
        #ArrayList<Rekening> rekening
        +Nasabah(idNasabah, nama, alamat, rekening)
        +tambahRekening(Rekening rek)
    }

    class Rekening {
        -IntegerProperty noRekening
        -DoubleProperty saldo
        +Rekening(noRekening, saldo)
        +tambahSaldo(double jumlah) void
        +tarikTunai(double jumlah) void
    }

    class Individu {
        -LongProperty nik
        -LongProperty npwp
        +Individu(idNasabah, nama, alamat, nik, npwp, rekening)
    }

    class Perusahaan {
        -StringProperty nib
        +Perusahaan(idNasabah, nama, alamat, nib, rekening)
    }

    class NasabahDataModel {
        +Connection conn
        +NasabahDataModel(String driver)
        +addNasabah()        
        +getIndividu()
        +getPerusahaan()
        +getRekening(int idNasabah)
        +nextIDNasabah()
        +nextNoRekening(int idNasabah)
        +addRekening(int IDNasabah, Rekening rek)
        +addSaldo(Rekening rek, double jumlah) void
        +takeSaldo(Rekening rek, double jumlah) void
    }

    class DBHelper {
        -String USER
        -String PASSWORD
        -String DB
        -String MYCONN 
        +getConnection(String driver)
        +createTable(Connection conn, String driver);
    }

    class NasabahFormController {
        +initialize()
        +handleBersihkanButtonIndividu(ActionEvent event) void
        +handleBersihkanButtonPerusahaan(ActionEvent event) void
        +handleMuatUlangButtonIndividu(ActionEvent event) void
        +handleMuatUlangButtonPerusahaan(ActionEvent event) void
        +handleTambahAkunButtonIndividu(ActionEvent event) void
        +handleTambahAkunButtonPerusahaan(ActionEvent event) void
        +handleTambahNasabahButtonIndividu(ActionEvent event) void
        +handleTambahNasabahButtonPerusahaan(ActionEvent event) void
        +handleDepositButtonIndividu(ActionEvent event) void
        +handleDepositButtonPerusahaan(ActionEvent event) void
        +handleWithdrawButtonIndividu(ActionEvent event) void
        +handleWithdrawButtonPerusahaan(ActionEvent event) void
        +viewDataRekeningIndividu(int IDNasabah)
        +viewDataRekeningPerusahaan(int IDNasabah)
    }

    class NasabahForm {

    }
```


