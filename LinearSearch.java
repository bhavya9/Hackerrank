package hackerrank;

import java.util.Scanner;

public class LinearSearch {
	
	public static void insertIntoSorted(int[] ar ,int s) {
        int temp,i,j;
        for(i=1;i<s;i++)
            {
            temp=ar[i];
            j=i-1;
            while(temp< ar[j] && j>=0 )
                {
                ar[j+1]= ar[j];
                j=j-1;
            }
            ar[j+1]=temp;
        }
         
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar ,s);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
   
	}

}
