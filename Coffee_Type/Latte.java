package Coffee_Type;

import Coffee_Type.Coffee;

public class Latte implements Coffee {

    public int waterQuantity(){
        return 350;
    }

    public int milkQuantity(){
        return 75;
    }

    public int coffeeBeans(){
        return 20;
    }

    public int price(){
        return 7;
    }
}
