import java.util.*;
public class uc3_EmployeeWage_Computation_with_Part_Time_Employee{
       public static void main(String[] args){
           int wage;
            Random rnum = new Random();
            int num = rnum.nextInt(3);
            System.out.println(num);
          if ( num == 0)
          {
              wage = 8*20;
              System.out.println("the employee wage is ");
              System.out.println(wage);
          }
          else if ( num == 1) 
          {
              wage = 4*20;
              System.out.println("wage of the part time employee is ");
              System.out.println(wage);
          }
          else 
          {
              System.out.println("the employee is absent");
          }
         }
      }
