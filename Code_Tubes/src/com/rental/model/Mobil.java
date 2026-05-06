package com.rental.model;

public class Mobil extends Kendaraan {

    private int jumlahPintu;
    private String transmisi;

    public Mobil() {
    }

    public Mobil(String platNomor, String merek, double hargaPerHari, StatusKendaraan status, int jumlahPintu, String transmisi) {

        super(platNomor, merek, hargaPerHari, status);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 50000;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }
}
