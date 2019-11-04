public class Task2{
    public static void main(String[]args)
    {
        int []arr1 = {5,7,2,3,4,9};     //Declaration and initialization of array1
        int []arr2 = {5,7,2,3,4,9};     //Declaration and initialization of array2

        int count=0;    //For checking array is same or not. If count equals length of any array then arrays are same

        //Checking first that both arrays have the same size or not
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){     //Loop will be executed 1 less than the length of any array 1 or 2 
                if(arr1[i]==arr2[i]){           //Checking each element of array whether it is same or not
                    count++;        //if elements of arrays are same at the same index the count will increase
                }
            }
            if(count==arr1.length){   //you can check counter with length of any array
                System.out.println("Arrays are same");    
            }
            else{
                System.out.println("Arrays are not same");
            }
        }
        else{
            System.out.println("Arrays are not same");
        }
    }
}