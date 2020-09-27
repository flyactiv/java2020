package ru.mirea.lab7;

public class ShopTest {
    public static void main(String[] args) {
        Person customer = new Person(15000, "Clarince");
        FurnitureShop shop = new FurnitureShop();

        Bookshelf bookshelf = new Bookshelf(150, 480, 120, 75);
        Table tableOne = new Table(220, 170, 650, 11);
        Table tableTwo = new Table(350, 50, 450, 6);
        Chair chairOne = new Chair(75, 75, 30, false);
        Chair chairTwo = new Chair(24, 87, 40, true);
        Carpet carpet = new Carpet(350, 5, 500, true );

        shop.addItem(bookshelf, 350);
        shop.addItem(tableOne, 320);
        shop.addItem(tableTwo, 450);
        shop.addItem(chairOne, 210);
        shop.addItem(chairTwo, 110);
        shop.addItem(carpet, 250);

        shop.showItems();

        customer.addProduct(shop, 3);
        customer.addProduct(shop, 6);

        System.out.println();

        shop.showItems();

        System.out.println();
        System.out.println(customer.getBalance());
    }
}
