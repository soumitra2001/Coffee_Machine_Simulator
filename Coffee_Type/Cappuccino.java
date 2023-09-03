package Coffee_Type;

import Coffee_Type.Coffee;

public class Cappuccino implements Coffee {

    public int waterQuantity(){
        return 200;
    }

    public int milkQuantity(){
        return 100;
    }

    public int coffeeBeans(){
        return 12;
    }

    public int price(){
        return 6;
    }
}
