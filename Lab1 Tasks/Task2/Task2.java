import java.util.*;
class Area{
    //instance variables
    private double length;
    private double breadth;

    //Method to set length and breadth of Rectangle
    public void setDim(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //Method which returns the area of Rectangle
    public double getArea(){
        return (length*breadth);
    }
}
public class Task2{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length=sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double breadth=sc.nextDouble();

        Area a = new Area();
        a.setDim(length,breadth);
        System.out.println("Area Of Rectangle: "+a.getArea());
    }
}