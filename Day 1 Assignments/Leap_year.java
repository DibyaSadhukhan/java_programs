import java.util.Scanner;
public class Leap_year {
    public boolean check_leap(int year){
        if (year%100==0){
            if ((year/100)%4==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(year%4==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year to check year");
        int year = sc.nextInt();
        sc.close();
        Leap_year ob= new Leap_year();
        System.out.println(ob.check_leap(year));
    }
}
