import java.util.*;
public class uc1{
       public static void main(String[] args){
            Random rnum = new Random();
            int num = rnum.nextInt(2);
            System.out.println(num);
            if (num==1){
           System.out.println("employee is present");
            }
            else{
            System.out.println("employee is absent");
        }
       }
}