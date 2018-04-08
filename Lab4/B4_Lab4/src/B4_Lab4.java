import java.util.Scanner;


class SanPham{
    private String tenSP;  
    private double donGia;
    private double giamGia;
    private double getThue(){
        return donGia*0.1;
       
        
    }
    public void Xuat(){
        System.out.print("_____________________________________\n");
        System.out.print("THÔNG TIN SP :\n");
        System.out.print("Tên SP : "+gettenSP()+"\n");
        System.out.print("Giá SP : "+getdonGia()+"\n");
        System.out.print("Mức giảm giá SP : "+getgiamGia()+"\n");
        System.out.println("Thuế nhập khẩu : "+ getThue());
    }
    public String gettenSP(){
        return this.tenSP;
    }
    public void settenSP(String tenSP){
        this.tenSP=tenSP;
    }
    public double getdonGia(){
        return this.donGia;
    }
    public void setdonGia(double donGia){
        this.donGia=donGia;
    }
    public double getgiamGia(){
        return this.giamGia;
    }
    public void setgiamGia(double giamGia){
        this.giamGia=giamGia;
    }
    public SanPham(String tenSP, double donGia,double giamGia){
        this.tenSP=tenSP;
        this.donGia=donGia;
        this.giamGia=giamGia;
    }
    public SanPham(String tenSP,double donGia){
        this(tenSP,donGia,0);
    }
}    
public class B4_Lab4 {

   
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Vinamilk",60000);
        sp1.Xuat();
    }
    
}
