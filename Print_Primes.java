package prepare;

import java.util.Scanner;

public class Print_Primes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0, i=1,j=1;
	for(i=1;i<=num;i++) {
		j=1;
		while(j<=i) {
			if(i%j==0) {
				sum++;
			}
			j++;
		}
		if(sum==2)
			System.out.println(i);
		sum=0;
	}
}
}
