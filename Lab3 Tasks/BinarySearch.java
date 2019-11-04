import java.util.Arrays;
public class BinarySearch{
    public static int charSearch(char []a,char key){
        int p=0;   //initializing p with 0
        int q=a.length-1;  //initializing q with 1 less than the length of array
        int i=-1;   //initially initializing with negative value
        while(p<=q){
            i=(p+q)/2;     //finding the index of midvalue
            if(a[i]==key){   
                return i;    //If value found return the index of that value
            }
            if(a[i]<key){    //We will search from the right side
                p=i+1;       //Now p has the index 1 greater from middle index
            }
            else{
                q=i-1;    //To search from left q has index one less from middle index
            }
        }
        return -i;    //If value not found return -ve i
    }

    public static int stringSearch(String []a,String key){
        int p=0;            //initializing p with 0
        int q=a.length-1;   //initializing q with 1 less than the length of array
        int i=-1;   //initially initializing with negative value

        int res;   //declaration 

        while(p<=q){
            i=(p+q)/2;      //finding the index of midvalue
            res= key.compareTo(a[i]);   //Compares two strings if they are equal returns 0, if string is
            if(res==0){                 //againts dictionary order returns +ve value and -ve value if in
                return i;               //dictionary order
            }
            if(res>0){    //We will search from the right side
                p=i+1;       //Now p has the index 1 greater from middle index
            }
            else{
                q=i-1;    //To search from left q has index one less from middle index
            }
        }
        return -i;    //if string not found returns -ve i
    }

    public static void main(String[]args)
    {
        String []arr={"Waqar","Ahmed","Abdul Nabi","Usama","Imtiaz","Uzair"};   //Initializes the String array
        char []c = {'a','u','i','e','o'};           //Initializes the Character Array
        String key1="Usama";    //String to search
        char key2='o';          //Character to search
        Arrays.sort(arr);   //Sorting the string array
        Arrays.sort(c);     //sorting the character array

        //Printing the sorted string array
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }

        //Printing the sorted character array
        for(int i=0;i<c.length;i++){
            System.out.println("arr["+i+"]= "+c[i]);
        }
        
        int index1=stringSearch(arr, key1);
        int index2=charSearch(c, key2);

        if(index1>0){
            System.out.println("String Found, index is "+index1);   //printing the index of String
        }
        else{
            System.out.println("String not found");         
        }

        if(index2>0){
            System.out.println("Character Found, index is "+index2);    //printing the index of Char
        }
        else{
            System.out.println("Character not found");
        }
    }
}