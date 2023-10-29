package ass4;


public class FactoryPatternExample {
    public static void main(String[] args) {
        BeverageFactory factory = new BeverageFactory();

        Beverage coffee = factory.createBeverage("coffee");
        if (coffee != null) {
            coffee.pour();
        } else {
            System.out.println("Invalid beverage type");
        }

        Beverage tea = factory.createBeverage("tea");
        if (tea != null) {
            tea.pour();
        } else {
            System.out.println("Invalid beverage type");
        }

        Beverage soda = factory.createBeverage("soda");
        if (soda != null) {
            soda.pour();
        } else {
            System.out.println("Invalid beverage type");
        }
    }
}