import java.util.Scanner;
public class income_tax {
    public float check_Tax(long Salary){
        if (Salary<250000){
                return (float)0;
        }
        else if(Salary<500000 && Salary>=250000){
                return (float).05*Salary;
        }
        else if(Salary<1000000 && Salary>=500000){
            return (float).20*Salary;
        }
        else{
            return (float).30*Salary;
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Salary:");
        long Salary = sc.nextInt();
        sc.close();
        income_tax ob= new income_tax();
        System.out.println("Your Tax is Rs."+ob.check_Tax(Salary));
    }
}

