package com.example.kiosk.level4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Menu burgersMenu = new Menu("Burgers", new ArrayList<>());
        burgersMenu.menuItems.add(new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.menuItems.add(new MenuItem("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.menuItems.add(new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinksMenu = new Menu("Drinks", new ArrayList<>());
        drinksMenu.menuItems.add(new MenuItem("Coke", 2.0, "코카콜라"));
        drinksMenu.menuItems.add(new MenuItem("Sprite", 2.0, "스프라이트"));
        drinksMenu.menuItems.add(new MenuItem("Fanta", 2.5, "환타 파인애플"));
        drinksMenu.menuItems.add(new MenuItem("Welch's", 2.5, "웰치스 포도"));

        Menu dessertsMenu = new Menu("Desserts", new ArrayList<>());
        dessertsMenu.menuItems.add(new MenuItem("Brownie", 4.0, "브라우니"));
        dessertsMenu.menuItems.add(new MenuItem("Cheese Cake", 5.0, "치즈케이크"));
        dessertsMenu.menuItems.add(new MenuItem("Cookie", 3.0, "초코칩 쿠키"));
        dessertsMenu.menuItems.add(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));

        Kiosk kiosk = new Kiosk(new ArrayList<>());
        kiosk.menus.add(burgersMenu);
        kiosk.menus.add(drinksMenu);
        kiosk.menus.add(dessertsMenu);

        kiosk.start();
    }
}
 