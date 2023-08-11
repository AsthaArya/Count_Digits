package prepare;

import java.util.Scanner;

public class Check_prime {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=1, sum=0,count=0;
	while(num>=i){
	    if(num%i==0)
	    count++;
	    i++;
	}
	       if(count==2)
	         System.out.println("Prime");
	       else 
	       System.out.println("Not Prime");
}
}