package komposisi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultas {

    private String idFakultas;
    private String namaFakultas;
    private int pencacah;
    private Prodi[] prodi;

    public Fakultas(String idFakultas, String namaFakultas, int pencacah) {
        this.idFakultas = idFakultas;
        this.namaFakultas = namaFakultas;
        this.pencacah = pencacah;

    }

    BufferedReader isi = new BufferedReader(new InputStreamReader(System.in));

    public void tambahProdi(String idProdi, String namaProdi) throws IOException {

        System.out.println("Id Fakultas : ");
        setIdFakultas(isi.readLine());
        System.out.println("Nama Fakultas : ");
        setNamaFakultas(isi.readLine());
    }

    public void tampilProdi() throws IOException {
        System.out.println("Id Fakultas : " + getIdFakultas());
        System.out.println("Nama Fakultas" + getNamaFakultas());
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public Prodi[] getProdi() {
        return prodi;
    }

    public void setProdi(Prodi[] prodi) {
        this.prodi = prodi;
    }

}
