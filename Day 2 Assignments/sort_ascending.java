import java.util.Scanner;
public class sort_ascending{    
    public static void main(String[] args){    
        int count, temp;        
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter number of elements you want in the array: ");        
        count = sc.nextInt();            
        int num[] = new int[count];        
        System.out.println("Enter array elements:");        
        for (int i = count-1; i >= 0; i--){            
            num[i] = sc.nextInt();        
        }        
        sc.close();        
        for (int i = count-1; i >= 0; i--){            
            for (int j = i - 1; j >= 0; j--){                 
                if (num[i] > num[j]){                    
                    temp = num[i];                    
                    num[i] = num[j];                    
                    num[j] = temp;                
                }            
            }        
        }        
        System.out.print("Array Elements in Descending Order: ");        
        for (int i = 0; i < count - 1; i++){            
            System.out.print(num[i] + ", ");        
        }        
        System.out.print(num[count - 1]);    
    }
}
