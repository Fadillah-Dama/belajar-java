package Kuis1_S2;

public class Tranksaksi {
    
    public void tampilSemuaData(Barang[] barangs) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
        "Kode", "Nama", "Jenis", "Stock", "Harga barang");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (Barang barang : barangs) {
            barang.tampilData();
        }
    }

    public void totalStockByJenis(Barang[] barangs, String key) {
        int totalStock = 0;
        for (int i = 0; i < barangs.length; i++) {
            if (key.equalsIgnoreCase(barangs[i].jenis)) {
                totalStock += barangs[i].stock;
            }
        }
        System.out.println("Total stock: " + totalStock);
    }
}
