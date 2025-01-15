package com.example.kiosk.level3;

import com.example.kiosk.level3.MenuItem;
import com.example.kiosk.level3.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

   private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    Scanner sc = new Scanner(System.in);

    int selectMenu;

    public void start () {
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
