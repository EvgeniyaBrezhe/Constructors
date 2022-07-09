package ua.hillel;

import java.util.Arrays;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] menu;

        Pizza tradizionale = new Pizza(30, new String[]{"ham", "tomatoes", "mozzarella"}, "Traditional pizza", 17.30);
        Pizza napoletana = new Pizza(30, new String[]{"tomatoes", "mozzarella", "basil"}, "Neapolitan pizza ", 15.70);
        Pizza quattroFormaggi = new Pizza(30, new String[]{"ham", "tomatoes", "mozzarella"}, "Four Cheese pizza", 12.60);

        menu = new Pizza[]{tradizionale, napoletana, quattroFormaggi};

        System.out.println("Our menu: ");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Name: " + menu[i].name);
            System.out.println("Ingredients: " + Arrays.toString(menu[i].composition));
            System.out.println("Standard size (diameter): " + menu[i].basis.radius * 2);
            System.out.println("Price: " + menu[i].cost);
            System.out.println("----");
        }
    }
}
