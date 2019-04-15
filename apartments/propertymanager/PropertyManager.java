package com.epam.apartments.propertymanager;

import com.epam.apartments.engine.menu.Menu;

public class PropertyManager {
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        menu.requestListener();
    }
}
