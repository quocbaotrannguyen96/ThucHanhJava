
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
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh khối lập phương: ");
        double a = scanner.nextDouble();
        System.out.printf("Thể tích khối lập phương: %.3f ",Math.pow(a,3));        
    }
    
}
