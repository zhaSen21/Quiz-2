package komposisi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader isi = new BufferedReader(new InputStreamReader(System.in));

        Fakultas fk = new Fakultas(null, null, 0);
        Prodi prodi1 = new Prodi(null, null);
        Prodi prodi2 = new Prodi(null, null);
        Prodi prodi3 = new Prodi(null, null);
        Prodi prodi4 = new Prodi(null, null);
        Prodi[] prodis = {prodi1, prodi2, prodi3, prodi4};

        fk.tambahProdi(null, null);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Input Prodi ke : " + i);
            System.out.print("Id Prodi : ");
            prodis[i].setIdProdi(isi.readLine());
            System.out.println("Nama Prodi : ");
            prodis[i].setNamaProdi(isi.readLine());
        }
        
        fk.tampilProdi();
        
        prodi1.tampilProdi();
        prodi2.tampilProdi();
        prodi3.tampilProdi();
        prodi4.tampilProdi();
        
    }
}
