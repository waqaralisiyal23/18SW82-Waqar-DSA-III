class ArrayAverage{        
    public float average(int []arr){        //method which returns the average 
        float sum=0;  //initializing the sum variable with zero which stores the sum of array
        for(int i=0;i<arr.length;i++){   
            sum+=arr[i];  //adds every element to sum variable
        }
        return (sum/arr.length); //returns the average of array
    }
}
public class Task4{
    public static void main(String[]args)
    {
        ArrayAverage array1 = new ArrayAverage();  //Creating the object of ArrayAverage class
        int []a = {5,6,3,4,3};      //Declaration and initialization of array
        System.out.print("Average= "+array1.average(a));   //Printing the average of array      
    }
}