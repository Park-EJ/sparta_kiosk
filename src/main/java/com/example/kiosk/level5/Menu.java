package com.example.kiosk.level5;

import java.util.List;

public class Menu {

    private List<MenuItem> menuItems;
    private String category;

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public void printMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getMenuName() + "\t| W " + menuItem.getMenuPrice() + " | " + menuItem.getMenuDetail());
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}



