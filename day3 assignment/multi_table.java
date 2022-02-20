import java.util.Scanner; 
public class multi_table{ 
    void table(int num){ 
        int n=num; 
        int i,k; 
        for (i=1;i<=10;i++){ 
            k = n * i; 
            System.out.println(n + "*"+ i + " = " + k); 
        } 
    } 
    public static void main(String[] args){ 
        multi_table obj=new multi_table(); 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Number for the table: "); 
        int n = sc.nextInt(); 
        obj.table(n); 
        sc.close();
    }
} 
