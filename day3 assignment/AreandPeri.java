import java.util.Scanner; 
public class AreandPeri{ 
    int r, l, b, s1;
    double pi = 3.14,perimeter,area; 
    Scanner s = new Scanner(System.in); 
    void circle(){ 
        System.out.print("Enter radius of circle:");  r = s.nextInt(); 
        perimeter = 2 * pi * r; 
        area=pi*r*r; 
        System.out.println("Perimeter of circle: "+perimeter);  System.out.println("Area of circle: "+area); 
    }  
    void rectangle(){ 
        System.out.print("Enter length of rectangle:");  l = s.nextInt(); 
        System.out.print("Enter breadth of rectangle:");  b = s.nextInt(); 
        perimeter = 2 * (l + b); 
        area=l*b; 
        System.out.println("Perimeter of rectangle: "+perimeter); System.out.println("Area of rectangle: "+area); 
    } 
    void square(){ 
    System.out.print("Enter side of the square:");  s1 = s.nextInt();
    perimeter = 4*s1; 
    area=s1*s1; 
    System.out.println("Perimeter of square: "+perimeter); 
    System.out.println("Area of square: "+area); 
    } 
    public static void main(String[] args){ 
        AreandPeri obj = new AreandPeri(); 
        obj.circle(); 
        obj.rectangle(); 
        obj.square(); 
    } 
} 
