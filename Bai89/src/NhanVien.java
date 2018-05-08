/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quocb
 */
public class NhanVien {
    private String maNV;
    private String phanXuong;
    private int soSP;
    
    
    public void setmaNV(String maNV){
        this.maNV = maNV;
    }
    public String getmaNV(){
        return maNV;
    }
    
    public void setphanXuong(String phanXuong){
        this.phanXuong = phanXuong;
    }
    public String getphanXuong(){
        return phanXuong;
    }
    
    public void setsoSP(int soSP){
        this.soSP = soSP;
    }
    public int getsoSP(){
        return soSP;
    }
    public int getChuan() {
        if(this.phanXuong.equals("A")){
            return 300;
        }
        else{
            return 500;
        }
    }
    public boolean VuotChuan(){
        return this.soSP>this.getChuan();
    }
    public float TinhLuong(){
        if(this.VuotChuan()==true){
            return this.soSP*30000;
        }
        else{
            return this.soSP*20000;
        }
    }
    
    
}
