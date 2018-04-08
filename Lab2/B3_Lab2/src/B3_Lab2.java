
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
public class B3_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ: ");
        double a = scanner.nextDouble();
        if(a <= 50) System.out.print("Số tiền phải trả:  "+ a*1000 +"đ ");
        else System.out.printf("Số tiền phải trả:  "+ (50*1000+(a-50)*1200)+"đ ");
    }
    
}
