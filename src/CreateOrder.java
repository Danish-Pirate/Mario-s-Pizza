import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateOrder {
  MenuCreate menu;
  ArrayList<ArrayList> listOfOrders;
  ArrayList<Pizza> singleOrder;
  boolean pizzaOrderDone;

  // All Commands

    final static private String YES= "ja";
    final static private String NO= "nej";
    final static private String DONE= "færdig";
    final static private String[] commandsList= {YES,NO,DONE};



  public void createOrder() {
    menu = new MenuCreate();
    listOfOrders = new ArrayList<>();
    singleOrder = new ArrayList<>();

    System.out.println(menu);

    pizzaOrderDone = false;
    startMenu();
  }
  public static boolean orderDone=true;

  public void checkPizzaNum() {
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("Indtast pizza nummer");
      if (input.hasNextInt()) {
        int pizzaNum = input.nextInt();
        for (int i = 0; i < menu.pizzaList.size(); i++) {
          if (pizzaNum == menu.pizzaList.get(i).getPizzaNummer()) {
            singleOrder.add(menu.pizzaList.get(i));}
        }
        System.out.println(singleOrder);
        System.out.println("Hvis du bliver du færdig med bestillingen indtast (færdig)");
          }
      ordreDone();
    } while (orderDone);
  }


  public static String getJaellerNej() {
    Scanner Scanner= new Scanner(System.in);
    while (true) {
      String input = Scanner.nextLine();
      if (input.equals(YES) || input.equals(NO)){
        return input;
      }else{
        System.out.println("ja eller nej?");
      }
    }
  }



      public void ordreDone() {
    Scanner input1 = new Scanner(System.in);
    String response = input1.nextLine();
        if (response.equals(DONE)){
          System.out.println("Er du sikkert?");
          String answer= getJaellerNej();
          if (answer.equals(YES)){
            listOfOrders.add(singleOrder);
            orderDone=false;
            startMenu();
          }
          if (answer.equals(NO)){
            orderDone=false;
            checkPizzaNum();
          }
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
