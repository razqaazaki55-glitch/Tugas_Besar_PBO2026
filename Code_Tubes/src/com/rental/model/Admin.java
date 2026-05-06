package com.rental.model;

public class Admin extends User {
    
    public Admin(String username, String password) {
        super(username, password, Role.ADMIN);
    }

    @Override
    public void getMenu() {
        System.out.println("=== DASHBOARD ADMIN ===");
        System.out.println("1. Tambah Kendaraan");
        System.out.println("2. Lihat Kendaraan");
        System.out.println("3. Hapus Kendaraan");
        System.out.println("0. Logout");
    }
    
}
