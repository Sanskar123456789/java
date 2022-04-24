package simplilearn.array.tr;

import java.util.Scanner;

public class cal {
	public int result= 0;
	
	public void add(int a,int b) {
		this.result = a+b;
	}
	
	public void sub(int a,int b) {
		this.result = a-b;
	}
	
	public void mul(int a,int b) {
		this.result = a*b;
	}
	
	public void div(int a,int b) {
		this.result = a/b;
	}
	
	public void result() {
		System.out.println(this.result);
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Please choose the option \n1.Add\n2.Subtract\n3.Multiplication\n4.Division\n5.Exit");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a==5) {
				break;
			}
			cal obj = new cal();
			switch(a) {
				case 1: {
					System.out.println("Enter 1st no");
					int num1 = sc.nextInt();
					System.out.println("Enter 2nd no");
					int num2 = sc.nextInt();
					obj.add(num1, num2);
					obj.result();
					break;
				}
				
				case 2:{
					System.out.println("Enter 1st no");
					int num1 = sc.nextInt();
					System.out.println("Enter 2nd no");
					int num2 = sc.nextInt();
					obj.sub(num1, num2);
					obj.result();
					break;
				}
				case 3:{
					System.out.println("Enter 1st no");
					int num1 = sc.nextInt();
					System.out.println("Enter 2nd no");
					int num2 = sc.nextInt();
					obj.mul(num1, num2);
					obj.result();
					break;
				}
				case 4:{
					System.out.println("Enter 1st no");
					int num1 = sc.nextInt();
					System.out.println("Enter 2nd no");
					int num2 = sc.nextInt();
					obj.div(num1, num2);
					obj.result();
					break;
				}
				default:{
					System.out.println("Please choose valid option");
					break;
				}
			}
		}
	}
}
