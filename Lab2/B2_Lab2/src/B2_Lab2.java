
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
public class B2_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập giá trị a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập giá trị b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập giá trị c: ");
            double c = scanner.nextDouble();
            if(a==0){
                if(b==0){
                    if(c==0){
                        System.out.print("PT có vô số nghiệm! ");
                            }
                    else{
                        System.out.print("PT vô nghiệm! ");
                        }
                }
                else{
               
                    System.out.printf("Nghiệm của PT là: %.2f",(-c/b));
                    }
                }
            else{
                int Delta = (int) (Math.pow(b,2)-4*a*c);
                if(Delta < 0) System.out.print("PT vô nghiệm! ");
                if(Delta == 0) System.out.printf("PT có nghiệm kép: %.3f ",(-b/(2*a)));
                if(Delta > 0) {
                System.out.print("PT có 2 nghiệm phân biệt: ");
                System.out.printf("X1: %.3f %n",((-b+(Math.sqrt(Delta)))/(2*a)));
                System.out.printf("X1: %.3f",((-b-(Math.sqrt(Delta)))/(2*a)));
                                }
                }
    }
}    

