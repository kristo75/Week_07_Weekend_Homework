package Shop;

import Behaviours.ISellable;

public class GuitarStrings extends Accessories implements ISellable {
    private String level;

    public GuitarStrings(String productName, double buyPrice, double sellPrice, String level){
        super(productName, buyPrice, sellPrice);
        this.level = level;
    }

    public String getLevel(){
        return this.level;
    }
}