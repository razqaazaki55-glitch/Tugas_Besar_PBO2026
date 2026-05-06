package com.rental.model;

public enum MembershipLevel {
    REGULER(0),
    SILVER(10),
    GOLD(20);

    private final int diskon;

    MembershipLevel(int diskon) {
        this.diskon = diskon;
    }

    public int getDiskon() {
        return diskon;
    }
}
