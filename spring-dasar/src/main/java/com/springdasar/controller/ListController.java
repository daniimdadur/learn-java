package com.springdasar.controller;

import com.springdasar.model.Dosen;
import com.springdasar.model.Kelas;
import com.springdasar.model.Mahasiswa;
import com.springdasar.model.MataKuliah;
import com.springdasar.model2.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {
    @GetMapping
    public ResponseEntity<Object> data(){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen("Dani","S.kom","123");
        MataKuliah mataKuliah = new MataKuliah("1212","OOP","3");

        List<Mahasiswa> mahasiswa = Arrays.asList(
                new Mahasiswa("Dani",20,"Informatika","Teknik",6),
                new Mahasiswa("Sabil",30,"Pertanian","Teknik",12)
        );
        Kelas kelas = new Kelas("K123",mataKuliah,dosen,"Senin",mahasiswa);
        result.add(kelas);

        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/list2")
    public ResponseEntity<Object> data2(){
        List<Keluarga> result2 = new ArrayList<>();

        Ayah ayah = new Ayah("Joko","Ciamis","Pamarican","Job Develoment",20_000_000,"Fulan","Fulanah",2);
        Ibu ibu = new Ibu("Vida","Bekasi","Cikarang","Translator",20_000_000,"Fulan","Fulanah",1);
        Alamat alamatAyah = new Alamat("Ciparakan",9-4,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia");
        Alamat alamatAnak = new Alamat("Ciparakan",9-4,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia");

        List<Anak> anak = Arrays.asList(
                new Anak("Syahsu","Laki-laki",17,"Ciamis",alamatAnak,"Dani","Vida"),
                new Anak("Fulanah","Perempuan",15,"Ciamis",alamatAnak,"Dani","Vida")
        );
        Keluarga keluarga = new Keluarga(1322,ayah,ibu,anak);
        result2.add(keluarga);

        return ResponseEntity.ok().body(result2);
    }
}
