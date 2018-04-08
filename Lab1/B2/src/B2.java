
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
public class B2 {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();
        System.out.printf("Chu vi HCN: %.2f %n",((chieuDai + chieuRong)*2));
        System.out.printf("Diện tích HCN: %.2f %n",chieuDai * chieuRong);
        System.out.printf("Cạnh nhỏ nhất HCN: %.2f ",Math.min(chieuDai, chieuRong));
    }
    
}
