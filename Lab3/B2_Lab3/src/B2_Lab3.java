
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
public class B2_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("BCC: \n");
        
        for(int j=1;j<=9;j++){
        for(int i =1;i<=10;i++){
            System.out.print(j+"*"+i+"="+j*i+"\n");
           
        }
     System.out.println();
        }
    }
    
}
