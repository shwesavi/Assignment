package tandemlooptest;

import java.util.Scanner;

public class Problem3 {
public static void series2(int a) {
	int x=1;
	int y=1;
	
	if(a%2==1) {
	for(int i=1;i<=a;i++) {
			System.out.println(x+" ");
	x=x+2;
	}
	}

else {
	for(int i=1;i<a;i++) {
		System.out.println(y+" ");
		y=y+2;
}
}
}

public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	series2(a);
}
}
