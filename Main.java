import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CoffeeMachine seller=new CoffeeMachine();
        System.out.println("Welcome to Coffee Machine");
        while (true){
            String instruction=sc.nextLine();
            if(instruction.equalsIgnoreCase("Buy Espresso"))seller.buyEspresso();
            else if(instruction.equalsIgnoreCase("Buy Latte"))seller.buyLatte();
            else if(instruction.equalsIgnoreCase("Buy Cappuccino"))seller.buyCappuccino();
            else if(instruction.equalsIgnoreCase("Fill Water"))seller.fillWater();
            else if(instruction.equalsIgnoreCase("Fill Milk"))seller.fillMilk();
            else if(instruction.equalsIgnoreCase("Fill Coffee"))seller.fillCoffee();
            else if(instruction.equalsIgnoreCase("Fill"))seller.fill();
            else if(instruction.equalsIgnoreCase("Take"))seller.takeMoney();
            else if(instruction.equalsIgnoreCase("Analytics"))seller.analytics();
            else if(instruction.equalsIgnoreCase("Show"))seller.show();
            else if(instruction.equalsIgnoreCase("Exit"))break;
            else System.out.println("Invalid Instruction, please write again");
        }
        System.out.println("Have a nice day!");
    }
}
