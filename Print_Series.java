package prepare;

import java.util.Scanner;

public class Print_Series {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1 =sc.nextInt();
	int num2=sc.nextInt();
	int num=0,i=1,cnt=1;
	while(cnt<=num1) {
		num=3*i+2;
		if(num%num2!=0) {
			System.out.println(num);
			cnt+=1;
		}
		i++;
	}
}
}
