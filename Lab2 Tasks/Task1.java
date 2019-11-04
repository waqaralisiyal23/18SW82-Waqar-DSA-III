import java.util.Random;
public class Task1{
    public static void main(String[]args)
    {
        Random rd = new Random();   //creating object of random class
        int []arr= new int[100];    //declaration and intialization of array
        for(int i=0;i<arr.length;i++){       //loop executes 100 times
            arr[i]=rd.nextInt();     //populating array with random numbers
        }
    }
}