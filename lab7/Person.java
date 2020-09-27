package ru.mirea.lab7;
import java.util.ArrayList;
public class Person {
    private ArrayList<Furniture> ShoppingList;
    private double balance;
    private String name;

    public Person(ArrayList<Furniture> shoppingBag, double balance, String name) {
        this.ShoppingList = shoppingBag;
        this.balance = balance;
        this.name = name;
    }

    public Person(double balance, String name) {
        this.balance = balance;
        this.name = name;
        ShoppingList = new ArrayList<>();
    }

    public ArrayList<Furniture> getShoppingList() {
        return ShoppingList;
    }

    public void setShoppingList(ArrayList<Furniture> shoppingList) {
        this.ShoppingList = shoppingList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(FurnitureShop shop, int id){
        balance -= shop.getPrice(id);
        ShoppingList.add(shop.removeItem(id));
    }
}
