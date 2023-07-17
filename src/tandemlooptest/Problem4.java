package tandemlooptest;

import java.util.Scanner;

public class Problem4 {
public static void count(int[]a) {
	int num[]= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<num.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]%num[i]==0) {
				count++;
			}
		}
		System.out.print(num[i]+":"+count+", ");
	}
}
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int size=scan.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	count(a);
}
}
