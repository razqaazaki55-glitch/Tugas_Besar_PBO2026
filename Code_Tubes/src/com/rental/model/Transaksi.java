package com.rental.model;

public class Transaksi {

    private String idTransaksi;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int durasiSewa;
    private int hariTerlambat;
    private StatusTransaksi statusTrx;
    private double totalBayar;

    public Transaksi() {
    }

    public double hitungTotal() {

        double biayaDasar = kendaraan.getHargaPerHari() * durasiSewa;

        double denda = kendaraan.hitungDenda(hariTerlambat);

        double subtotal = biayaDasar + denda;

        double diskon = subtotal * pelanggan.getDiskon();

        totalBayar = subtotal - diskon;

        return totalBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }

    public int getHariTerlambat() {
        return hariTerlambat;
    }

    public void setHariTerlambat(int hariTerlambat) {
        this.hariTerlambat = hariTerlambat;
    }

    public StatusTransaksi getStatusTrx() {
        return statusTrx;
    }

    public void setStatusTrx(StatusTransaksi statusTrx) {
        this.statusTrx = statusTrx;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}
