package baitap_2_5;

public class JetFuel {
    private int quantitySold;       // Quantity sold in gallons
    private String qualityLevel;    // Quality level
    private int basePrice;          // Base price in cents per gallon
    
    public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
        this.quantitySold = quantitySold;
        this.qualityLevel = qualityLevel;
        this.basePrice = basePrice;
    }
    
    public double totalCost() {
        return quantitySold * basePrice / 100.0;
    }
    
    public double discountPrice() {
        double totalPrice = totalCost();
        
        if (quantitySold > 100000) {
            return totalPrice * 0.9;   // Apply 10% discount
        } else {
            return totalPrice;
        }
    }
}
