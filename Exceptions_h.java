import java.io.*; 
class Test{ 
void divide(){ 
int a = 5; 
int b = 0; 
try{ 
    System.out.println(a / b);  
}
catch (ArithmeticException e){ 
    System.out.println("Divided by zero operation cannot possible");  } 
} 
void array(){ 
    int ar[] = { 1, 2, 3, 4, 5 }; 
    try { 
        for (int i = 0; i <= ar.length; i++) 
            System.out.print(ar[i]+" "); 
    } 
    catch (ArrayIndexOutOfBoundsException e) { 
        System.out.println("\nException caught"); 
    } 
} 
void pointer(){ 
    String ptr = null; 
    try{ 
        if (ptr.equals("Atif")) 
            System.out.print("Same"); 
        else  
            System.out.print("Not Same"); 
    } 
    catch(NullPointerException e){
        System.out.print("NullPointerException Caught");  } 
    } 
}
class Exceptions_h { 
    public static void main(String[] args){ 
        Test obj=new fun(); 
        obj.divide(); 
        obj.array();
        obj.pointer(); 
    } 
}
