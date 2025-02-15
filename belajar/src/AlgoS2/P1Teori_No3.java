package AlgoS2;
import java.util.Scanner;

public class P1Teori_No3 {

    static int students;
    static int courses;
    static boolean isValueExist = false;
    static int[][] arrGrade = new int[students][courses];
    static Scanner input = new Scanner(System.in);
    static int[][] a;
    static double[] avg = new double[students];
    static double[] b;
    public static void main(String[] args) {

        while (true) { 
            System.out.println("PILIHAN MENU");
            System.out.println("1. Input Nilai Mahasiswa");
            System.out.println("2. Tampilkan nilai mahasiswa");
            System.out.println("3. Tampilkan rata-rata Mahasiswa");
            System.out.println("4. Tampilkan status kelulusan Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan menu: ");
            int menu = input.nextInt();

            if(menu == 1 && isValueExist == false) {
                isValueExist = true;
                System.out.println("Masukkan jumlah mahasiswa:");
                students = input.nextInt();
                System.out.println("Masukkan jumlah mata kuliah:");
                courses = input.nextInt();
                int[][] arrGrade = new int[students][courses];
                inputData(arrGrade);
            
            } else if (menu == 2 && isValueExist == true) {
                showData(a);
            } else if (menu == 1){
                System.out.println("ANDA SUDAH MENGISI DATA!!");
            } else if (menu == 3 && isValueExist == true) {
                avgGrade(a);
            } else if (menu == 4 && isValueExist == true) {
                graduateStatus(b);
            } else if (menu == 5) {
                System.out.println(".....ANDA KELUAR DARI PROGRAM.....");
                break;
            } else {
                System.out.println("Silahkan isi menu 1 terlebih dahulu!!!");
            }

        }

    }

    static int[][] inputData(int[][] arrGrade) {
        for (int i = 0; i < arrGrade.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < arrGrade[0].length; j++) {
                System.out.print("Masukkan nilai matkul ke-" + (j + 1)+ ": ");
                arrGrade[i][j] = input.nextInt();
            }
            System.out.println();
        }
        a = arrGrade;
        return a;
       
    }

    static void showData(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+ (i + 1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Nilai matkul ke-" + (j + 1)+ ": "+ array[i][j]);
            }
        }
    }

    static double[] avgGrade(int[][] array) {
        double[] avg = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            double avgGrade = 0;
            int sumGrade = 0;
            for (int j = 0; j < array[0].length; j++) {
                sumGrade += array[i][j];
            }
            avgGrade = sumGrade / array[0].length;
            avg[i] = avgGrade;
            System.out.println("Rata-rata nilai mahasiswa ke-"+ (i + 1)+ ": "+ avgGrade);
        }
        b = avg;
        return b;
    }

    static void graduateStatus(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 75) {
                System.out.println("Mahasiswa ke-"+ (i + 1)+ " Lulus");
            } else {
                System.out.println("Mahasiswa ke-"+ (i + 1)+ " Tidak Lulus");
            }
        }  
    }
}
