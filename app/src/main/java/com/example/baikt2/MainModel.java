package com.example.baikt2;

public class MainModel {
    String name, name2, dactinh, maula, img;

    MainModel(){

    }

    public MainModel(String name,String name2, String dactinh, String maula, String img) {
        this.name = name;
        this.name2 = name2;
        this.dactinh = dactinh;
        this.maula = maula;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getMauLa() {
        return maula;
    }

    public void setMauLa(String maula) {
        this.maula = maula;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}

