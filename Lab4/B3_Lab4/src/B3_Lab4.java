import java.util.Scanner;


class SanPham{
    public String tenSP;  
    public double donGia;
    public double giamGia;
    private double getThue(){
        return donGia*0.1;
       
        
    }
    /*public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên SP : ");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá : ");
        donGia = sc.nextDouble();
        System.out.print("Nhập tỉ lệ giảm giá : ");
        giamGia = sc.nextDouble();
        
    }*/
    public void Xuat(){
        System.out.print("_____________________________________\n");
        System.out.print("THÔNG TIN SP :\n");
        System.out.print("Tên SP : "+tenSP+"\n");
        System.out.print("Giá SP : "+donGia+"\n");
        System.out.print("Mức giảm giá SP : "+giamGia+"\n");
        System.out.println("Thuế nhập khẩu : "+ getThue());
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
public class B3_Lab4 {

    
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Vinamilk",60000);
        SanPham sp2 = new SanPham("Gạo thơm",52000,0.2);
        //sp1.Nhap();
        //sp2.Nhap();
        sp1.Xuat();
        sp2.Xuat();
        
    }
    
}
