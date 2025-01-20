package com.example.kiosk.level5;

public class MenuItem {

    private String menuName;
    private double menuPrice;
    private String menuDetail;

    public MenuItem(String menuName, double menuPrice, String menuDetail) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDetail = menuDetail;
    }

    @Override
    public String toString() {
        return menuName + " | W " + menuPrice + " | " + menuDetail;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuDetail() {
        return menuDetail;
    }

    public void setMenuDetail(String menuDetail) {
        this.menuDetail = menuDetail;
    }
}
