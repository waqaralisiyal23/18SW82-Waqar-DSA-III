public class Task6{
    public static void main(String[]args)
    {
        int [][]A = {{3,5,9},{4,2,0},{8,6,10}};  //Declaraion and initialization of 2d array
        int temp;   //Temporary variable

        /*I used four for loops the first two loops will store first number(i.e A[0][0]) line by line and all elements 
        were checked with the stored number, if the current element is greater then the stored element then we will
        swap the elements, in first turn we will check all numbers with A[0][0]. Similary, in the next turn we will
        check all the numbers with A[0][1] then with A[0][2],A[1][0] and so on.*/

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                for(int x=0;x<A.length;x++){
                    for(int y=0;y<A[x].length;y++){
                        if(A[x][y]>A[i][j]){
                            temp=A[i][j];
                            A[i][j]=A[x][y];
                            A[x][y]=temp;
                        }
                    }
                }
            }
        }

        //Printing the 2d sorted array
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.println("A["+i+"]["+j+"]= "+A[i][j]);
            }
        }



        /* To sort only rows
        for(int i=0;i<A.length-1;i++){   //loop exutes 1 less than the length of array
            for(int j=0;j<A[i].length-1;j++){   //loop executes 1 less than the no. of columns at each index
                if(A[i][j]>A[i][j+1]){
                    temp=A[i][j];
                    A[i][j]=A[i][j+1];
                    A[i][j+1]=temp;
                }   
            }
            
        }

        for(int i=0;i<A.length;i++){   //loop exutes 1 less than the length of array
            for(int j=0;j<A[i].length;j++){   //loop executes 1 less than the no. of columns at each index
                System.out.println("A["+i+"]["+j+"]= "+A[i][j]);
            }
        }*/
    }
}