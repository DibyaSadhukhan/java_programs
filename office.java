import java.util.*; 
class Person{ 
    String name; 
    String address; 
    String phone; 
    String email; 
    Person(){} 
    Person(String n,String a,String p,String e){ 
        name=n; 
        address=a; 
        phone=p; 
        email=e; 
    } 
    public String toString(){ 
        return name + "Person"; 
    }
    void input(){ 
        Scanner sc=new Scanner(System.in); 
        System.out.print("\tEnter name of person: "); 
        name=sc.next(); 
        System.out.print("\tEnter address of person: "); 
        address=sc.next(); 
        System.out.print("\tEnter phone no of person: ");  
        phone=sc.next(); 
        System.out.print("\tEnter email-id of person: "); 
        email=sc.next(); 
        sc.close();
    } 
    void display(){ 
        System.out.println("\n\t\tName : "+name); 
        System.out.println("\t\tAddress : "+address); 
        System.out.println("\t\tphone No. : "+phone); 
        System.out.println("\t\tEmail-id : "+email); 
    } 
    void update(){ 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\n\t\tPlease choose an option that you want to update"); 
        System.out.println("\t1. Name of Person: "); 
        System.out.println("\t2. Address of Person: "); 
        System.out.println("\t3. Phone no. of Person: ");
        System.out.println("\t4. Eamil-id of Person: "); 
        System.out.println("\t5. Exit"); 
        System.out.println("Please enter your option: "); 
        int option=sc.nextInt(); 
        switch(option){ 
            case 1: 
            { 
            System.out.println("\t\tEnter new name of Person: "); 
            name=sc.next(); 
            break; 
            } 
            case 2: 
            { 
            System.out.println("\t\tEnter new address of Person: "); 
            address=sc.next(); 
            break; 
            } 
            case 3: 
            { 
            System.out.println("\t\tEnter new phone no of Person: "); 
            phone=sc.next(); 
            break; 
            } 
            case 4:
            { 
            System.out.println("\t\tEnter new email-id of Person: "); 
            email=sc.next(); 
            break; 
            } 
            case 5: 
            { 
            System.out.println("\tSuccessfully Exited: "); 
            break; 
            } 
            default: 
            System.out.println("\tWrong input, Please choose correct option"); 
        } 
    } 
} 
class Student extends Person { 
    final String status = "Senior"; 
    public Student(String n, String a, String p, String e) { 
        super(n, a, p, e); 
    } 
    public String toString() { 
        return name + " Student"; 
    } 
} 
class Employee extends Person {
    String office; 
    double salary; 
    Date date_hired = new Date(); 
    public Employee(String n, String a, String p, String e, String o, double s) {  super(n, a, p, e); 
    this.office = o; 
    this.salary = s; 
    }
    public String toString() { 
        return name + " Employee"; 
    } 
} 
class Faculty extends Employee { 
    double work_hour; 
    String rank; 
    public Faculty(String n, String a, String p, String e, String o, double s, double w, String r) {  super(n, a, p, e, o, s); 
    this.work_hour = w;
    this.rank = r; 
    } 
    public String toString() { 
        return name + " Faculty"; 
    } 
} 
class Staff extends Employee { 
    String title; 
    public Staff(String n, String a, String p, String e, String o, double s, String t) {  super(n, a, p, e, o, s); 
    title = t; 
    } 
    public String toString() { 
    return name + " Staff"; 
    } 
} 
class PersonDatabase{ 
public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in); 
    Person p=new Person("John","Bihar","7890","abc@.com"); 
    System.out.println(p.toString());
    Student s = new Student("Raju", "UP", "15153894", "2121678@163.com");  System.out.println(s.toString()); 
    Employee e = new Employee("Pappu", "WB", "5467890", "78976@qq.com","room101",  399999); 
    System.out.println(e.toString()); 
    Faculty f = new Faculty("Bablu", "Delhi", "45678", "48500@qq.com","room201",1000000,  8, "leader"); 
    System.out.println(f.toString()); 
    Staff sta = new Staff("Vinod", "9990874", "467547489", "7489@qq.com","room001",  29000, "monitor"); 
    System.out.println(sta.toString()); 
    Person[] obj=new Person[10]; 
    obj[0]=new Person("Atif","Bihar","7890","abc@.com"); 
    obj[1]=new Person("Ram","UP","7890","abc@.com"); 
    obj[2]=new Person("Golu","West Bengal","7890","abc@.com"); 
    obj[3]=new Person("Sonu","Delhi","7890","abc@.com"); 
    obj[4]=new Person("Munni","Bihar","7890","abc@.com"); 
    for(int i = 5; i < 10; i++) 
            obj[i] = null; 
            int i = 0,choice; 
            do {  
            System.out.println("\n\t1. Input new student detail: "); 
            System.out.println("\t2. Delete any old student detail: ");
            System.out.println("\t3. Display any student detail: "); 
            System.out.println("\t4. Update any student details: "); 
            System.out.println("\t5. Exit"); 
            System.out.print("\n\tWhat do you want, please enter: "); 
            choice=sc.nextInt(); 
            switch(choice){ 
                case 1:{ 
                    obj[i] = new Person(); 
                    obj[i].input(); 
                    i++; 
                    System.out.println("\nSuccessful"); 
                    break; 
                } 
                case 2:{ 
                System.out.print("\tEnter name of student for deletion: "); 
                String r=sc.next(); 
                boolean flag1 = false; 
                for(int j = 0; obj[j] != null; j++){ 
                    if(obj[j].name == r){ 
                        flag1 = true; 
                        obj[j] = null;
                        System.out.println("\n\tSuccessful"); 
                        break; 
                    } 
                } 
                if(!flag1) 
                    System.out.println("\n\tNot Found!"); 
                break; 
                } 
                case 3:{ 
                    System.out.println("\tEnter name of student for display details: "); 
                    String r1=sc.next(); 
                    boolean flag2 = false; 
                    for(int j = 0; obj[j] != null; j++) 
                    { 
                    if(obj[j].name == r1) 
                    { 
                    flag2 = true; 
                    obj[j].display(); 
                    System.out.println("\n\t---DETAILS DISPLAYED SUCESSFULLY!---"); break; 
                    } 
                    } 
                    if(!flag2) 
                    System.out.println("\n\tName Not Found!");
                    break; 
                } 
                case 4: 
                { 
                    System.out.print("\tEnter name of student for update details: "); 
                    String r2=sc.next(); 
                    for(int j = 0; obj[j] != null; j++){ 
                        if(obj[j].name == r2){ 
                            obj[j].update(); 
                            System.out.println("---DETAILS UPDATED SUCCESSFULLY---"); 
                            break; 
                        } 
                    } 
                    break; 
                } 
                case 5: 
                { 
                    System.out.println("\tSuccessfully Exited: "); 
                    break; 
                } 
                default: 
                { 
                    System.out.println("Please enter correct input..."); 
                }
            } 
        }while(choice!=5);
    }
}
