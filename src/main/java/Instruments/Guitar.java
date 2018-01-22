package Instruments;


import Behaviours.IPlayable;

public class Guitar extends Instrument implements IPlayable {

    private int numberStrings;


    public Guitar(String colour, Type type, double buy_price, double sell_price, int numberStrings){
        super(colour, type, buy_price, sell_price);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings(){

        return numberStrings;
    }

    public String play() {
        return "Strum";
    }


}