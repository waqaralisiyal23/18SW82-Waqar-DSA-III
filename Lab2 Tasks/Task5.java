import java.util.ArrayList;

public class Task5{
    public static int secondLargestValueIndex(int []arr){
        ArrayList<Integer> list = new ArrayList<>();   
        int max=arr[0];   //stores the first element of array
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){   
                max=arr[i];
                list.add(i);
            }
        }
        return (list.get(list.size()-2));  //returns the index
    }
    public static void main(String[]args)
    {
        int []arr = {5,8,2,10,12,16,7,9};   //Declaration and initialization 
        System.out.println("Index of Second Largest Element: "+secondLargestValueIndex(arr));  //prints the index
    }
}