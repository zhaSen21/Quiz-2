package komposisi;

public class Prodi {
    private String idProdi;
    private String namaProdi;

    public Prodi(String idProdi, String namaProdi) {
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
    }

    public String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
    
    public void tampilProdi(){
        System.out.println("ID PRODI : " + idProdi);
        System.out.println("Nama Prodi : " + namaProdi);
        System.out.println("------------------------------");
        
    }
}
