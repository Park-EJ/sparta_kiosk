package com.example.kiosk.level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    public final List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");

            int menuInput = 0;

            try {
                menuInput = sc.nextInt();
                if (menuInput == 0) {
                    System.out.println("종료되었습니다.");
                    break;
                } else if (menuInput < 0 || menuInput > 3) {
                    System.out.println("잘못 입력하였습니다.");
                    System.out.println("다시 입력하세요.");
                    System.out.println();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("잘못 입력하였습니다.");
                System.out.println("다시 입력하세요.");
                sc.nextLine();
                System.out.println();
                continue;
            }


            while (true) {
                Menu selecteMenu = menus.get(menuInput - 1);
                System.out.println();
                System.out.println("[ " + selecteMenu.getCategory().toUpperCase() + " MENU ]");
                selecteMenu.printMenuItems();
                System.out.println("0. 뒤로가기");

                int menuItemInput = 0;

                try {
                    menuItemInput = sc.nextInt();
                    if (menuItemInput == 0) {
                        System.out.println("이전 단계로 이동합니다.");
                        break;
                    } else if (menuItemInput < 0 || menuItemInput > 4) {
                        System.out.println("잘못 입력하였습니다.");
                        System.out.println("다시 입력하세요.");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("잘못 입력하였습니다.");
                    System.out.println("다시 입력하세요.");
                    sc.nextLine();
                    continue;
                }

                System.out.println("선택한 메뉴 : " + selecteMenu.getMenuItems().get(menuItemInput - 1));
                break;
            }
            System.out.println();
        }
    }
}