package ass4;

class BeverageFactory {
    public Beverage createBeverage(String beverageType) {
        if ("coffee".equalsIgnoreCase(beverageType)) {
            return new Coffee();
        } else if ("tea".equalsIgnoreCase(beverageType)) {
            return new Tea();
        } else if ("soda".equalsIgnoreCase(beverageType)) {
            return new Soda();
        } else {
            return null;
        }
    }
}