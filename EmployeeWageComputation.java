import java.util.*;
public class uc4_EmployeeWage_Computation_for_A_month{
           
           
       public static void main(String[] args){
           int hrs=0;
           int wage;
           int rate=20;
           int totalwage=0;
            for (int day=0; day<20; day++)
            {
            Random rnum = new Random();
            int checker = rnum.nextInt(3);
           
            switch (checker) {
            
          
              case 1:
                  hrs = 8;
                  break;
                  
              case 0:
                  hrs=4;
                  break;
                  
              default:
                  hrs=0;
          
                 }  
           wage = hrs * rate;
            totalwage += wage ;
            System.out.println(wage);
        }
         System.out.println(totalwage);
            
        
    }
 }
