package com.springdasar.model2;

import java.util.List;

public class Keluarga {
    private Integer noKK;
    private Ayah kepalaKeluarga;
    private Ibu ibu;
    private List<Anak> anak;

    public Keluarga(Integer noKK, Ayah kepalaKeluarga, Ibu ibu, List<Anak> anak) {
        this.noKK = noKK;
        this.kepalaKeluarga = kepalaKeluarga;
        this.ibu = ibu;
        this.anak = anak;
    }

    public Integer getNoKK() {
        return noKK;
    }

    public void setNoKK(Integer noKK) {
        this.noKK = noKK;
    }

    public Ayah getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public void setKepalaKeluarga(Ayah kepalaKeluarga) {
        this.kepalaKeluarga = kepalaKeluarga;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public void setIbu(Ibu ibu) {
        this.ibu = ibu;
    }

    public List<Anak> getAnak() {
        return anak;
    }

    public void setAnak(List<Anak> anak) {
        this.anak = anak;
    }
}
