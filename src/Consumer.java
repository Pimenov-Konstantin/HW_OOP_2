import java.util.HashMap;
import java.util.Map;

public class Consumer extends Human {
    private final Map<Item, Integer> wishList = new HashMap<>();


    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public void addToWishList(Item item, int qt) {
        wishList.putIfAbsent(item, 0);
        wishList.put(item, wishList.get(item) + qt);
    }
    public void addToWishList(Item item) {
        wishList.putIfAbsent(item, 0);
        wishList.put(item, wishList.get(item) + 1);
    }

    public Map<Item, Integer> getWishList() {
        return wishList;
    }
    public void printWishList() {
        int count = 1;
        System.out.println("--== " + this.getName() + "'s Wishlist ==--");
        for (Map.Entry<Item, Integer> entry : wishList.entrySet()) {
            System.out.println(count++ + ". " + entry.getKey().getNameOfItem() + " --> " + entry.getValue() + " pcs.");
        }
    }
    void areYouPoor() {
        double cost = totalCost(wishList);
        if (cost > this.getMoney()) {
            System.out.println("You're " + (cost - this.getMoney()) + " RUB short");
            System.out.println("You don't have enough money Snoop Dog");
        } else {
            this.walkInStore();
        }
    }

    public void walkInStorage() {
        System.out.println(this.getName() + ": I shoot and go...");
    }

    public void walkInStore() {
        System.out.println(this.getName() + ": Show me your candy" +
                " I have a motherf*cking nigga!");
    }
}