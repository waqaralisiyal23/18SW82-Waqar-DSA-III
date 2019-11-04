import java.util.*;
class Area{
    //instance variables
    private double length;
    private double breadth;

    //Constructor to set the values of length and breadth
    public Area(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //Method which returns area of Rectangle
    public double returnArea(){
        return (length*breadth);
    }
}
public class Task3{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length=sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double breadth=sc.nextDouble();

        Area a = new Area(length,breadth);
        System.out.println("Area Of Rectangle: "+a.returnArea());
    }
}