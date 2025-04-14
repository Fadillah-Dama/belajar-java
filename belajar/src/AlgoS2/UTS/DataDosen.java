package AlgoS2.UTS;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[5];
    int idx;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    int jumlahDosen() {
        return dataDosen.length;
    }

    void tampilSemuaData() {
        for (int i = 0; i < dataDosen.length; i++) {
            dataDosen[i].tampil();
        }
    }

    // sorting ascending
    void bubbleSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 0; j < dataDosen.length - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    // sorting descending
    void selectionSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[max_idx].usia) {
                    max_idx = j;
                }
            }
            Dosen temp = dataDosen[i];
            dataDosen[i] = dataDosen[max_idx];
            dataDosen[max_idx] = temp;
        }
    }

    // sorting ascending
    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && temp.usia < dataDosen[j].usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            
            dataDosen[j+1] = temp;
        }
    }

    // sequential search berdasarkan kode
    int sequentialSearch(String key) {
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].kode.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    void tampilPosisiSearchKode(String key, int posisi) {
        if (posisi != -1) {
            System.out.println("Data dengan kode " + key + " ditemukan pada index : " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
            System.out.println("--------------------------");
        }
    }

    void tampilDataSearchKode(int posisi) {
        if (posisi != -1) {
            dataDosen[posisi].tampil();
        }
    }

    // binary search usia (syaarat data harus ascending)
    int binarySearch(int key, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (key == dataDosen[mid].usia) {
                return mid;
            } else if (key > dataDosen[mid].usia) {
                return binarySearch(key, mid + 1, right);
            } else {
                return binarySearch(key, left, mid - 1);
            }

        }
        return -1;
    }

    void tampilPosisiSearchUsia(int key, int posisi) {
        if (posisi != -1) {
            System.out.println("Data dengan umur " + key + " ditemukan pada index : " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
            System.out.println("--------------------------");
        }
    }

    void tampilDataSearchUsia(int posisi) {
        if (posisi != -1) {
            dataDosen[posisi].tampil();
        }
    }
}
