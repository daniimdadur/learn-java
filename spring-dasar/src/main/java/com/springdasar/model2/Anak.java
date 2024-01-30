package com.springdasar.model2;

public class Anak {
    private String name;
    private String gender;
    private Integer umur;
    private String tl;
    private Alamat alamat;
    private String  namaAyah;
    private String namaIbu;

    public Anak(String name, String gender, Integer umur, String tl, Alamat alamat, String namaAyah, String namaIbu) {
        this.name = name;
        this.gender = gender;
        this.umur = umur;
        this.tl = tl;
        this.alamat = alamat;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }
}
