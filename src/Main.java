import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String separator = "***************************";
        Seller seller = new Seller("50 cent", 1000, 50);
        Consumer consumer = new Consumer("Snoop Dog", 100, 25);

        Item water = new Item("Jack Daniels", 26, Category.Water);
        Item pizza = new Item("Pizza \"Margarita\"", 125, Category.Food);
        Item shampoo = new Item("Shampoo \"Black Nigga\"", 24, Category.Hygiene);
        Item pasta = new Item("Pasta \"Karbonara\"", 300, Category.Food);

        consumer.addToWishList(water, 2);
        consumer.addToWishList(pizza);
        consumer.addToWishList(shampoo, 5);
        seller.addToStorage(water, 5);
        seller.addToStorage(shampoo, 3);
        seller.addToStorage(pasta);

        consumer.welcomeToStore(consumer);
        System.out.println(separator);
        seller.charismaCheck(consumer);
        System.out.println(separator);
        consumer.printWishList();
        System.out.println(separator);
        System.out.println("Total cost = " + consumer.totalCost(consumer.getWishList()) + " RUB");
        System.out.println(separator);
        consumer.areYouPoor();
        System.out.println(separator);
        seller.addToCart(consumer);
        seller.printShoppingCart(consumer);
        System.out.println(separator);
        consumer.walkInStore();
        seller.walkInStorage();
        consumer.walkInStorage();

    }
}