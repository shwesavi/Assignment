package tandemlooptest;

import java.util.Scanner;

public class Problem2 {
	public static void series(int a) {
int x=1;
		for(int i=1;i<=a;i++) {
				System.out.print(x+" ");
				x=x+2;
			}
		}
	

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	series(a);

	}

}
