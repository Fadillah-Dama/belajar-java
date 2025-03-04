package PersiapanKuis1S2;

public class ApartmentBuilding {
    private ApartmentUnit[][] units;
    private int floors;
    private int unitsPerFloor;
    
    public ApartmentBuilding(int floors, int unitsPerFloor) {
        this.floors = floors;
        this.unitsPerFloor = unitsPerFloor;
        this.units = new ApartmentUnit[floors][unitsPerFloor];
        initializeUnits();
    }
    
    private void initializeUnits() {
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                // Buat nomor unit, misalnya: 101, 102, ..., 501, 502, ...
                String unitNumber = String.format("%d%02d", floor + 1, unit + 1);
                
                // Area random antara 30-100 m²
                double area = 30 + Math.random() * 70;
                area = Math.round(area * 10) / 10.0; // Bulatkan ke 1 desimal
                
                units[floor][unit] = new ApartmentUnit(unitNumber, area);
            }
        }
    }
    
    public void rentUnit(String unitNumber, String tenantName) {
        ApartmentUnit unit = findUnit(unitNumber);
        if (unit != null) {
            if (!unit.isOccupied()) {
                unit.rent(tenantName);
                System.out.println("Unit " + unitNumber + " berhasil disewakan kepada " + tenantName);
            } else {
                System.out.println("Unit " + unitNumber + " sudah disewakan kepada " + unit.getTenant());
            }
        } else {
            System.out.println("Unit dengan nomor " + unitNumber + " tidak ditemukan");
        }
    }
    
    public ApartmentUnit findUnit(String unitNumber) {
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                if (units[floor][unit].getUnitNumber().equals(unitNumber)) {
                    return units[floor][unit];
                }
            }
        }
        return null;
    }
    
    public double calculateTotalMonthlyIncome() {
        double totalIncome = 0;
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                if (units[floor][unit].isOccupied()) {
                    totalIncome += units[floor][unit].getMonthlyRent();
                }
            }
        }
        return totalIncome;
    }
    
    public void displayAllUnits() {
        System.out.println("\n=== LAPORAN STATUS APARTEMEN ===");
        System.out.println("Nomor | Luas | Harga Sewa | Status | Penyewa");
        System.out.println("--------------------------------------------");
        
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                System.out.println(units[floor][unit]);
            }
        }
        System.out.println("--------------------------------------------");
        
        System.out.printf("Total Pendapatan Bulanan: Rp %.2f\n", calculateTotalMonthlyIncome());
        System.out.println();
    }
    
    public void displayVacantUnits() {
        System.out.println("\n=== DAFTAR UNIT KOSONG ===");
        System.out.println("Nomor | Luas | Harga Sewa");
        System.out.println("-------------------------");
        
        boolean foundVacant = false;
        
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                if (!units[floor][unit].isOccupied()) {
                    foundVacant = true;
                    ApartmentUnit vacantUnit = units[floor][unit];
                    System.out.printf("Unit %s | %.1f m² | Rp %.2f\n", 
                            vacantUnit.getUnitNumber(), 
                            vacantUnit.getArea(), 
                            vacantUnit.getMonthlyRent());
                }
            }
        }
        
        if (!foundVacant) {
            System.out.println("Tidak ada unit kosong tersedia");
        }
        
        System.out.println();
    }
    
    public int getTotalUnits() {
        return floors * unitsPerFloor;
    }
    
    public int getOccupiedUnits() {
        int count = 0;
        for (int floor = 0; floor < floors; floor++) {
            for (int unit = 0; unit < unitsPerFloor; unit++) {
                if (units[floor][unit].isOccupied()) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public int getVacantUnits() {
        return getTotalUnits() - getOccupiedUnits();
    }
    
    public void displayBuildingSummary() {
        System.out.println("\n=== RINGKASAN GEDUNG APARTEMEN ===");
        System.out.println("Jumlah Lantai: " + floors);
        System.out.println("Jumlah Unit per Lantai: " + unitsPerFloor);
        System.out.println("Total Unit: " + getTotalUnits());
        System.out.println("Unit Terisi: " + getOccupiedUnits());
        System.out.println("Unit Kosong: " + getVacantUnits());
        System.out.printf("Persentase Hunian: %.1f%%\n", (double) getOccupiedUnits() / getTotalUnits() * 100);
        System.out.println();
    }
}

