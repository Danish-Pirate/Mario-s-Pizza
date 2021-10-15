
public class Pizza {
 private int pizzaNummer;
 private String pizzaNavn;
 private String pizzaIngredienser;
 private int pizzaPris;

  public Pizza(int pizzaNummer, String pizzaNavn, String pizzaIngredienser, int pizzaPris) {
    this.pizzaNummer = pizzaNummer;
    this.pizzaNavn = pizzaNavn;
    this.pizzaIngredienser = pizzaIngredienser;
    this.pizzaPris = pizzaPris;
  }
  public Pizza() {

  }

  public int getPizzaNummer() {
    return pizzaNummer;
  }

  public String getPizzaNavn() {
    return pizzaNavn;
  }

  public String getPizzaIngredienser() {
    return pizzaIngredienser;
  }

  public int getPizzaPris() {
    return pizzaPris;
  }

  public String toString() {
    return pizzaNummer +": " + pizzaNavn;
  }
}
