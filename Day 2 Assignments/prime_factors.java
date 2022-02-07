import java.util.Scanner;
public class prime_factors{
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number:");    
        int num=sc.nextInt();    
        int factors;    
        for(int i=1;i<num;i++){        
            factors=num%i;        
            if(factors==0 && isPrime(factors))        
                System.out.println(i+"");    
        }    
        sc.close();
    }
    public static boolean isPrime(int n){    
        boolean prime=true;    
        for(int i=2;i<n;i++){        
            if(n%i==0){            
                prime=false;            
                break;        
            }    
        }    
        return prime;
    }
}
