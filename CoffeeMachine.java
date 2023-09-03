import Coffee_Type.Cappuccino;
import Coffee_Type.Espresso;
import Coffee_Type.Latte;

public class CoffeeMachine {

    public int water;

    public int milk;

    public int coffee;

    public int money;

    public int soldCups;

    public Espresso espresso;
    public Latte latte ;
    public Cappuccino cappuccino;

    CoffeeMachine(){
        water=Integer.MAX_VALUE;
        milk=Integer.MAX_VALUE;
        coffee=Integer.MAX_VALUE;
        espresso=new Espresso();latte=new Latte();cappuccino=new Cappuccino();
    }

    public int getMoney(){
        return money;
    }

    public void buyEspresso(){
        int wq=espresso.waterQuantity(),mq=espresso.milkQuantity(),cq=espresso.coffeeBeans(),price=espresso.price();
        if(water-wq<0 || coffee-cq<0 || milk-mq<0){
            System.out.println("Insufficient ingredients to make Coffee_Type.Espresso");
            return;
        }
        this.water=this.water-wq;
        this.milk=this.milk-mq;
        this.coffee=this.coffee-cq;
        this.money+=price;
        this.soldCups++;
        System.out.println("Enjoy your Espresso");
    }

    public void buyLatte(){
        int wq=latte.waterQuantity(),mq=latte.milkQuantity(),cq=latte.coffeeBeans(),price=latte.price();
        if(water-wq<0 || coffee-cq<0 || milk-mq<0){
            System.out.println("Insufficient ingredients to make Coffee_Type.Latte");
            return;
        }
        this.water-=wq;
        this.milk-=mq;
        this.coffee-=cq;
        this.money+=price;
        this.soldCups++;
        System.out.println("Enjoy your Latte");
    }

    public void buyCappuccino(){
        int wq=cappuccino.waterQuantity(),mq=cappuccino.milkQuantity(),cq=cappuccino.coffeeBeans(),price=cappuccino.price();
        if(water-wq<0 || coffee-cq<0 || milk-mq<0){
            System.out.println("Insufficient ingredients to make Coffee_Type.Cappuccino");
            return;
        }
        this.water-=wq;
        this.milk-=mq;
        this.coffee-=cq;
        this.money+=price;
        this.soldCups++;
        System.out.println("Enjoy your Cappuccino");
    }

    public void fillWater(){
        this.water=Integer.MAX_VALUE;
    }
    public void fillMilk(){
        this.milk=Integer.MAX_VALUE;
    }
    public void fillCoffee(){
        this.coffee=Integer.MAX_VALUE;
    }

    public void fill(){
        fillWater();
        fillMilk();
        fillCoffee();
    }

    public void takeMoney(){
        System.out.println(money+" USD Withdrawal from the Coffee Machine");
        this.money=0;
    }

    public void show(){
        System.out.println("--------Ingredients Left--------");
        System.out.println(" Water Left: "+water+"ml");
        System.out.println(" Milk Left: "+milk+"ml");
        System.out.println(" Coffee-Beans Left: "+coffee);
        System.out.println("--------------------------------");
    }

    public void analytics(){
        System.out.println("-------------Informations-------------");
        System.out.println(" Coffee Sold: "+soldCups+" Cup");
        System.out.println(" Money Collected: "+money+" USD");
        System.out.println(" Water Consumed: "+(Integer.MAX_VALUE-water)+"ml");
        System.out.println(" Milk Consumed: "+(Integer.MAX_VALUE-milk)+"ml");
        System.out.println(" Coffee Beans Consumed: "+(Integer.MAX_VALUE-coffee));
        System.out.println("--------------------------------------");
    }

}
