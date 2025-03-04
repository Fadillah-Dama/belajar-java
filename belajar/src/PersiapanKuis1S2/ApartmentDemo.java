package PersiapanKuis1S2;
import java.util.Scanner;

public class ApartmentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static ApartmentBuilding apartmentBuilding;
    
    public static void main(String[] args) {
        System.out.println("SISTEM MANAJEMEN APARTEMEN");
        System.out.println("==========================");
        
        // Inisialisasi gedung apartemen
        apartmentBuilding = new ApartmentBuilding(5, 4);
        
        // Isi beberapa unit dengan tenant
        apartmentBuilding.rentUnit("101", "Budi Santoso");
        apartmentBuilding.rentUnit("203", "Siti Rahayu");
        apartmentBuilding.rentUnit("302", "Ahmad Hidayat");
        apartmentBuilding.rentUnit("405", "Maya Wijaya");
        apartmentBuilding.rentUnit("502", "Doni Pratama");
        
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.print("Pilih menu (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    apartmentBuilding.displayAllUnits();
                    break;
                case 2:
                    apartmentBuilding.displayVacantUnits();
                    break;
                case 3:
                    apartmentBuilding.displayBuildingSummary();
                    break;
                case 4:
                    rentUnit();
                    break;
                case 5:
                    vacateUnit();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Apartemen!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\nMENU:");
        System.out.println("1. Tampilkan Semua Unit");
        System.out.println("2. Tampilkan Unit Kosong");
        System.out.println("3. Tampilkan Ringkasan Gedung");
        System.out.println("4. Sewa Unit");
        System.out.println("5. Kosongkan Unit");
        System.out.println("6. Keluar");
    }
    
    private static void rentUnit() {
        apartmentBuilding.displayVacantUnits();
        
        System.out.print("Masukkan nomor unit yang ingin disewa: ");
        String unitNumber = scanner.nextLine();
        
        ApartmentUnit unit = apartmentBuilding.findUnit(unitNumber);
        if (unit == null) {
            System.out.println("Unit dengan nomor " + unitNumber + " tidak ditemukan");
            return;
        }
        
        if (unit.isOccupied()) {
            System.out.println("Unit " + unitNumber + " sudah disewakan kepada " + unit.getTenant());
            return;
        }
        
        System.out.print("Masukkan nama penyewa: ");
        String tenantName = scanner.nextLine();
        
        apartmentBuilding.rentUnit(unitNumber, tenantName);
    }
    
    private static void vacateUnit() {
        System.out.print("Masukkan nomor unit yang ingin dikosongkan: ");
        String unitNumber = scanner.nextLine();
        
        ApartmentUnit unit = apartmentBuilding.findUnit(unitNumber);
        if (unit == null) {
            System.out.println("Unit dengan nomor " + unitNumber + " tidak ditemukan");
            return;
        }
        
        if (!unit.isOccupied()) {
            System.out.println("Unit " + unitNumber + " sudah kosong");
            return;
        }
        
        String tenant = unit.getTenant();
        unit.vacate();
        System.out.println("Unit " + unitNumber + " telah dikosongkan (sebelumnya disewa oleh " + tenant + ")");
    }
}
