import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static boolean programIsRunning = true;

    public static void main(String[] args) {
        MenuCreate menu = new MenuCreate();
        Scanner input = new Scanner(System.in);
        MakeOrder listOfOrders = new MakeOrder();
        ArrayList<Pizza> singleOrder = new ArrayList<Pizza>();

        System.out.println(menu);

       while (programIsRunning) {

            System.out.println("Indtast pizza nummer");
            if (input.hasNextInt()) {

                int pizzanummer = input.nextInt();
                for (int i = 0; i < menu.pizzaList.size(); i++) {
                    if (pizzanummer == menu.pizzaList.get(i).getPizzaNummer()) {
                        singleOrder.add(menu.pizzaList.get(i));
                    }
                }
                System.out.println(singleOrder);
            }
            else {
                System.out.println("Det er ikke et pizza nummer");
                input.nextLine();
            }
        }
    }
}
