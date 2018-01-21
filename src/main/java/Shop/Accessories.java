package Shop;

import Behaviours.ISellable;

public class Accessories extends Shop implements ISellable {

    String productName;
    double buyPrice;
    double sellPrice;

    public Accessories(String productName, double buyPrice, double sellPrice){
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }



    public String getProductName() {
        return productName;
    }

    public double getBuyPrice() {
        return buyPrice;
    }


    public double getSellPrice() {
        return sellPrice;
    }


    @Override
    public double MarkUp() {
        return 0;
    }

    
}