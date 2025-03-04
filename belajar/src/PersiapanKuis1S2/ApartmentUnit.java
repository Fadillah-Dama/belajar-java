package PersiapanKuis1S2;

public class ApartmentUnit {
    private String unitNumber;
    private String tenant;
    private double area;
    private double monthlyRent;
    private boolean isOccupied;
    
    public ApartmentUnit(String unitNumber, double area) {
        this.unitNumber = unitNumber;
        this.area = area;
        this.tenant = "-";
        this.monthlyRent = calculateRent();
        this.isOccupied = false;
    }
    
    private double calculateRent() {
        // Harga sewa per meter persegi
        double pricePerSquareMeter = 150000.0;
        return area * pricePerSquareMeter;
    }
    
    public void rent(String tenantName) {
        this.tenant = tenantName;
        this.isOccupied = true;
    }
    
    public void vacate() {
        this.tenant = "-";
        this.isOccupied = false;
    }
    
    public String getUnitNumber() {
        return unitNumber;
    }
    
    public String getTenant() {
        return tenant;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getMonthlyRent() {
        return monthlyRent;
    }
    
    public boolean isOccupied() {
        return isOccupied;
    }
    
    @Override
    public String toString() {
        return String.format("Unit %s | %s m² | Rp %.2f | %s | %s", 
                unitNumber, area, monthlyRent, 
                isOccupied ? "Tersewa" : "Kosong", tenant);
    }
}

