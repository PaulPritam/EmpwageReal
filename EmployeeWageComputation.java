import java.util.*;
public class uc5_EmployeeWage_Computation_Using_Switch_Case{
           
           
       public static void main(String[] args){
           int hrs=0;
           int wage;
           int rate=20;
            Random rnum = new Random();
            int checker = rnum.nextInt(3);
            switch (checker) {
            
          
              case 1:
                  hrs = 8;
                  wage= hrs*rate;
                  System.out.println("the employee wage for full time employee is ");
                  System.out.println(wage);
                  break;
              case 0:
                  hrs=4;
                   wage= hrs*rate;
                   System.out.println("the employee wage for part time employee is ");
                  System.out.println(wage);
                  break;
              default:
              
              System.out.println("the employee is absent ");
          }
            
        
         }
      }
