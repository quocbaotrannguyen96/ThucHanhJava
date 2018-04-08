
import static java.lang.Math.min;
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
public class B3_Lab3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        
        
        sortASC(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
        TBC3(arr);
        

    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     
    
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void TBC3(int [] arr) {
        int t = 0;
        int c = 0;
        for (int i = 0 ; i < arr.length; i++) {
            {if (arr[i] % 3==0) {
                    t = t +arr[i];
                    c=c +1;
                    
                }
            }
        }
        System.out.printf("TBC các PT chia hết cho 3 = %d", t/c);
    }
}

    

