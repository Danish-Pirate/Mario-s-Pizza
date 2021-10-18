import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateOrder {
  MenuCreate menu;
  ArrayList<ArrayList> listOfOrders;
  ArrayList<Pizza> singleOrder;
  boolean pizzaOrderDone;

  public void createOrder() {
    menu = new MenuCreate();
    listOfOrders = new ArrayList<>();
    singleOrder = new ArrayList<>();

    System.out.println(menu);

    pizzaOrderDone = false;
    startMenu();
  }

  public void checkPizzaNum() {
    Scanner input = new Scanner(System.in);
    do {
      System.out.println("Indtast pizza nummer");
      if (input.hasNextInt()) {
        int pizzaNum = input.nextInt();
        for (int i = 0; i < menu.pizzaList.size(); i++) {
          if (pizzaNum == menu.pizzaList.get(i).getPizzaNummer()) {
            singleOrder.add(menu.pizzaList.get(i));
          }
        }
        System.out.println(singleOrder);
      }
      ordreDone();
    } while (!pizzaOrderDone);
  }

  public void ordreDone() {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Er ordren færdig? ja/nej");
    String response = input1.nextLine();

    if (response.equals("ja")) {
      listOfOrders.add(singleOrder);
      startMenu();
    }
    if (response.equals("nej")) {
      checkPizzaNum();
    }
  }

  public void startMenu() {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("Indtast hvad du vil.\n1: Se bestillinger\n2: Lav en bestilling.");
      String selection = input.nextLine();
      if (selection.equals("1")) {
        if (listOfOrders.size() != 0) {
          System.out.println(listOfOrders);
        } else {
          System.out.println("Der er ingen bestillinger");
        }
      }
      if (selection.equals("2")) {
        checkPizzaNum();
      }
    }
  }
}
