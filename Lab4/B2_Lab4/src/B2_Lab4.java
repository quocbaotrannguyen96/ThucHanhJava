
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
        System.out.print("Nhập tên SP 1: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá 1: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập tỉ lệ giảm giá 1: ");
        giamGia = sc.nextDouble();
        
    }
    public void Xuat(){
        System.out.print("_____________________________________\n");
        System.out.print("THÔNG TIN SP 1:\n");
        System.out.print("Tên SP 1: "+tenSP+"\n");
        System.out.print("Giá SP 1: "+donGia+"\n");
        System.out.print("Mức giảm giá SP 1: "+giamGia+"\n");
        System.out.println("Thuế nhập khẩu 1: "+ getThue());
    }    
}
class SanPham2{
    String tenSP;  
    double donGia;
    double giamGia;
    public double getThue(){
        return donGia*0.1;
       
        
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên SP 2: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá 2: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập tỉ lệ giảm giá 2: ");
        giamGia = sc.nextDouble();
        
    }
    public void Xuat(){
        System.out.print("_____________________________________\n");
        System.out.print("THÔNG TIN SP 2:\n");
        System.out.print("Tên SP 2: "+tenSP+"\n");
        System.out.print("Giá SP 2: "+donGia+"\n");
        System.out.print("Mức giảm giá SP 2: "+giamGia+"\n");
        System.out.println("Thuế nhập khẩu 2: "+ getThue());
    }    
}
public class B2_Lab4 {

    
    public static void main(String[] args) {
        SanPham1 sp1 = new SanPham1();
        SanPham2 sp2 = new SanPham2();
        sp1.Nhap();
        sp2.Nhap();
        sp1.Xuat();
        sp2.Xuat();
        sp1.getThue();
        sp2.getThue();
    }
    
}
