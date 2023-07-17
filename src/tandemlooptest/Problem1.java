package tandemlooptest;

import java.util.Scanner;

public class Problem1 {
	public static void calculator(double a, double b, String typeofoperation) {
		double res=0;
		switch(typeofoperation) {
		case "+":res=a+b;
		break;
		case "-":res=a-b;
		break;
		case "*":res=a*b;
			break;
		case "/":res=a/b;
		break;
		default:System.out.println("please enter valid input");
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		String typeofoperation=scan.next();
		calculator(a,b,typeofoperation);
	}

}
