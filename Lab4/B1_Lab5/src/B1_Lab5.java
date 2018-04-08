
import java.util.ArrayList;
import java.util.Scanner;


public class B1_Lab5 {

    public static void main(String[] args) {       
       ArrayList<Double>list;
       list = new ArrayList<>();
       Scanner sc = new Scanner(System.in); 
       while(true){
           Double x = sc.nextDouble();
           list.add(x);
           System.out.print("Nhập thêm (Y/N)?");
           if(sc.nextLine().equals("N")){
               break;
           }
       }
       for(Double a: list)
        {System.out.print(a);}
    }
    
}
