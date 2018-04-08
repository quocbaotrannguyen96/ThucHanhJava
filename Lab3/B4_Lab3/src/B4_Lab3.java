
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quocb
 */
public class B4_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien a[] = new SinhVien[n];
        String ten;
        String HL;
        int diem;
        
        for(int i = 0 ; i <n ; i ++){
             a[i] = new SinhVien();
            System.out.println("Moi ban nhap ten sinh vien");
            ten = sc.nextLine();
            a[i].setTen(ten);                        
            System.out.println("Moi ban nhap diem cho sinh vien");
            diem = sc.nextInt();
            a[i].setDiem(diem);
            sc.nextLine();
            
        }
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n ; j ++){
                if(a[i].getDiem() > a[j].getDiem()){
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("Thong tinh sinh vien sau khi sap xep la : ");
        for(int i = 0; i < n; i ++){
            System.out.println("Ten cua sinh vien la : " +a[i].getTen());           
            System.out.println("Diem cua sinh vien la : "+ a[i].getDiem());
        }
    }
    /*public void xepLoai(){
		if(a[i].getDiem() <5){
			System.out.println("Yeu");}
		else {if(5<= dTB && dTB<6.5){
			System.out.println("Trung Binh");}
			else{if(6.5<=dTB && dTB<8){
				System.out.println("Kha");}
				else{if(8<=dTB && dTB<=10){
					System.out.println("Gioi");}
				else{
					System.out.println("Ban nhap diem nham, diem phai trong khoang[0,10]");}
		}
			}
		}
	}*/
}

class SinhVien{
    private String ten;  
    private String HL;
    private int diem;
    public void setTen ( String ten) {
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }    
    public void setDiem(int diem){
        this.diem= diem;
    }
    public int getDiem (){
        return diem;
    }
    
        }
