package com.rental.model;

public class Owner extends User {

    public Owner(String username, String password) {
        super(username, password, Role.OWNER);
    }

    @Override
    public void getMenu() {
        System.out.println("=== DASHBOARD OWNER ===");
        System.out.println("1. Laporan Pendapatan");
        System.out.println("0. Logout");
    }
}
