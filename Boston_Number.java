package prepare;

import java.util.Scanner;

public class Boston_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int backup=num;
	int div=2,sum1=0,sum2=0,digit=0,rem=0,i=0;
	while(div<=num) {
		while(num%div==0) {
			num/=div;
			i=div;
			while(i>0) {
				rem=i%10;
				sum1+=rem;
				i/=10;
			}
		}
		div++;
	}
	while(backup>0) {
		digit=backup%10;
		backup/=10;
		sum2+=digit;
	}
	if(sum1==sum2) 
	System.out.println("1");
	else System.out.println("0");
}
	 
}
