package variabel;

import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double bunga, jml_tabungan_akhir, persentase_bunga = 0.02;

        System.out.println("masukkan jumlah tabungan awal anda : ");
        jml_tabungan_awal = scan.nextInt();
        System.out.println("Berapa tahun anda menabung : ");
        lama_menabung = scan.nextInt();

        System.out.println("bunga per tahun : "+ persentase_bunga);
        
        //perhitungan
        bunga = lama_menabung * persentase_bunga * jml_tabungan_awal;
        
        jml_tabungan_akhir = jml_tabungan_awal - bunga;

        //output
        System.out.println("bunga : "+ bunga);
        System.out.println("jumlah tabungan akhir : "+ jml_tabungan_akhir);
    }
}
