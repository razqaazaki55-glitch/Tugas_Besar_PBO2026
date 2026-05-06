package com.rental.model;

public class Pelanggan {

    private String nomorKTP;
    private String namaLengkap;
    private String noTelepon;
    private int jumlahTransaksi;
    private MembershipLevel membership;

    public Pelanggan() {
    }

    public Pelanggan(String nomorKTP,
                      String namaLengkap,
                      String noTelepon) {

        this.nomorKTP = nomorKTP;
        this.namaLengkap = namaLengkap;
        this.noTelepon = noTelepon;
        this.jumlahTransaksi = 0;
        this.membership = MembershipLevel.REGULER;
    }

    public void updateMembership() {

        if (jumlahTransaksi > 10) {
            membership = MembershipLevel.GOLD;
        } else if (jumlahTransaksi >= 5) {
            membership = MembershipLevel.SILVER;
        } else {
            membership = MembershipLevel.REGULER;
        }
    }

    public double getDiskon() {
        return membership.getDiskon() / 100.0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void setJumlahTransaksi(int jumlahTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
    }

    public MembershipLevel getMembership() {
        return membership;
    }

    public void setMembership(MembershipLevel membership) {
        this.membership = membership;
    }
}
