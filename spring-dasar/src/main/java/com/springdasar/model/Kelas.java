package com.springdasar.model;

import java.util.List;

public class Kelas {
    private String kode;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private String hari;
    private List<Mahasiswa> mahasiswa;

    public Kelas(String kode, MataKuliah mataKuliah, Dosen dosen, String hari, List<Mahasiswa> mahasiswa) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.mahasiswa = mahasiswa;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public List<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
