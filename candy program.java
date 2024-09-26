import java.util.Scanner;
import java.util.Arrays;
public class Candy
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
		System.out.println("Enter the candies");
		int c=s.nextInt();
		System.out.println("Enter the no of persons");
		int p=s.nextInt();
		int a[]= new int[p];
		 int i=0,j=0;
		while(c>0){
		   
		    i=i+1;
		    if(c>=i){
		        a[j%p]=a[j%p]+i;
		        j++;
		        c=c-i;
		    }
		    else{
		    a[j%p]=a[j%p]+c;
		    c=0;
		    }
		}
		System.out.println(Arrays.toString(a));
	}
}
