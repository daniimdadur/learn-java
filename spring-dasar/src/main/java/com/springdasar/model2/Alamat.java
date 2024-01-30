package com.springdasar.model2;

public class Alamat {
    private String dusun;
    private Integer rtrw;
    private String desa;
    private String kec;
    private String kab;
    private String prov;
    private String country;

    public Alamat(String dusun, Integer rtrw, String desa, String kec, String kab, String prov, String country) {
        this.dusun = dusun;
        this.rtrw = rtrw;
        this.desa = desa;
        this.kec = kec;
        this.kab = kab;
        this.prov = prov;
        this.country = country;
    }

    public String getDusun() {
        return dusun;
    }

    public void setDusun(String dusun) {
        this.dusun = dusun;
    }

    public Integer getRtrw() {
        return rtrw;
    }

    public void setRtrw(Integer rtrw) {
        this.rtrw = rtrw;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKec() {
        return kec;
    }

    public void setKec(String kec) {
        this.kec = kec;
    }

    public String getKab() {
        return kab;
    }

    public void setKab(String kab) {
        this.kab = kab;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
