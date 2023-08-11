package prepare;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int digit=sc.nextInt();
	int count=0,s=0;
	while(num!=0) {
		s=num%10;
		num=num/10;
		if(s==digit)
			count++;
	}
	System.out.print(count);
}
}
