package com.rental.model;

public abstract class Kendaraan {

    private String platNomor;
    private String merek;
    private double hargaPerHari;
    private StatusKendaraan status;

    public Kendaraan() {
    }

    public Kendaraan(String platNomor, String merek, double hargaPerHari, StatusKendaraan status) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.hargaPerHari = hargaPerHari;
        this.status = status;
    }

    public abstract double hitungDenda(int hariTerlambat);

    public String getInfo() {
        return platNomor + " - " + merek;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHargaPerHari() {
        return hargaPerHari;
    }

    public void setHargaPerHari(double hargaPerHari) {
        this.hargaPerHari = hargaPerHari;
    }

    public StatusKendaraan getStatus() {
        return status;
    }

    public void setStatus(StatusKendaraan status) {
        this.status = status;
    }
}
