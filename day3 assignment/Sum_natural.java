import java.util.Scanner;

public class Sum_natural{ 
    public int addNumbers(int num) {
        if (num != 0) 
        return num + addNumbers(num - 1); 
        else 
        return num; 
    }
    public static void main(String[] args) { 
        int number = 0;
        Scanner sc =new Scanner(System.in); 
        Sum_natural ob =new Sum_natural();
        number=sc.nextInt();
        int sum = ob.addNumbers(number); 
        System.out.println("Sum = " + sum);
        sc.close();
    }  
   } 
   