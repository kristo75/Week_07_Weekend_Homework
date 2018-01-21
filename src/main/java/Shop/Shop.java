package Shop;

import Behaviours.ISellable;



import java.util.ArrayList;

public abstract class Shop {

    ArrayList<ISellable> stock;

    public Shop(){

        this.stock = new ArrayList<>();
    }

    public int stockCount(){

        return stock.size();
    }

    public void addStock(ISellable item){

        stock.add(item);
    }

    public void removeStock(ISellable item){

        stock.remove(item);
    }

}
