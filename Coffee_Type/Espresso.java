package Coffee_Type;

import Coffee_Type.Coffee;

public class Espresso implements Coffee {

    public int waterQuantity(){
        return 250;
    }

    public int milkQuantity(){
        return 0;
    }

    public int coffeeBeans(){
        return 16;
    }

    public int price(){
        return 4;
    }
}
