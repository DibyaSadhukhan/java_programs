import java.util.Scanner;
class CGPA{
    public float calculateCGPA(float marks1,float marks2,float marks3,int n){
        // marks entered are out of 100 so we add them then divide it by the number of 
        //subject into 10 to turn the numbers into grades
        return ((marks1+marks2+marks3)/(n*10));
    }   
    public static void main(String[] args){
        CGPA ob = new CGPA();      
        System.out.println("Enter marks out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        float marks1= sc.nextFloat();
        System.out.println("Enter marks of subject 2");
        float marks2= sc.nextFloat();
        System.out.println("Enter marks of subject 3");
        float marks3= sc.nextFloat();
        sc.close();
        System.out.println("CGPA is :"+ob.calculateCGPA(marks1,marks2,marks3,3));
        
    }  
}