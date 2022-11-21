package com.example.baikt2;

public class CayXanh {
    private String TenKhoaHoc;
    private String TenThuongGoi;
    private String DacTinh;
    private String MauLa;
    private int Hinh;

    public CayXanh(String tenkhoahoc, String tenthuonggoi, String dactinh, String maula, int hinh) {
        TenKhoaHoc = tenkhoahoc;
        TenThuongGoi = tenthuonggoi;
        DacTinh = dactinh;
        MauLa = maula;
        Hinh = hinh;
    }

    public String getTenKhoaHoc() {
        return TenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenkhoahoc) {
        TenKhoaHoc = tenkhoahoc;
    }

    public String getTenThuongGoi() {
        return TenThuongGoi;
    }

    public void setTenThuongGoi(String tenthuonggoi) {
        TenKhoaHoc = tenthuonggoi;
    }

    public String getDacTinh() {
        return DacTinh;
    }

    public void setDacTinh(String dactinh) {
        DacTinh = dactinh;
    }

    public String setMauLa() {
        return MauLa;
    }

    public void setMauLa(String maula) {
        MauLa = maula;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

}
