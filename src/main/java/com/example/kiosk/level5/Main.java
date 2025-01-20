package com.example.kiosk.level5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Menu burgersMenu = new Menu("Burgers", new ArrayList<>());
        burgersMenu.getMenuItems().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.getMenuItems().add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.getMenuItems().add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.getMenuItems().add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinksMenu = new Menu("Drinks", new ArrayList<>());
        drinksMenu.getMenuItems().add(new MenuItem("Coke", 2.0, "코카콜라"));
        drinksMenu.getMenuItems().add(new MenuItem("Sprite", 2.0, "스프라이트"));
        drinksMenu.getMenuItems().add(new MenuItem("Fanta", 2.5, "환타 파인애플"));
        drinksMenu.getMenuItems().add(new MenuItem("Welch's", 2.5, "웰치스 포도"));

        Menu dessertsMenu = new Menu("Desserts", new ArrayList<>());
        dessertsMenu.getMenuItems().add(new MenuItem("Brownie", 4.0, "브라우니"));
        dessertsMenu.getMenuItems().add(new MenuItem("Cheese Cake", 5.0, "치즈케이크"));
        dessertsMenu.getMenuItems().add(new MenuItem("Cookie", 3.0, "초코칩 쿠키"));
        dessertsMenu.getMenuItems().add(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));

        Kiosk kiosk = new Kiosk(new ArrayList<>());
        kiosk.getMenus().add(burgersMenu);
        kiosk.getMenus().add(drinksMenu);
        kiosk.getMenus().add(dessertsMenu);

        kiosk.start();
    }
}
 