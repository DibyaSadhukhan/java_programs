public class EmployeDetails { 
    int Salary; 
    String name; 
    public int getSalary(){ 
        return Salary; 
    } 
    public String getName(){  
        return name;  
    }  
    public void setName(String name){  
        this.name = name;  
    }  
} 
class Employee1{ 
    public static void main(String[] args){ 
    EmployeDetails obj=new EmployeDetails(); 
    obj.getSalary(); 
    obj.getName(); 
    obj.setName("Dibya"); 
    } 
} 
