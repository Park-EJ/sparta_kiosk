package com.example.kiosk.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        Scanner sc = new Scanner(System.in);

        int selectMenu;

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.menuName + "\t| W " + menuItem.menuPrice + " | " + menuItem.menuDetail);
            }

            System.out.println("0. 종료      | 종료");

            System.out.println("원하는 메뉴 번호를 입력하세요.");

            selectMenu = sc.nextInt();

            if (selectMenu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (selectMenu == 1) {
                System.out.println("ShackBurger를 선택하였습니다.");
            } else if (selectMenu == 2) {
                System.out.println("SmokeShack 선택하였습니다.");
            } else if (selectMenu == 3) {
                System.out.println("Cheeseburger를 선택하였습니다.");
            } else if (selectMenu == 4) {
                System.out.println("Hamburger를 선택하였습니다.");
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }
}