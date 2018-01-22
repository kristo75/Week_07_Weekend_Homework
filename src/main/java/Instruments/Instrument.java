package Instruments;

import Behaviours.IPlayable;
import Behaviours.ISellable;

public abstract class Instrument implements IPlayable, ISellable{

    private String colour;
    private Type type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String colour, Type type, double buyPrice, double sellPrice){
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public double getBuyPrice() {
        return buyPrice;
    }



    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getMarkUp() {
        double markUp = (this.sellPrice - this.buyPrice);
        return markUp;
    }


}

