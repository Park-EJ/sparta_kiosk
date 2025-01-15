package com.example.kiosk.level3;

public class MenuItem {
    // 개별 음식 항목을 관리하는 클래스로 현재는 햄버거만 관리한다.

    String menuName;
    double menuPrice;
    String menuDetail;

    public MenuItem(String menuName, double menuPrice, String menuDetail) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDetail = menuDetail;
    }
}
