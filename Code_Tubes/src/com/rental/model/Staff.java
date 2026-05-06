package com.rental.model;

public class Staff extends User {

    public Staff(String username, String password) {
        super(username, password, Role.STAFF);
    }

    @Override
    public void getMenu() {
        System.out.println("=== DASHBOARD STAFF ===");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Cari Pelanggan");
        System.out.println("3. Lihat Kendaraan Tersedia");
        System.out.println("4. Proses Sewa");
        System.out.println("5. Pengembalian");
        System.out.println("0. Logout");
    }
}
