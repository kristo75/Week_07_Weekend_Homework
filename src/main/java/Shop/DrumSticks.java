package Shop;

import Behaviours.ISellable;

public class DrumSticks extends Accessories implements ISellable {
        private String material;

        public DrumSticks(String productName, double buyPrice, double sellPrice, String material){

                super(productName, buyPrice, sellPrice);
                this.material = material;
}
        public String getMaterial(){
                return this.material;
        }
}