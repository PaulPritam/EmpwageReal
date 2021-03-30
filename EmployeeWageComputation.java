import java.util.*;
public class uc6_EmployeeWage_Computation_conditional{
           
           
       public static void main(String[] args){
           int hrs= 0;
           int wage;
           int rate= 20;
           int totalwage= 0;
           int workingdays=0;
           int max_days= 20;
           int total_emphrs = 0;
           int max_hrs=100;
           while ( total_emphrs <= max_hrs && workingdays < max_days ) {
               int emp_hrs = 0;
               workingdays++;
               
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
