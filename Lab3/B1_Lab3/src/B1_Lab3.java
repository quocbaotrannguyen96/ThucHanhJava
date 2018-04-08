
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
public class B1_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần kiểm tra: ");
        double a = scanner.nextDouble();
        boolean ok = true;
        for(int i = 2; i<a-1; i++){
            if(a%i==0){
                ok = false;
                System.out.print("Số vừa nhập không phải số nguyên tố! ");
                break;
            }
            
            
        }
        System.out.print("Số vừa nhập là số nguyên tố! ");
    }
    
}
