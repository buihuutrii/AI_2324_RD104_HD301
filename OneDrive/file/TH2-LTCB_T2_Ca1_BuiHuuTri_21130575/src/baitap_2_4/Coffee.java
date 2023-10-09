package baitap_2_4;

public class Coffee {
    private String kind;
    private double unitPrice;
    private double totalAmount;
    
    public Coffee(String kind, double unitPrice, double totalAmount) {
        this.kind = kind;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
    }
    /**
     * this is method to compute cost of coffee with condition 
     * totalAmount <5000 : discount = 0
     * totalAmount >= 5000 && totalAmount <= 20000 : discount = 0.1
     * else discount = 0.25
     * @return
     */
    public double cost() {
        double cost;
        
        if (totalAmount < 5000) {
            cost = unitPrice * totalAmount;
        } else if (totalAmount >= 5000 && totalAmount <= 20000) {
            double discount = 0.10;
            cost = (unitPrice * totalAmount) - (unitPrice * totalAmount * discount);
        } else {
            double discount = 0.25;
            cost = (unitPrice * totalAmount) - (unitPrice * totalAmount * discount);
        }
        
        return cost;
    }
    
   
}

