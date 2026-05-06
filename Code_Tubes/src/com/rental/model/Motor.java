package com.rental.model;

public class Motor extends Kendaraan {

    private String jenisTransmisi;

    public Motor() {
    }

    public Motor(String platNomor,
                  String merek,
                  double hargaPerHari,
                  StatusKendaraan status,
                  String jenisTransmisi) {

        super(platNomor, merek, hargaPerHari, status);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 20000;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }
}
