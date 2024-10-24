package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class StoreAppHashMAP {
    public static void main(String[] args) {
        //ArrayList<Product> inventory = getInventory();
        HashMap<String, Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }



    public static HashMap<String ,Product> getInventory() {
        var inventory = new HashMap();
        // this method loads product objects into inventory
        // and its details are not shown
        return inventory;
    }
}
