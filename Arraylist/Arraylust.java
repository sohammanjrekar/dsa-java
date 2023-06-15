package Arraylist;

import java.util.ArrayList;

public class Arraylust {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i : cars) {
            System.out.println(i);
        }

        // Access an Item
        System.out.println(cars.get(0));

        // Change an Item
        cars.set(0, "Opel");

        // Remove an Item
        cars.remove(0);

        // remove all the elements
        cars.clear();
        System.out.println(cars);

        // ArrayList Size
        System.out.println(cars.size());

    }
}
