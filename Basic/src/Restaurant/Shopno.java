package Restaurant;

import abstraction.Shape;

public class Shopno implements Shop {
    @Override
    public double priceCalculate(double price, int unite) {
        return price*unite;
    }


    String[] product = new String[10];

    private void productUpdate(){
        product[0] = "likebouy";
    }

    @Override
    public boolean isAvaiable(String product) {
        return product != null;
    }
}
