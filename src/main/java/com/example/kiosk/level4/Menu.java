package com.example.kiosk.level4;


import java.util.List;

public class Menu {

    public List<MenuItem> menuItems;
    public String category;

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public void printMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.menuName + "\t| W " + menuItem.menuPrice + " | " + menuItem.menuDetail);
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategory() {
        return category;
    }
}



