package hackerrank;

import java.util.Scanner;

public class RemoveGivenChar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        int i = 0;
	        String fullstring = sc.nextLine();
	        char ch = sc.next().charAt(0);
	        
	        char[] chararray = fullstring.toCharArray();
	        for(i =0; i<chararray.length; i++){
	            if(ch == chararray[i])
	                break;
	        }
	        
	        System.out.print(fullstring.substring(0, i));
	        System.out.println(fullstring.substring(++i));
	}

}
