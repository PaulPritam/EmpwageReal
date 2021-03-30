import java.util.*;
public class uc2_EmployeeWage_Computation{
       public static void main(String[] args){
           int wage;
            Random rnum = new Random();
            int num = rnum.nextInt(2);
            System.out.println(num);
          if ( num == 1)
          {
              wage = 8*20;
              System.out.println("the employee wage per day is ");
              System.out.println(wage);
          }
          else 
          {
              System.out.println("the employee wage is 0");
          }
          }
       }
