import java.util.Scanner;

public class Fibonacci { 
    public int fib(int n) { 
        if (n <= 1) 
            return n; 
        return fib(n-1) + fib(n-2); 
    } 
  
    public static void main (String args[]){ 
        int n = 0;
        Scanner sc = new Scanner(System.in); 
        Fibonacci ob = new Fibonacci();
        n=sc.nextInt();
        System.out.println(ob.fib(n)); 
        sc.close();
    } 
} 
