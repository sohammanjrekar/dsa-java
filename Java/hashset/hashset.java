package Java.hashset;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Volvo");
        System.out.println(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars.contains("Mazda"));
        cars.remove("Volvo");
        cars.clear();
        System.out.println(cars.size());
    }
}
