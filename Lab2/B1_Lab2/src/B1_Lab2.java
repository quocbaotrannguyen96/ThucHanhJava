
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
public class B1_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập giá trị a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập giá trị b: ");
            double b = scanner.nextDouble();
            if(a==0){
                if(b==0){
                    System.out.print("PT có vô số nghiệm! ");
                }
                else{
                    System.out.print("PT vô nghiệm! ");
                }
            }
            else{
               
                System.out.printf("Nghiệm của PT là: %.2f",(-b/a));
            }
            
    }
    
}
