/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quocb
 */
public class SinhVien {
    private int STT;
    private String name;
    private String gioiTinh;
    private String namSinh;
    public void setSTT(int stt){
        this.STT = stt;
    }
    public int getSTT(){
        return STT;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNamSinh(String namSinh){
        this.namSinh = namSinh;
    }
    public String getNamSinh(){
        return namSinh;
    }
}
