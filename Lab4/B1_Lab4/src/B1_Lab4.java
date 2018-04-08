
import java.util.Scanner;

class SanPham1{
    String tenSP;  
    double donGia;
    double giamGia;
    public double getThue(){
        return donGia*0.1;
       
        
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên SP: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập tỉ lệ giảm giá: ");
        giamGia = sc.nextDouble();
        
    }
    public void Xuat(){
        System.out.print("_____________________________________\n");
        System.out.print("THÔNG TIN SP:\n");
        System.out.print("Tên SP: "+tenSP+"\n");
        System.out.print("Giá SP: "+donGia+"\n");
        System.out.print("Mức giảm giá SP: "+giamGia+"\n");
        System.out.println("Thuế nhập khẩu : "+ getThue());
    }
        
    
    
     
        
    
    
}

public class B1_Lab4 {
    public static void main(String[] args) {
        SanPham1 sp1 = new SanPham1();
        sp1.Nhap();
        sp1.Xuat();
        sp1.getThue();
    }   
}    
