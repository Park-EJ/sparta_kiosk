package com.example.kiosk.level4;

public class MenuItem {

    String menuName;
    double menuPrice;
    String menuDetail;

    public MenuItem(String menuName, double menuPrice, String menuDetail) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDetail = menuDetail;
    }

    @Override
    public String toString() {
        return menuName + " | W " + menuPrice + " | " + menuDetail;
    }
}
